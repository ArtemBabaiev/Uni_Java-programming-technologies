/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 9
 * @date 03.04.2022 15:07
 * @class Residence
 */
public class Residence {
    private String city;
    private String street;
    private String number;

    public Residence() {
    }

    public Residence(String city, String street, String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
