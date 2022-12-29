package security.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import security.demo.dto.UsersReqDTO;
import security.demo.service.UserService;
import security.demo.user.Users;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody UsersReqDTO usersReqDTO) {
        System.out.println(usersReqDTO.toString());
    }
}
