package ru.bainc.main.comparable;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
@Override
    public int compare(Employee employee1,Employee employee2){
    if (employee1.getSalary() == employee2.getSalary()){
        return 0;
    }
    if (employee1.getSalary()< employee2.getSalary()){
        return -1;
    } else {
        return 1;
    }
}
}
