package arrays;

import java.util.Scanner;

public class StudentArray {
    Scanner scanner = new Scanner(System.in);
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    StudentArray[] arr; //array declaration

    public StudentArray(int arraySize){
        arr = new StudentArray[arraySize];
        studentMenu();

    }

    private StudentArray(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    //Student Menu
    private void studentMenu(){
        while (true) {
            System.out.println("1. Enter Student Data.");
            System.out.println("2. Search Name by Roll no.");
            System.out.println("3. Insert Name and Roll Number at position.");
            System.out.println("4. Traverse the Array.");
            System.out.println("5. Delete the Student Array.");
            System.out.println("6. Exit.");
            System.out.println("Enter Your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Student roll number and name respectively.");
                    for (int i = 0; i < arr.length; i++) {
                        rollno = scanner.nextInt();
                        name = scanner.next();
                        new StudentArray(rollno, name);
                        arr[i] = new StudentArray(rollno, name);
                    }
                }
                case 2 -> {
                    System.out.println("Enter the Roll Number: ");
                    searchValue(scanner.nextInt());
                }
                case 3 -> {
                    System.out.println("Enter roll number, name and position respectively.");
                    int roll = scanner.nextInt();
                    String name = scanner.next();
                    int position = scanner.nextInt();
                    insertAtPosition(roll, name, position);
                }
                case 4 -> traverseArray();
                case 5 -> deleteArray();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid Choice!!!");
            }
        }
    }

    //Traverse the array
    private void traverseArray(){
        if(arr != null) {
            for (StudentArray studentArray : arr) {
                System.out.println("Name: " + studentArray.getName() + " and Roll number: " + studentArray.getRollno());
            }
        }else{
            System.out.println("Data not found.");
        }
    }

    //Search name by rollno
    private void searchValue(int roll){
        for (StudentArray studentArray : arr) {
            if (studentArray.getRollno() == roll) {
                System.out.println(getName());
                return;
            }
            System.out.println("Name not found");
        }
    }

    //Insert at position
    private void insertAtPosition(int roll, String name, int position){
        try{
            if(arr[position] == null){
                arr[position] = new StudentArray(roll, name);
            }else{
                System.out.println("Position already filled.");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
        }
    }

    //Delete the Student Array
    private void deleteArray(){
        arr = null;
        System.out.println("Array Deleted.");
    }
}
