package security.demo.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import security.demo.user.Users;

@Data
@NoArgsConstructor
public class UsersReqDTO {

    private String email;
    private String password;

    public Users toEntity() {
        return Users.builder()
                .email(email)
                .password(password)
                .build();
    }

}
