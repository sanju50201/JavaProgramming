package JavaPackage;
public class Methods {
    // Methods
    // A method to calculate the total score
    // we're giving the parameters(dataTyepe) inside the method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore+=2000;
            System.out.println("Your Final Score is: "+finalScore);
            return finalScore;
        }else{
            System.out.println("Error Found"); // indicates an error
            return - 1;
        }
    }
    public static void main(String[] args) {
        // we're substituting the arguments(values)
        int highScore = calculateScore(true,800,5,500);
        calculateScore(true,1600,10,1000 );
    }
}
