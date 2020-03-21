package lab1;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alan", 123, 40, 15.00);
        Trainee tr1 = new Trainee("Leon", 456, 30, 10, 10);

        tr1.print_details();

        tr1.calculate_salary();

        tr1.print_details();

    }
}
