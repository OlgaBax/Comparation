package ru.bainc.main.comparable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Employee {
//      implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    /**
     * конструктор создает сотрудника
     * @param id
     * @param name
     * @param surname
     * @param salary
     */
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }}

//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        if (this.getId() == anotherEmployee.id) {
//            return 0;
//        }
//        if (this.getId() < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

//        return this.getId() - anotherEmployee.id;
//        int result = this.getName().compareTo(anotherEmployee.name);
////                                                          объекты класса стринг сортируются
//// естественным путем(по алфавиту) встроенным функциональным методом
//// compareTo
//        if (result == 0) {
//            result = this.getSurname().compareTo(anotherEmployee.surname);
//        }
//        return result;
//    }
//}
