import java.util.Random;

public class SortingStudentsByGPA {
    public Student[] iDNumber;
    StudentComparator scomp = new StudentComparator();
    void setArray(int numOfStuds){
        Random r = new Random();
        iDNumber = new Student[numOfStuds];
        for(int i=0;i<numOfStuds;i++){
            iDNumber[i] = new Student("Student","#"+r.nextInt(1,1000),"Spec#"+ r.nextInt(1,5), r.nextInt(1,4),"IKBO_"+r.nextInt(1,30), r.nextFloat(0f,100f));
        }
        System.out.println("Array created and filled");
    }
    public void QSortGPA(int start, int end) {
        if (start < end)
        {
            int pivotIndex = partitionGPA(start, end);
            QSortGPA(start, pivotIndex - 1);
            QSortGPA(pivotIndex + 1, end);
        }
    }
    public void QSortCourse(int start, int end) {
        if (start < end)
        {
            int pivotIndex = partitionCourse(start, end);
            QSortCourse(start, pivotIndex - 1);
            QSortCourse(pivotIndex + 1, end);
        }
    }

    void swap(Student[] arr, int i, int j) {
        Student temporary = arr[i];
        arr[i]=arr[j];
        arr[j]=temporary;
    }
    public int partitionGPA(int l, int r) {
        int pNum = l-1;
        for (int i = l; i < r; i++)
        {
            if (scomp.compareGPA(iDNumber[i],iDNumber[r]) > 0)
            {
                pNum++;
                swap(iDNumber,pNum , i);

            }
        }
        swap(iDNumber, pNum+1, r);
        return (pNum+1);
    }

    public int partitionCourse(int l, int r) {
        int pNum = l-1;
        for (int i = l; i < r; i++)
        {
            if (scomp.compareCourse(iDNumber[i],iDNumber[r]) < 0)
            {
                pNum++;
                swap(iDNumber,pNum , i);

            }
        }
        swap(iDNumber, pNum+1, r);
        return (pNum+1);
    }

    void outArray(){
        for(Student i : iDNumber){
            System.out.println(i.getName() +" "+ i.getSurname()+" "+i.getSpeciality()+" "+i.getCourse()+" "+i.getGroup()+" "+i.getGpa());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortingStudentsByGPA st = new SortingStudentsByGPA();
        st.setArray(10);
        st.outArray();
        System.out.println("Sort by GPA");
        st.QSortGPA(0, st.iDNumber.length-1);
        st.outArray();
        System.out.println("Sort by Course");
        st.QSortCourse(0, st.iDNumber.length-1);
        st.outArray();
    }
}
