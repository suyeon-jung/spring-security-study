package security.demo.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsersReqDTO {

    private String email;

    private String password;

}
