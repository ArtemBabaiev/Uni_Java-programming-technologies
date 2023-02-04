import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 20.03.2022 19:28
 * @class Person
 */
public class Person {
    private String firstName;
    private String lastName;
    private Sex sex;
    private LocalDate dateOfBirth;
    private String citizenship;
    private String phoneNumber;
    private double height;
    private String address;

    public Person() {
    }

    public Person(String firstName, String lastName, Sex sex, LocalDate dateOfBirth, String citizenship, String phoneNumber, double height, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.address = address;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getYear() < dateOfBirth.getYear()){
            return -1;
        }
        else if (currentDate.getYear() == dateOfBirth.getYear()){
            return 0;
        }
        else{
            return Period.between(dateOfBirth, currentDate).getYears();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "\n\t firstName='" + firstName + '\'' +
                ",\n\t lastName='" + lastName + '\'' +
                ",\n\t sex=" + sex +
                ",\n\t dateOfBirth=" + dateOfBirth +
                ",\n\t citizenship='" + citizenship + '\'' +
                ",\n\t phoneNumber='" + phoneNumber + '\'' +
                ",\n\t height=" + height +
                ",\n\t address='" + address + '\'' +
                "\n"+ '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.getHeight(), getHeight()) == 0
                && Objects.equals(getFirstName(), person.getFirstName())
                && Objects.equals(getLastName(), person.getLastName())
                && getSex() == person.getSex()
                && Objects.equals(getDateOfBirth(), person.getDateOfBirth())
                && Objects.equals(getCitizenship(), person.getCitizenship())
                && Objects.equals(getPhoneNumber(), person.getPhoneNumber())
                && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSex(), getDateOfBirth(), getCitizenship(), getPhoneNumber(), getHeight(), getAddress());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
