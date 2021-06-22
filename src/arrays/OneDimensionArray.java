package arrays;

public class OneDimensionArray {
    int[] arr;   //array declaration

    //Constructor
    public OneDimensionArray(int arraySize){
        arr = new int[arraySize];   //Array Creation
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Traverse the Array
    public void traverseArray(){
        for(var val : arr){
            System.out.println(val);
        }
    }

    //insert value at position in the array
    public void valueAtPosition(int position, int value){
        try{
            if(arr[position] == Integer.MIN_VALUE){
                arr[position] = value;
            }else{
                System.out.println("Position is already filled!!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position Entered!");
        }
    }

    //Access the particular index value
    public void indexValue(int index){
        try{
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }
    }

    //Delete a value from array by index value
    public void deleteIndexValue(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
    }

    //Search a value from array
    public void searchValue(int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                System.out.println(arr[i]+" value found at"+(i+1));
                return;
            }
        }
        System.out.println("Value not found");
    }

    //Delete the entire array
    public void deleteArray(){
        arr= null;
        System.out.println("Array Deleted");
    }
}
