package lab1;

public class Trainee extends Employee{
    public int training_hours;
    public Trainee(String name, int emloyee_number, int number_of_hours_worked_per_week, double wages_per_hour, int training_hours){
        super(name, emloyee_number, number_of_hours_worked_per_week, wages_per_hour);
        this.training_hours = training_hours;
    }

    @Override
    public void calculate_salary() {
        super.calculate_salary();
        this.weekly_salary += training_hours * 5;
    }

    @Override
    public void print_details() {
        super.print_details();
        System.out.printf("Training hours: %d%n", this.training_hours);

    }
}
