import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User register(AuthRequest authRequest);
    User login(AuthRequest authRequest);
    User getCurrentUser(String token);
}