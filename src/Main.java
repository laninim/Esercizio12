import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Insert person detail: ");

        System.out.println("Type person's name: ");
        String name = scanner.nextLine();

        System.out.println("Type person's surname");
        String surname = scanner.nextLine();

        System.out.println("Type person's height");
        double height = scanner.nextDouble();

        System.out.println("Type person's age");
        int age = scanner.nextInt();

        Person personDetail = new Person(name,surname,height,age);


        System.out.printf("Name: %s \nSurname: %s\nheight: %.2f\nage:%d", personDetail.getName(),personDetail.getSurname(),personDetail.getHeight(),personDetail.getAge());



    }
}