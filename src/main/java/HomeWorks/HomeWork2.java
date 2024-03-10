package HomeWorks;

import java.util.Scanner;



public class HomeWork2 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(" My name is test ");
    System.out.println(" Please, enter name1 : ");

//        String name1 = scanner.nextLine();
//
    String str = "My name is <Test>";
    String name1 = scanner.nextLine();
    String replacedStr = str.replace("<Test>", name1);

    System.out.println(str);
    System.out.println(replacedStr);
}}







