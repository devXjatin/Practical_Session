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
            System.out.println("2. Search name by rollno.");
            System.out.println("3. Insert Name and Roll Number at position.");
            System.out.println("4. Traverse the Array.");
            System.out.println("5. Delete the Student Array.");
            System.out.println("6. Exit.");
            System.out.println("Enter Your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter Student roll number and name respectively.");
                    for (int i = 0; i < arr.length; i++) {
                        rollno = scanner.nextInt();
                        name = scanner.next();
                        new StudentArray(rollno, name);
                        arr[i] = new StudentArray(rollno, name);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the Roll Number: ");
                    searchValue(scanner.nextInt());
                    break;
                }
                case 3:{
                    System.out.println("Enter roll number, name and position respectively.");
                    int roll = scanner.nextInt();;
                    String name = scanner.next();
                    int position = scanner.nextInt();
                    insertAtPosition(roll, name, position);
                    break;
                }
                case 4:
                    traverseArray();
                    break;

                case 5:
                    deleteArray();
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }

    //Traverse the array
    private void traverseArray(){
        if(arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Name: " + arr[i].getName() + " and Roll number: " + arr[i].getRollno());
            }
        }else{
            System.out.println("Data not found.");
        }
    }

    //Search name by rollno
    private void searchValue(int roll){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getRollno() == roll){
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
                arr[position] = new StudentArray(rollno, name);
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
