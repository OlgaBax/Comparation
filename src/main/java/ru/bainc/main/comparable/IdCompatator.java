package ru.bainc.main.comparable;

import java.util.Comparator;

public class IdCompatator implements Comparator <Employee>  {

    @Override
    public int compare(Employee employee1, Employee employee2) {
                if (employee1.getId() == employee2.getId()) {
            return 0;
        }
        if (employee1.getId() < employee2.getId()) {
            return -1;
        } else {
            return 1;
        }
         }
}
