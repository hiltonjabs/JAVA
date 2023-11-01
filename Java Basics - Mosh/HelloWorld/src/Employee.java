public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee (int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
      return baseSalary + (getHourlyRate() * extraHours);
    }
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("The Salary cannot be 0 or less. ");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
