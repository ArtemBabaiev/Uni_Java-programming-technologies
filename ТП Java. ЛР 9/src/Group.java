/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 9
 * @date 02.04.2022 20:10
 * @class Group
 */
public class Group {
    private String speciality;
    private int course;
    private String groupNumber;
    private Person curator;

    public Group() {
    }

    public Group(String speciality, int course, String groupNumber, Person curator) {
        this.speciality = speciality;
        this.course = course;
        this.groupNumber = groupNumber;
        this.curator = curator;
    }

    @Override
    public String toString() {
        return "Group{" +
                "speciality='" + speciality + '\'' +
                ", course=" + course +
                ", groupNumber='" + groupNumber + '\'' +
                ", curator=" + curator +
                '}';
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

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Person getCurator() {
        return curator;
    }

    public void setCurator(Person curator) {
        this.curator = curator;
    }
}
