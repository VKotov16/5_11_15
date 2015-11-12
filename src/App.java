
public class App {
    public static void main(String[] args) {
        Student ivanov = new Student("Ivan", "Ivanov");
        //ivanov.name = "Ivan";
        //ivanov.surname = "Ivanov";
        ivanov.printInfo();
        //Student petrov = new Student();
        //petrov.printInfo();

        Student petrov = new Student();
        petrov.setName("Petr");
        System.out.println(petrov.getName());
    }
}
