public class Student {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
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
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String surname, String speciality, int course, String group, float gpa) {
        Name = name;
        Surname = surname;
        Speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    String Name;
    String Surname;
    String Speciality;
    int course;
    String group;
    float gpa;
}