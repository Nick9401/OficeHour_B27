package day02_07_06_2022;

import java.util.Scanner;

public class SingleIfSmallTask {
    public static void main(String[] args) {
        //4-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter temp");
        int temp = scanner.nextInt();

        /*
        after if statement if you one statement you don't need to use {}
         */

        if (temp >= 70 && temp <= 80) ;
        {

            System.out.println("Ideal Temp");
            System.out.println(temp);


            System.out.println("Not Ideal Temp");


            {
                if (temp >= 70 && temp <= 80) {
                    System.out.println("Ideal Temp");
                    System.out.println(temp);


                }
            }
        }}}