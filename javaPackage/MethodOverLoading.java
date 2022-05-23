package JavaPackage;

public class MethodOverLoading {
    /**Method OverLoading : Using the same method but
     *  with different parameters */
    // This is a method with two parameters a String and a int 
    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " Score: " + score);
        return score * 100;
    }
    // this is a method with a single parameter only int
    public static int calculateScore(int score){
        System.out.println("Unnamed Player: " + " Score: " + score);
        return score * 100;
    }
    // this is a method without any parameters
    public static int calculateScore(){
        System.out.println("No player no score");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid Input Provided");
            // when invalid inputs are passed, it returns the display statement (-1)
            return -1;
        }
        double centimeters = (feet*12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet+" feet, "+inches+" inches, "+ centimeters+ " centimeters");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches +" inches is equal to " + feet + " feet and " +  remainingInches+ " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
    public static void main(String[] args) {
        // Displaying the first Method
        int newScore = calculateScore("Sanjith", 500);
        System.out.println("New Score is: "+newScore);
        // Displaying the second methods
        int newAddedScore = calculateScore(150);
        System.out.println("Added new Score: "+newAddedScore);
        calculateScore();
        // Feet To centimeter method called
        calcFeetAndInchesToCentimeters(12); 
        calcFeetAndInchesToCentimeters(4, 8);
    }
}
