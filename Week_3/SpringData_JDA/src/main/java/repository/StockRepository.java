package Week_3.SpringData_JDA.src.main.java.repository;

import model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCodeAndDateBetween(String code, Date start, Date end);

    List<Stock> findByCodeAndCloseGreaterThan(String code, float close);

    List<Stock> findTop3ByOrderByVolumeDesc();

    List<Stock> findTop3ByOrderByCloseAsc();
}
