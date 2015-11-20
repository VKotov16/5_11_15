
public class App {
    public static void main(String[] args) {
        Student ivanov = new Student("Ivan", "Ivanov");
        int[] l = new int[] {1,5,4,2,7};
        ivanov.setMarks(l);

        Group gr = new Group();
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.setStudent(ivanov);
        gr.printGroup();
        gr.deleteStudentIndex(3);
        System.out.println("***");
        gr.printGroup();

    }
}
