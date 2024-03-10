package HomeWorks;

import java.util.Scanner;

public class HomeWork2b {
    public static void main(String[] args)

    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Today is a rainy day");
        System.out.println("Today is a sunny day");

        String weather1 = "Today is a rainy day";
        String weather2 = "Today is a sunny day";

        boolean equals = weather1.equals(weather2);

        // System.out.println("\"" + weather1 + "\" equals \"" +
        //        weather2 + "\"? " + equals);
        System.out.println("\"" + weather1 + "\" equals \"" +
                weather2 + "? " + equals);
    }

}



