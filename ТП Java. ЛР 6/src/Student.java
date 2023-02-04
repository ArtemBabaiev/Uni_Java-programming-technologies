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
*       1. Створити клас Person і клас Student, який наслідує Person. Придумати поля і написати стандартні методи (конструктори, get, set, tostring() і т.ін.).
        За кожне поле 0.2 бали.
* */
public class Student extends Person{
    //16*0.2=3.2

    private String universityName;
    private String instituteName;
    private String departmentName;
    private String speciality;
    private int course;
    private String group;
    private String idNumber;
    private String gradeBookID;
    private EducationForm formOfEducation;
    private PaymentForm paymentForm;
    private String corporateEmail;
    private Rating ratingHistory;
    private LocalDate dateOfSigningContract;
    private Person[] parents;
    private Person curator;
    private Exemption exemption;
    private boolean isOlympiadParticipant;
    private boolean isMemberOfPublicOrganization;

    public Student(){
    }

    public Student(String firstName, String lastName, Sex sex, LocalDate dateOfBirth, String citizenship, 
                   String phoneNumber, double height, String address, String universityName, String instituteName, 
                   String departmentName, String speciality, int course, String group, String idNumber, 
                   String gradeBookID, EducationForm formOfEducation, PaymentForm paymentForm, String corporateEmail,
                   Rating ratingHistory, LocalDate dateOfSigningContract, Person[] parents, Person curator, 
                   Exemption exemption, boolean isOlympiadParticipant, boolean isMemberOfPublicOrganization) {
        super(firstName, lastName, sex, dateOfBirth, citizenship, phoneNumber, height, address);
        this.universityName = universityName;
        this.instituteName = instituteName;
        this.departmentName = departmentName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.idNumber = idNumber;
        this.gradeBookID = gradeBookID;
        this.formOfEducation = formOfEducation;
        this.paymentForm = paymentForm;
        this.corporateEmail = corporateEmail;
        this.ratingHistory = ratingHistory;
        this.dateOfSigningContract = dateOfSigningContract;
        this.parents = parents;
        this.curator = curator;
        this.exemption = exemption;
        this.isOlympiadParticipant = isOlympiadParticipant;
        this.isMemberOfPublicOrganization = isMemberOfPublicOrganization;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info = info.replace("Person{", "");
        info = info.replace("\n}", "");
        return "Student{" +
                info +
                "\n\t universityName='" + universityName + '\'' +
                ",\n\t instituteName='" + instituteName + '\'' +
                ",\n\t departmentName='" + departmentName + '\'' +
                ",\n\t speciality='" + speciality + '\'' +
                ",\n\t course=" + course +
                ",\n\t group='" + group + '\'' +
                ",\n\t idNumber='" + idNumber + '\'' +
                ",\n\t gradeBookID='" + gradeBookID + '\'' +
                ",\n\t formOfEducation='" + formOfEducation + '\'' +
                ",\n\t paymentForm='" + paymentForm + '\'' +
                ",\n\t corporateEmail='" + corporateEmail + '\'' +
                ",\n\t ratingHistory=" + ratingHistory +
                ",\n\t dateOfSigningContract=" + dateOfSigningContract +
                ",\n\t parents=" + Arrays.toString(parents) +
                ",\n\t curator=" + curator +
                ",\n\t exemption=" + exemption +
                ",\n\t isOlympiadParticipant=" + isOlympiadParticipant +
                ",\n\t isMemberOfPublicOrganization=" + isMemberOfPublicOrganization +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course
                && isOlympiadParticipant == student.isOlympiadParticipant
                && isMemberOfPublicOrganization == student.isMemberOfPublicOrganization
                && Objects.equals(universityName, student.universityName)
                && Objects.equals(instituteName, student.instituteName)
                && Objects.equals(departmentName, student.departmentName)
                && Objects.equals(speciality, student.speciality)
                && Objects.equals(group, student.group)
                && Objects.equals(idNumber, student.idNumber)
                && Objects.equals(gradeBookID, student.gradeBookID)
                && formOfEducation == student.formOfEducation
                && paymentForm == student.paymentForm
                && Objects.equals(corporateEmail, student.corporateEmail)
                && Objects.equals(ratingHistory, student.ratingHistory)
                && Objects.equals(dateOfSigningContract, student.dateOfSigningContract)
                && Arrays.equals(parents, student.parents)
                && Objects.equals(curator, student.curator)
                && exemption == student.exemption;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), universityName, instituteName, departmentName, speciality, course,
                group, idNumber, gradeBookID, formOfEducation, paymentForm, corporateEmail, ratingHistory,
                dateOfSigningContract, curator, exemption, isOlympiadParticipant, isMemberOfPublicOrganization);
        result = 31 * result + Arrays.hashCode(parents);
        return result;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGradeBookID() {
        return gradeBookID;
    }

    public void setGradeBookID(String gradeBookID) {
        this.gradeBookID = gradeBookID;
    }

    public EducationForm getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(EducationForm formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public PaymentForm getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(PaymentForm paymentForm) {
        this.paymentForm = paymentForm;
    }

    public String getCorporateEmail() {
        return corporateEmail;
    }

    public void setCorporateEmail(String corporateEmail) {
        this.corporateEmail = corporateEmail;
    }

    public Rating getRatingHistory() {
        return ratingHistory;
    }

    public void setRatingHistory(Rating ratingHistory) {
        this.ratingHistory = ratingHistory;
    }

    public LocalDate getDateOfSigningContract() {
        return dateOfSigningContract;
    }

    public void setDateOfSigningContract(LocalDate dateOfSigningContract) {
        this.dateOfSigningContract = dateOfSigningContract;
    }

    public Person[] getParents() {
        return parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public Person getCurator() {
        return curator;
    }

    public void setCurator(Person curator) {
        this.curator = curator;
    }

    public Exemption getExemption() {
        return exemption;
    }

    public void setExemption(Exemption exemption) {
        this.exemption = exemption;
    }

    public boolean isOlympiadParticipant() {
        return isOlympiadParticipant;
    }

    public void setOlympiadParticipant(boolean olympiadParticipant) {
        isOlympiadParticipant = olympiadParticipant;
    }

    public boolean isMemberOfPublicOrganization() {
        return isMemberOfPublicOrganization;
    }

    public void setMemberOfPublicOrganization(boolean memberOfPublicOrganization) {
        isMemberOfPublicOrganization = memberOfPublicOrganization;
    }
}
