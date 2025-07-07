package Week_3.SpringData_JDA.src.main.java;

import exception.CountryNotFoundException;
import model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication(scanBasePackages = { "model", "repository", "service", "exception" })
public class OrmLearnApplication {
    private static EmployeeService employeeService;


    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testAddCountry();
        testGetAllCountries();
        testFindCountryByCode();
        testUpdateCountry();
        testFindByKeyword();
        testDeleteCountry();
    }

    private static void testAddCountry() {
        countryService.addCountry(new Country("ZZ", "Zootopia"));
    }

    private static void testGetAllCountries() {
        List<Country> list = countryService.getAllCountries();
        list.forEach(System.out::println);
    }

    private static void testFindCountryByCode() throws CountryNotFoundException {
        System.out.println("Find: " + countryService.findCountryByCode("ZZ"));
    }

    private static void testUpdateCountry() throws CountryNotFoundException {
        countryService.updateCountry("ZZ", "Zootopia Updated");
        System.out.println("Updated: " + countryService.findCountryByCode("ZZ"));
    }

    private static void testFindByKeyword() {
        countryService.findByNameContaining("oo").forEach(System.out::println);
    }

    private static void testDeleteCountry() {
        countryService.deleteCountry("ZZ");
    }
    private static void testGetStocksOfCompanyInSep2019() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = sdf.parse("2019-09-01");
            Date end = sdf.parse("2019-09-30");
            stockService.getStockByCodeAndDateRange("FB", start, end).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testGetStocksWithClosePriceGreaterThan() {
        stockService.getStockByCodeAndCloseGreaterThan("GOOGL", 1250f)
                .forEach(System.out::println);
    }

    private static void testTop3StocksByVolume() {
        stockService.getTop3ByVolume().forEach(System.out::println);
    }

    private static void testTop3StocksByLowestClose() {
        stockService.getTop3LowestClose().forEach(System.out::println);
    }
    private static void testGetEmployee() {
        Employee emp = employeeService.get(1);
        System.out.println(emp);
        System.out.println("Skills: " + emp.getSkillList());
    }

    private static void testAssignSkillToEmployee() {
        employeeService.assignSkillToEmployee(1, 2);
        System.out.println("Skill assigned.");
    }


}
