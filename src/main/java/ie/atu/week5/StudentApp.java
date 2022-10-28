package ie.atu.week5;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        //Asking student for name
        System.out.println("Please enter Student Name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student store = new Student(); // Stores information
        store.setName(name);
        System.out.println("You entered\n" + store.getName());


        //Asking student for email
        System.out.println("Please enter Student email");
        String email = input.nextLine();
        store.setEmail(email);
        System.out.println("You entered\n" + store.getEmail());

        //Asking Student for course
        System.out.println("Please enter Name of course Studying");
        String course = input.nextLine();
        store.setCourse(course);
        System.out.println("You entered\n" + store.getCourse());

        //Asking student2 for name
        System.out.println("Please enter Student Name 2");
        String name2 = input.nextLine();
        store.setName(name2);
        System.out.println("You entered\n" + store.getName());

        //Asking student2 for email
        System.out.println("Please enter Student email 2");
        String email2 = input.nextLine();
        store.setEmail(email2);
        System.out.println("You entered\n" + store.getEmail());

        //Asking Student2 for course
        System.out.println("Please enter Name of course Studying 2");
        String course2 = input.nextLine();
        store.setCourse(course2);
        System.out.println("You entered\n" + store.getCourse());

        //Asking student3 for name
        System.out.println("Please enter Student Name 3");
        String name3= input.nextLine();
        store.setName(name3);
        System.out.println("You entered\n" + store.getName());

        //Asking student3 for email
        System.out.println("Please enter Student email 3");
        String email3 = input.nextLine();
        store.setEmail(email3);
        System.out.println("You entered\n" + store.getEmail());

        //Asking Student for course
        System.out.println("Please enter Name of course Studying");
        String course3 = input.nextLine();
        store.setCourse(course3);
        System.out.println("You entered\n" + store.getCourse());
    }

}