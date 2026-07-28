package suuuuu.stock.stock.stocklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suuuuu.stock.stock.stocklist.entity.StockListEntity;

public interface  StockListRepository extends JpaRepository <StockListEntity, Long> {

}
