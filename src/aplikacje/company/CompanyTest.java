package aplikacje.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by jpokr on 2017-05-06.
 */
public class CompanyTest {

    Company company = new Company();

    @Test
    public void testAddEmployee() {
        Employee justyna = new Employee("Justyna", "Pokrzywinska", 2500.0);
        company.addEmployee(justyna, Position.HEAD);
        Assert.assertTrue(company.employees.containsKey(justyna));
        Assert.assertEquals(Position.HEAD,company.employees.get(justyna));
    }

}
