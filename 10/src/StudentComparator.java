public class StudentComparator implements Comparator<Student>{
    public float compareGPA(Student s1, Student s2){
        return s1.getGpa() - s2.getGpa();
    }

    public float compareCourse(Student s1, Student s2) {
        return s1.getCourse() - s2.getCourse();
    }
}