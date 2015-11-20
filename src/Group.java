
public class Group {

    private Student[] group;
    private int iterator;
    private int count = 5;

    public Group() {
        this.group = new Student[5];
        iterator = 0;
    }

    public void setStudent(Student st) {

        if(iterator == group.length)
        {
            Student[] temp = new Student[iterator + count];
            for(int i = 0; i < iterator; i++)
            {
                temp[i] = group[i];
            }

            group = temp;
        }

        this.group[iterator] = st;
        iterator++;


    }

    public void printGroup()
    {
        for(Student st: group)
        {
            if(st == null)
                break;
            st.printInfoName();
            st.printMarks();
            System.out.println();
        }
    }

    public void deleteStudentIndex(int index) {

        Student[] temp = new Student[iterator];

        for(int i = 0, j = 0; i < group.length; i++, j++)
        {
            if(group[j] == null)
                break;

            if(i == index)
            {
                j++;
            }
            temp[i] = group[j];
        }
        group = temp;
    }


}
