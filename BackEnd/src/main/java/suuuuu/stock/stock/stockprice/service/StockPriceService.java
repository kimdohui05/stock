package suuuuu.stock.stock.stockprice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import suuuuu.stock.stock.stocklist.entity.StockListEntity;
import suuuuu.stock.stock.stocklist.repository.StockListRepository;
import suuuuu.stock.stock.stockprice.entity.StockPriceEntity;
import suuuuu.stock.stock.stockprice.repository.StockPriceRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StockPriceService {

    private final StockPriceRepository stockPriceRepository;
    private final StockListRepository stockListRepository;

    public void updatePrice() {
        List<StockListEntity> stockList = stockListRepository.findAll();

        for (StockListEntity stock : stockList) {

        }
    }
}
