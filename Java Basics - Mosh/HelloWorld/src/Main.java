public class Main {
    public static void main(String[] args) {
       var employee = new Employee();
       employee.setBaseSalary(500_000);
       employee.setHourlyRate(21);
       int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}