package suuuuu.stock.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class UserLoginRequestDto {
    private String password;
    private String userId;
}
