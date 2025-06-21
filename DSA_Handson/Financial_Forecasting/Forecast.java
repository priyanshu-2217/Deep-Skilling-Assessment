package Financial_Forecasting;

public class Forecast {

    // Recursive method to calculate future value
    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000; // starting value in rupees
        double growthRate = 0.10;    // 10% annual growth
        int years = 5;

        double futureValue = predictValue(initialValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f", years, futureValue);
    }
}
