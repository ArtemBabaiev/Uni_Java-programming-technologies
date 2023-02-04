import java.time.LocalDate;
import java.time.Month;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 9
 * @date 02.04.2022 21:11
 * @class Main
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withCitizenship("Україна")
                .withFirstName("Бабаєв")
                .withLastName("Артем")
                .withPhoneNumber("+380969077503")
                .withResidence(new Residence())
                .withSex(Sex.MALE)
                .build();
        System.out.println(person);
        Student student = new Student.Builder()
                .withIdNumber("123456789")
                .withContract(new Contract())
                .withCorporateEmail("babaiev.artem@chnu.edu.ua")
                .withEducationalEstablishment(new EducationalEstablishment())
                .withGradeBookID("123456789")
                .withGroup(new Group())
                .withIsMemberOfPublicOrganization(true)
                .withIsOlympiadParticipant(false)
                .withPersonalInfo(person)
                .withRating(new Rating())
                .build();
        System.out.println(student);
    }

}
