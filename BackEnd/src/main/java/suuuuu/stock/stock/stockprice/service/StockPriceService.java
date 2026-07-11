package suuuuu.stock.stock.stockprice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import suuuuu.stock.stock.stockprice.repository.StockPriceRepository;

@RequiredArgsConstructor
@Service
public class StockPriceService {

    private final StockPriceRepository stockPriceRepository;
}
