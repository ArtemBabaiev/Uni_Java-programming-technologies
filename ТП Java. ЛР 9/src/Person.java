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
    private Residence residence;


    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", citizenship='" + citizenship + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", residence=" + residence +
                '}';
    }

    public static class Builder{
        private Person newPerson;

        public Builder() {
            this.newPerson = new Person();
        }

        public Person build(){
            return newPerson;
        }

        public Builder withFirstName(String firstName){
            newPerson.firstName = firstName;
            return this;
        }
        public Builder withLastName(String lastName){
            newPerson.lastName = lastName;
            return this;
        }
        public Builder withSex(Sex sex){
            newPerson.sex= sex;
            return this;
        }
        public Builder withDateOfBirth(LocalDate dateOfBirth){
            newPerson.dateOfBirth = dateOfBirth;
            return this;
        }
        public Builder withCitizenship(String citizenship){
            newPerson.citizenship = citizenship;
            return this;
        }
        public Builder withPhoneNumber(String phoneNumber){
            newPerson.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withResidence(Residence residence){
            newPerson.residence = residence;
            return this;
        }

    }
}
