package suuuuu.stock.user.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class UserRegisterRequestDto {

    private String password;
    private String userId;
    private String phoneNUmber;
    private String name;
}
