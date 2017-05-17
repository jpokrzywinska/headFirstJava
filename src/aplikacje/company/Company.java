package aplikacje.company;

import javafx.geometry.Pos;

import java.util.*;

/**
 * Created by jpokr on 2017-05-06.
 */
public class Company {

    Map<Employee, Position> employees;

    public Company() {

        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee, Position position) {

        employees.put(employee, position);
    }

    public void deleteEmployee(Employee employee) {

        employees.remove(employee);
    }

    public void fireRandomEmployee() {

        Random random = new Random();
        int randomNumber = random.nextInt(employees.size());

        // Set to rodzaj kolekcji o typie Employee(przechowuje UNIKALNYCH pracownikow), ta lista zawiera wszystkie klucze
        Set<Employee> employeeSet = employees.keySet();

        // Tworzyymy tablice z wszystkimi kluczami
        Employee[] employeeArray = (Employee[]) employeeSet.toArray();

        employees.remove(employeeArray[randomNumber]);
    }


}
