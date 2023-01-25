import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080/api'
});

export const register = (authRequest) => api.post('/users/register', authRequest);
export const login = (authRequest) => api.post('/users/login', authRequest);
export const getCurrentUser = (token) => api.get('/users/me', { headers: { Authorization: token } });