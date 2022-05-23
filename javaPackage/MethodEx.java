package JavaPackage;
public class MethodEx {
    int sum = 0;
    // Method to add two numbers and returns the sum
    public int addTwoInt(int a, int b){
        sum = a + b;
        return sum; 
    }
    // main method in which the sum is being called
    public static void main(String[] args) {
        // creating an object "add" and calling the addTwoInt method
        MethodEx add = new MethodEx();
        int s = add.addTwoInt(2, 1);
        // Displaying the sum of the numbers
        System.out.println("The Addition of two numbers is: "+ s);
    }
}
