package SimpleDotGame;

import java.util.ArrayList;

public class SimpleDotGameTest {

    public static void main (String[] args ){
        SimpleDotGame dotGame = new SimpleDotGame();

        SimpleDotGameHelper helper = new SimpleDotGameHelper();

        int randNumber = (int) (Math.random()*5);

        ArrayList <Integer> cellLocations = new ArrayList<Integer>();
        cellLocations.add(randNumber+1);
        cellLocations.add(randNumber+2);
        cellLocations.add(randNumber+3);
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