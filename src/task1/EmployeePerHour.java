package task1;

public class EmployeePerHour implements Salary {


    private int hoursPerDay;
    private int salaryPerHour;

    @Override
    public int salary() {
        return salaryPerHour * hoursPerDay * workingDays;
    }

    public int getSalary() {
        return salary();
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }
}
