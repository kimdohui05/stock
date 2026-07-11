package suuuuu.stock.stock.stockprice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import suuuuu.stock.stock.stocklist.entity.StockListEntity;

@Entity
@NoArgsConstructor
@Getter
@Table (name = "stockprice")
public class StockPriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private Long stockOpen;

    @Column (nullable = false)
    private Long stockHigh;

    @Column (nullable = false)
    private Long stockLow;

    @Column (nullable = false)
    private Long stockClose;

    @Column (nullable = false)
    private Long stockVolume;

    @ManyToOne
    @JoinColumn (name = "stock_id")
    private StockListEntity stockList;
}
