public class Main {
    public static void main(String[] args) {
       var employee = new Employee();
       employee.setBaseSalary(-1);
       employee.hourlyRate = 21;
       int wage = employee.calculateWage(11);
        System.out.println(wage);
    }

}