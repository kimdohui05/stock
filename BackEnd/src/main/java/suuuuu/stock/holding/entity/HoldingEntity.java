package suuuuu.stock.holding.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import suuuuu.stock.stock.stocklist.entity.StockListEntity;
import suuuuu.stock.user.entity.UserEntity;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "holding")
public class HoldingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private StockListEntity stockList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(nullable = false)
    private Long quantity;
}
