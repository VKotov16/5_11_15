
public class Student {
    private String name;
    private String surname;
    int[] marks;

    public Student() {
        this("n/a", "n/a");
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        marks = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printInfoName() {
        System.out.println("My name is " + name + ", surname is " + surname);
    }

    public void setMarks(int[] marks)
    {
        for(int k: this.marks)
        {
            this.marks = marks;
        }
        System.out.println();
    }

    public void printMarks() {
        for(int k: this.marks)
        {
            System.out.print(k + " ");
        }
    }
}


