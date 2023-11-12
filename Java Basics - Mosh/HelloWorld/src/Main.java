public class Main {
    public static void main(String[] args) {
        new Employee(60_000);
        var employee = new Employee(60_000,20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        System.out.println("hello world");
    }

}
