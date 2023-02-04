import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 10
 * @date 10.04.2022 16:07
 * @class Main
 */

/*
* Створити класи по варіанту і скористатися колекцією List і stream API для виконання
* якихось дій над елементами списку
* (в прикладі на лекції був пошук максимального, мінімального, середнього значення і т.ін.)
За номером в підгрупі або останньою цифрою студентського квитка:
1. Робітники (помісячна і погодинна зарплата)
* */
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee ft1 = new FullTimeEmployee("fred", 1000);
        FullTimeEmployee ft2 = new FullTimeEmployee("barney", 1500);
        FullTimeEmployee ft3 = new FullTimeEmployee("ted", 1500);
        FullTimeEmployee ft4 = new FullTimeEmployee("lilly", 1100);
        FullTimeEmployee ft5 = new FullTimeEmployee("tom", 1200);

        PartTimeEmployee pt1 = new PartTimeEmployee("john", 78, 11);
        PartTimeEmployee pt2 = new PartTimeEmployee("archibald", 36, 15);
        PartTimeEmployee pt3 = new PartTimeEmployee("harry", 120, 12);
        PartTimeEmployee pt4 = new PartTimeEmployee("marry", 10, 14);
        PartTimeEmployee pt5 = new PartTimeEmployee("tony", 76, 14);

        List<IEmployee> employees = new ArrayList<>(
                Arrays.asList(ft1, ft2, ft3, ft4, ft5, pt1, pt2, pt3, pt4, pt5)
        );

        employees.forEach(emp -> System.out.println(emp.getName() + " -- " + emp.getMonthSalary()));
        System.out.println("********************************************************************************************");
        System.out.println("Total salary of a month: ");
        System.out.println(getSumOfSalary(employees));

        System.out.println("********************************************************************************************");


        //max block
        System.out.println("The highest salary: " + getMaxSalary(employees));
        System.out.println("The highest salary employee: " + findEmployeeWithHighestSalary(employees));
        System.out.println("********************************************************************************************");


        //min block
        System.out.println("The lowest salary: " + getMinSalary(employees));
        System.out.println("The lowest salary employee: " + findEmployeeWithLowestSalary(employees));

        System.out.println("********************************************************************************************");

        System.out.println("The average salary: ");
        System.out.println(getAverageSalary(employees));
        System.out.println("********************************************************************************************");

        System.out.println("More salary gets: " + getWhoMore(employees));

    }

    public static int getSumOfSalary(List<IEmployee> employees){
        return employees.stream().mapToInt(IEmployee::getMonthSalary).sum();
    }

    public static int getMaxSalary(List<IEmployee> employees){
        return employees.stream().mapToInt(IEmployee::getMonthSalary).max().orElse(-1);
    }

    public static String findEmployeeWithHighestSalary(List<IEmployee> employees){
        int maxSalary = getMaxSalary(employees);
        List<IEmployee> maxEmployees = employees.stream()
                .filter(p -> p.getMonthSalary()== maxSalary)
                .collect(Collectors.toList());
        String result = maxEmployees.stream().map(IEmployee::getName).collect(Collectors.joining(", "));
        return result;

    }

    public static int getMinSalary(List<IEmployee> employees){
        return employees.stream().min(Comparator.comparing(IEmployee::getMonthSalary)).get().getMonthSalary();
    }

    public static String findEmployeeWithLowestSalary(List<IEmployee> employees){
        int minSalary = getMinSalary(employees);
        List<IEmployee> minEmployees = employees.stream()
                .filter(p -> p.getMonthSalary()== minSalary)
                .collect(Collectors.toList());
        String result = minEmployees.stream().map(IEmployee::getName).collect(Collectors.joining(", "));
        return result;
    }

    public static double getAverageSalary(List<IEmployee> employees){
        return employees.stream().mapToInt(IEmployee::getMonthSalary).average().orElse(-1);
    }
    public static String getWhoMore(List<IEmployee> employees){
        int ftSalary;
        int ptSalary;
        ftSalary = employees.stream().filter(emp -> emp.getClass() == FullTimeEmployee.class).mapToInt(IEmployee::getMonthSalary).sum();
        ptSalary = employees.stream().filter(emp -> emp.getClass() == PartTimeEmployee.class).mapToInt(IEmployee::getMonthSalary).sum();
        return ftSalary == ptSalary ? "Both equal": ftSalary > ptSalary ? "Full-Time": "Part-Time";
    }
}
