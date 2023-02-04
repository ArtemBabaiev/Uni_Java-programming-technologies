import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 20.03.2022 19:22
 * @class Main
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("String firstName", "String lastName", Sex.MALE,
                LocalDate.of(2002, 7, 18), "String citizenship",
                "String phoneNumber", 185.5, "String address",
                "String universityName", "String instituteName",
                "String departmentName", "String speciality", 2,
                "String group", "String idNumber","String gradeBookID",
                EducationForm.FULL_TIME, PaymentForm.STATE_FORM, "String corporateEmail",
                new Rating(), LocalDate.of(2020, 9, 14),
                new Person[]{new Person(), new Person()}, new Person(),
                Exemption.NONE, false, true);
        System.out.println(student.getAge());
    }

}
