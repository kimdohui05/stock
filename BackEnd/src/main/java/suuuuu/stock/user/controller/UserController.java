package suuuuu.stock.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import suuuuu.stock.user.dto.UserLoginRequestDto;
import suuuuu.stock.user.dto.UserRegisterRequestDto;
import suuuuu.stock.user.service.UserService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public void register (@RequestBody UserRegisterRequestDto userRegisterRequestDto) {
        userService.register(userRegisterRequestDto);
    }

    @PostMapping("/login")
    public String login (@RequestBody UserLoginRequestDto userLoginRequestDto) {
        userService.login(userLoginRequestDto);

        return userService.login(userLoginRequestDto);
    }
}



