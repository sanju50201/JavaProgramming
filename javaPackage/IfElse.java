package JavaPackage;
public class IfElse {
    public static void main(String[] args) {
        boolean isWinning = true;
        if(isWinning){
            System.out.println("If condition");
        }else{
            System.out.println("Else Condition");
        }

        int myScore = 80;
        if(myScore >= 100){
            System.out.println("You got the highest Score");
        }
        int secondHighestScore = 60;
        if(secondHighestScore < myScore && myScore <100){
            System.out.println("Lesser than highest score");
        }
        // Type Casting in Java
        float myFloatValue = (float)3.25; // this is called typecasting
        System.out.println(myFloatValue);
    }
    
}
