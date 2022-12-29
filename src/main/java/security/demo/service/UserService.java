package security.demo.service;


import org.springframework.stereotype.Service;
import security.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void login() {
        // 입력한 비밀번호와 저장된 비밀번호 비교
    }
}
