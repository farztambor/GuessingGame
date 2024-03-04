package SimpleDotGame;
public class SimpleDotGameTest {

    public static void main (String[] args ){
        SimpleDotGame dotGame = new SimpleDotGame();

        SimpleDotGameHelper helper = new SimpleDotGameHelper();

        int randNumber = (int) (Math.random()*5);
        int[] cellLocations = {randNumber+1,randNumber+2,randNumber+4};
        dotGame.setcellLocations(cellLocations);

        boolean isAlive = true;

        while(isAlive){

        String userGuess = helper.getUserInput("Enter a Guess");
        String result = dotGame.checkYourself(userGuess);

        if(result =="kill"){
            isAlive = false;
        }
            
        }
        
       
        
    }
}