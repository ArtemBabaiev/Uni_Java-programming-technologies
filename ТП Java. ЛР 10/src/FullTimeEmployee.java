/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 10
 * @date 10.04.2022 16:10
 * @class FullTimeEmployee
 */
public class FullTimeEmployee implements IEmployee{
    private String name;
    private int wage;

    public FullTimeEmployee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public FullTimeEmployee() {
    }

    public int getWage() {
        return wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public int getMonthSalary() {
        return getWage();
    }
}
