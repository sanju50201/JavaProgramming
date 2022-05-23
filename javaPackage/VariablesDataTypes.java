package JavaPackage;
public class VariablesDataTypes {
    public static void main(String[] args) {
        // Integer Data Type -> stores 4 bytes
        int intNum = 5;
        int minIntValue = Integer.MIN_VALUE; // Wrapper Class
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Max Int Value is: "+maxIntValue);
        System.out.println("Max Int Value is: "+minIntValue);
        System.out.println("Integer Number is: "+intNum);
        // FLoat -> 4 bytes
        float floatNum = 6.0f / 4;
        System.out.println("Float Number is: "+floatNum);
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Min Float Value: "+minFloatValue);
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Max Float Value: "+maxFloatValue);
        // Double -> this data type is more precise than float -> stores 8 bytes
        double doubleNum = 5d / 3d;
        System.out.println("Double Number is: "+doubleNum);
        // Char stores a single character and stores 2 bytes
        char ch = 'A';
        System.out.println("Character is: "+ch);
        // String -> a sequence of characters 
        String name = "Sanjith";
        System.out.println("Your name is "+name);
        // Boolean -> either true or false for a statement -> stores 2 bytes
        boolean isWinning = true;
        System.out.println("Boolean Value is: "+isWinning);
    }
}
