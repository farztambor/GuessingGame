package SimpleDotGame;
public class SimpleDotGame {
    int numOfHits = 0;
    int[] cellLocations;
    int numOfGuess = 0;


    public void setcellLocations(int[] locations){
        cellLocations = locations;
    }

    public String checkYourself(String userGuess){
       String result = "miss";
       
       int numGuess = Integer.parseInt(userGuess);
       
       for(int cell: cellLocations){
            if(cell == numGuess){
                result = "hit";
                numOfGuess++;
                numOfHits++;
                break;
            }
       }
       System.out.println(result);
       if(numOfHits  == 3){
        result = "kill";
       System.out.println("You took " + numOfGuess + " guesses.");
       }

     

        return result;
    }
}
