package lab1;

public class Employee {
    String name;
    int employee_number;
    double wages_per_hour;
    int number_of_hours_worked_per_week;
    protected double weekly_salary;

    Employee(String name, int employee_number, int number_of_hours_worked_per_week, double wages_per_hour){
        this.name = name;
        this.employee_number = employee_number;
        this.number_of_hours_worked_per_week = number_of_hours_worked_per_week;
        this.wages_per_hour = wages_per_hour;
    }

    public double getWages_per_hour() {
        return wages_per_hour;
    }

    public int getNumber_of_hours_worked_per_week() {
        return number_of_hours_worked_per_week;
    }

    public void calculate_salary(){
        this.weekly_salary = this.getNumber_of_hours_worked_per_week() * this.getWages_per_hour();
    }

    public void print_details(){
        System.out.println("\tEmployee details");
        System.out.println("__________________________");
        System.out.printf("Name: %s%n", this.name);
        System.out.printf("Employee number: %d%n", this.employee_number);
        System.out.printf("Number of hours worked: %d%n", this.number_of_hours_worked_per_week);
        System.out.printf("Hourly wage: %.2f%n", this.wages_per_hour);
        System.out.printf("Salary: %.2f%n", this.weekly_salary);
    }
}
