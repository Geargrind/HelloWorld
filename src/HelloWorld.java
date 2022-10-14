import java.util.Scanner;
public class HelloWorld
{
     public static void main(String[] args) {
        Person p1 = new Person();
        p1.setFirstName("Jennifer");
        System.out.println(p1.getFirstName());

        Person p2 = new Person();
        p2.setFirstName("Michael");
        System.out.println(p2.getFirstName());
    /*
    System.out.println("Hello World!");
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input your firstname:");
    String firstname = scanner.nextLine();
        System.out.println("Input your last name:");
        String lastName = scanner.nextLine();
        System.out.println(firstname + " " + lastName);*/
    }
}





