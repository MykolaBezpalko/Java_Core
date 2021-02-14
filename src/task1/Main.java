package task1;

public class Main {
    public static void main(String[] args) {
        EmployeePerHour employee1 = new EmployeePerHour();
        EmployeePerHour employee2 = new EmployeePerHour();
        EmployeesPerMonth employeesPerMonth1 = new EmployeesPerMonth();
        EmployeesPerMonth employeesPerMonth2 = new EmployeesPerMonth();

        employee1.setHoursPerDay(10);       employeesPerMonth1.setSalaryPerDay(400);
        employee1.setSalaryPerHour(100);    employeesPerMonth2.setSalaryPerDay(380);
        employee2.setHoursPerDay(8);
        employee2.setSalaryPerHour(150);

        System.out.println("Погодинні працівники:");
        System.out.println("ПЕРШИЙ працівник заробляє " + employee1.getSalaryPerHour() + " UAH за годину " +
                "і отримує зарплату " + employee1.getSalary() + " UAH в місяць." );
        System.out.println("ДРУГИЙ працівник заробляє " + employee2.getSalaryPerHour() + " UAH за годину " +
                "і отримує зарплату " + employee2.getSalary() + " UAH в місяць." );
        System.out.println();
        System.out.println("Працівники з фіксованою ставкою:");
        System.out.println("ПЕРШИЙ працівник заробляє " + employeesPerMonth1.getSalaryPerDay() + " UAH за день " +
                "і отримує зарплату " + employeesPerMonth1.getSalary() + " UAH в місяць." );
        System.out.println("ДРУГИЙ працівник заробляє " + employeesPerMonth2.getSalaryPerDay() + " UAH за день " +
                "і отримує зарплату " + employeesPerMonth2.getSalary() + " UAH в місяць." );
    }
}
