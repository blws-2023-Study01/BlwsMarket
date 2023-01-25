import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public User register(AuthRequest authRequest) {
        if (userDao.findByEmail(authRequest.getEmail()) != null) {
            throw new EmailExistException("Email already exists");
        }
        User user = new User();
        user.setEmail(authRequest.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(authRequest.getPassword()));
        return userDao.save(user);
    }

    @Override
    public User login(AuthRequest authRequest) {
        User user = userDao.findByEmail(authRequest.getEmail());
        if (user == null || !bCryptPasswordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
            throw new BadCredentialsException("Invalid email or password");
        }
        return user;
    }

    @Override
    public User getCurrentUser(String token) {
        Long userId = jwtTokenProvider.getUserIdFromJWT(token);
        return userDao.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }
}