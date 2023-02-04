import sun.awt.image.BufferedImageDevice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 20.03.2022 19:28
 * @class Student
 */

/*
* Патерн проектування "Будівельник" (Builder).

1. Створити внутрішній клас Builder для класу Student, який теж буде створювати новий об'єкт студента.
За це 5 балів.

2. Використати хоча б 2 композиції в класі Student (винести пов'язані поля в окремі класи і включити ті класи замість них).
За кожну композицію 1 бал.
* */

public class Student{
    private Person person;

    private String idNumber;
    private String gradeBookID;
    private String corporateEmail;

    private EducationalEstablishment establishment;
    private Contract contract;
    private Group group;

    private Rating ratingHistory;
    private boolean isOlympiadParticipant;
    private boolean isMemberOfPublicOrganization;

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", idNumber='" + idNumber + '\'' +
                ", gradeBookID='" + gradeBookID + '\'' +
                ", corporateEmail='" + corporateEmail + '\'' +
                ", establishment=" + establishment +
                ", contract=" + contract +
                ", group=" + group +
                ", ratingHistory=" + ratingHistory +
                ", isOlympiadParticipant=" + isOlympiadParticipant +
                ", isMemberOfPublicOrganization=" + isMemberOfPublicOrganization +
                '}';
    }

    public static class Builder{
        private Student newStudent;

        public Builder(){
            newStudent = new Student();
        }

        public Student build(){
            return newStudent;
        }

        public Builder withPersonalInfo(Person person){
            newStudent.person = person;
            return this;
        }
        public Builder withIdNumber(String idNumber){
            newStudent.idNumber = idNumber;
            return this;
        }

        public Builder withGradeBookID(String gradeBookID){
            newStudent.gradeBookID = gradeBookID;
            return this;
        }

        public Builder withCorporateEmail(String corporateEmail){
            newStudent.corporateEmail = corporateEmail;
            return this;
        }
        public Builder withEducationalEstablishment(EducationalEstablishment establishment){
            newStudent.establishment = establishment;
            return this;
        }
        public Builder withContract(Contract contract){
            newStudent.contract = contract;
            return this;
        }
        public Builder withGroup(Group group){
            newStudent.group = group;
            return this;
        }
        public Builder withRating(Rating rating){
            newStudent.ratingHistory = rating;
            return this;
        }

        public Builder withIsOlympiadParticipant(boolean isParticipant){
            newStudent.isOlympiadParticipant = isParticipant;
            return this;
        }
        public Builder withIsMemberOfPublicOrganization(boolean isMember){
            newStudent.isMemberOfPublicOrganization = isMember;
            return this;
        }


    }


}
