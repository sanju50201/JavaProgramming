package JavaPackage;
public class AlternateChallengeSol {
    // A method to display the High Score Position 
    public static void displayHighScorePosition(String playerName, int highScore){
        System.out.println(playerName+" managed to get into position " + highScore
        +" on the high score table");
    }
    // method to calculate the highScorePosition
    public static int calculateHighPosition(int playerScore){
        // returns 1 if the the condition is satisfied
        // if(playerScore >= 1000){
        //     return 1;
        //     // returns 2 if the the condition is satisfied
        // }else if(playerScore >= 500){
        //     return 2;
        //     // returns 3 if the the condition is satisfied
        // }else if(playerScore >= 100 ){
        //     return 3;
        //     // reuturns 4 if the the condition is satisfied
        // }
        //     return 4;
        int position = 4; // assuming 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position;
        }  
    public static void main(String[] args) {
        // Calculating and displaying the Position of the player, Calling String and int    
        int highScorePosition = calculateHighPosition(1000);
        displayHighScorePosition("Sanjith", highScorePosition);
        
        highScorePosition = calculateHighPosition(900);
        displayHighScorePosition("Punith", highScorePosition);

        highScorePosition = calculateHighPosition(400);
        displayHighScorePosition("Sagar", highScorePosition);

        highScorePosition = calculateHighPosition(50);
        displayHighScorePosition("Kohli", highScorePosition);
        
    }
    
}
