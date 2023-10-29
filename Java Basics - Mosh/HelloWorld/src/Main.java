public class Main {
    public static void main(String[] args) {
       var employee = new Employee();
       employee.setBaseSalary(500_000);
       employee.setHourlyRate(20);
       int wage = employee.calculateWage(11);
        System.out.println(wage);
    }

}