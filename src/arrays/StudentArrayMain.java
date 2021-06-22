package arrays;

import java.util.Scanner;

public class StudentArrayMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        new StudentArray(scn.nextInt());
    }
}
