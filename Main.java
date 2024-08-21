import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to CS112!");
        System.out.println();

        Car userCar = new Car();
        Scanner input = new Scanner(System.in);

        System.out.println("We will be creating your dream car!");
        System.out.println();

        System.out.println("What year is your dream car?: ");
        String year = input.nextLine();
        userCar.setYear(year);

        System.out.println();
        System.out.println("What make it your dream car?: ");
        String make = input.nextLine();
        userCar.setMake(make);

        System.out.println();
        System.out.println("What model is your dream car?: ");
        String model = input.nextLine();
        userCar.setModel(model);

        System.out.println();
        System.out.println("What color is your dream car?: ");
        String color = input.nextLine();
        userCar.setColor(color);

        System.out.println();
        System.out.println("Your customized car is a: ");
        userCar.toString();
        System.out.print(userCar);

    }
}

