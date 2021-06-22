package arrays;

public class OneDimenstionArrayMain {
    public static void main(String[] args) {
        OneDimensionArray obj = new OneDimensionArray(5);
        obj.traverseArray();
        obj.valueAtPosition(2,100); //position:2 and value:100
        System.out.println("After insertion");
        obj.traverseArray();
    }
}
