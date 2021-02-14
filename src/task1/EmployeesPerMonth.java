package task1;

public class EmployeesPerMonth implements Salary {
    private int salaryPerDay;

    @Override
    public int salary() {
        return salaryPerDay * workingDays;
    }

    @Override
    public int getSalary() {
        return salary();
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }
}
