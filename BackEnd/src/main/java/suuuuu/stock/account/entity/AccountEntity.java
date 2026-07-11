package suuuuu.stock.account.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import suuuuu.stock.user.entity.UserEntity;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "account")

public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private Long balance;

    @Column (unique = true,  nullable = false)
    private String accountNumber;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private UserEntity user;
}
