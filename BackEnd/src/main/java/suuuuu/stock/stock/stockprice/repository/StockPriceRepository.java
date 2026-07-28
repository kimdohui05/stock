package suuuuu.stock.stock.stockprice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suuuuu.stock.stock.stockprice.entity.StockPriceEntity;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {

}