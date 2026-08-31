package suuuuu.stock.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import suuuuu.stock.user.dto.UserLoginRequestDto;
import suuuuu.stock.user.dto.UserRegisterRequestDto;
import suuuuu.stock.user.entity.UserEntity;
import suuuuu.stock.user.repository.UserRepository;

@RequiredArgsConstructor
@Service

public class UserService {
    private final UserRepository userRepository;

    public void register(UserRegisterRequestDto userRegisterRequestDto) {

        if (userRepository.existsByUserId(userRegisterRequestDto.getUserId())) {
            throw new IllegalArgumentException("사용중인 아이디입니다.");
        }

        UserEntity user = UserEntity.builder()
                .userId(userRegisterRequestDto.getUserId())
                .password(userRegisterRequestDto.getPassword())
                .phoneNumber(userRegisterRequestDto.getPhoneNumber())
                .name(userRegisterRequestDto.getName())
                .build();

        userRepository.save(user);
    }

    public String login (UserLoginRequestDto userLoginRequestDto) {

        UserEntity user = userRepository.findByUserId(userLoginRequestDto.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 아이디입니다."));

        if (!user.getPassword().equals(userLoginRequestDto.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        return user.getName();
    }
}
