package Week_3.SpringData_JDA.src.main.java.service;

import model.Stock;
import repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStockByCodeAndDateRange(String code, Date start, Date end) {
        return stockRepository.findByCodeAndDateBetween(code, start, end);
    }

    public List<Stock> getStockByCodeAndCloseGreaterThan(String code, float close) {
        return stockRepository.findByCodeAndCloseGreaterThan(code, close);
    }

    public List<Stock> getTop3ByVolume() {
        return stockRepository.findTop3ByOrderByVolumeDesc();
    }

    public List<Stock> getTop3LowestClose() {
        return stockRepository.findTop3ByOrderByCloseAsc();
    }
}
