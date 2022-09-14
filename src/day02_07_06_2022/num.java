package day02_07_06_2022;

import javax.swing.*;
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int Scaneer = input.nextInt();

        int a = 10;
        int b = -10;

        if (a > 1 || a<10) {
            System.out.println("This  is positive number");


        } else if (b>-1 || b <-10) {
            System.out.println("This  is negative number " );
        }
    }
}
