/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 9
 * @date 02.04.2022 20:09
 * @class EducationalEstablishment
 */
public class EducationalEstablishment {
    private String universityName;
    private String instituteName;
    private String departmentName;

    public EducationalEstablishment() {
    }

    public EducationalEstablishment(String universityName, String instituteName, String departmentName) {
        this.universityName = universityName;
        this.instituteName = instituteName;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "EducationalEstablishment{" +
                "universityName='" + universityName + '\'' +
                ", instituteName='" + instituteName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
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
}
