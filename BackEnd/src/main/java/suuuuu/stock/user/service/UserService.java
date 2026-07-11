package suuuuu.stock.user.service;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import suuuuu.stock.user.dto.UserRegisterRequestDto;
import suuuuu.stock.user.repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void register (UserRegisterRequestDto userRegisterRequestDto) {

    }
}

