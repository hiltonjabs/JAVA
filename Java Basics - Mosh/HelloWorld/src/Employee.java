public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
      return baseSalary + (hourlyRate * extraHours);
    }
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("The Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }
}
