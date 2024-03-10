package HomeWorks;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name:");
                String name = scanner.nextLine();

        System.out.println("Please, enter your hoby");
                String hoby = scanner.nextLine();

        System.out.println("Nice to meet you "+ name +" your hoby "+ hoby +" is very interesting");
    }
}
