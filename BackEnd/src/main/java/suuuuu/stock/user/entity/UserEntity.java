package suuuuu.stock.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 빈 생성자 자동으로 생성
@Getter // 매서드 자동 생성
@Setter
@Entity // entity 인식
@Table(name = "user") // table 이름

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,  nullable = false)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(unique = true,  nullable = false)
    private String phoneNumber;
}
