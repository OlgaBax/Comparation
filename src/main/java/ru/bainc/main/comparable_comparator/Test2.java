package ru.bainc.main.comparable_comparator;

import ru.bainc.main.comparable.Employee;
import ru.bainc.main.comparable.SalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new ru.bainc.main.comparable.Employee(100, "Zaur", "Tregulov",12345 );
        Employee employee2 = new ru.bainc.main.comparable.Employee(15, "Ivan", "Petrov",6542);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov",8542 );
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sprting \n" + list);

    }
}
