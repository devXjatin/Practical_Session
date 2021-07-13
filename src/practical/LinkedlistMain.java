package practical;

import java.util.Scanner;

public class LinkedlistMain {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        Scanner scn = new Scanner(System.in);
        System.out.println("How many Elements you want to entered?: ");
        int elements = scn.nextInt();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < elements; i++) {
            obj.insert(new Node(scn.nextInt()));
        }
        System.out.println("Enter the Number for Occurrence: ");
        int count = scn.nextInt();
        System.out.println("Occurrence: "+obj.count(count));

    }
}
