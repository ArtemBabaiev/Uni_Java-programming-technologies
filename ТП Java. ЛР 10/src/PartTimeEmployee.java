/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 10
 * @date 10.04.2022 16:10
 * @class PartTimeEmployee
 */
public class PartTimeEmployee implements IEmployee{
    private String name;
    private int hours;
    private int rate;

    public PartTimeEmployee(String name, int hours, int rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public PartTimeEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int getMonthSalary() {
        return getHours()*getRate();
    }
}
