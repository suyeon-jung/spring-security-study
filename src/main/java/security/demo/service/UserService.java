package security.demo.service;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import security.demo.dto.UsersReqDTO;
import security.demo.repository.UserRepository;
import security.demo.user.Users;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    public void signUp(UsersReqDTO usersReqDTO) {

        // 입력한 비밀번호와 저장된 비밀번호 비교
        System.out.println(usersReqDTO.toString());

        String encodedPassword = bCryptPasswordEncoder.encode(usersReqDTO.getPassword());
        // 회원 추가
        Users newUser = Users.builder()
                        .email(usersReqDTO.getEmail())
                        .password(encodedPassword)
                        .build();

        userRepository.save(newUser);

    }
}
