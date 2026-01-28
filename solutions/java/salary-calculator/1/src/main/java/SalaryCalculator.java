public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean expr = daysSkipped < 5;
        double value = expr ? 1.0 : 0.85;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        boolean expected = productsSold < 20;
        int multiplier = expected ? 10 : 13;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.00;
        double salary = baseSalary * salaryMultiplier( daysSkipped) + bonusForProductsSold(productsSold);
        
        return salary > 2000.00 ? 2000.00 : salary;
    } 
}
