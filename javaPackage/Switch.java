package JavaPackage;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
            System.out.println("Neither 1 or 2");
                break;
        }
        char switchChar = 'G';
        switch (switchChar) {
            case 'A':
                System.out.println("The value is 'A' ");
                break;
            case 'B':
                System.out.println("The value is 'B' ");
                break;
            case 'C':
                System.out.println("The Value is C");
                break;
            case 'D':
                System.out.println("The Value is D");
                break;
            case 'E':
                System.out.println("The Value is 'E'");
                break;
            default:
            System.out.println("Character to be found is not available");
                break;
        }

        String month = "jAnuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "ebruary":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }  
}
