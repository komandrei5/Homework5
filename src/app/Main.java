package app;

import app.entity.Employee;
import app.entityOna.SameName;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", "Manager",
                "johndoe@example.com", 511515515, 30);


        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhoneNumber());
        System.out.println("Вік: " + employee.getAge());
        System.out.println();

        Employee employee2 = new Employee("John Mit", "Worker",
                "johndewfoe@example.com", 511515515, 70);


        System.out.println("ПІБ: " + employee2.getFullName());
        System.out.println("Посада: " + employee2.getPosition());
        System.out.println("Email: " + employee2.getEmail());
        System.out.println("Телефон: " + employee2.getPhoneNumber());
        System.out.println("Вік: " + employee2.getAge());
        System.out.println();


        SameName.print();
        app.entityTwo.SameName.print();
        System.out.println();

        Car car = new Car();
        car.start();
    }
}