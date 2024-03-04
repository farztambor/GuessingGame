package SimpleDotGame;

import java.util.ArrayList;

public class SimpleDotGame {
    ArrayList<Integer> cellLocations = new ArrayList<Integer>();
    int numOfGuess = 0;


    public void setcellLocations(ArrayList<Integer> locations){
        cellLocations = locations;
    }

    public String checkYourself(String userGuess){
       String result = "miss";
       int numGuess = Integer.parseInt(userGuess);
       
       for(int cell: cellLocations){
            if(cell == numGuess){
                cellLocations.remove(cellLocations.indexOf(cell));
                result = "hit";
                break;
            }
       }

       if(cellLocations.size()  == 0){
        result = "kill";
      
       }
       System.out.println(result);
       numOfGuess++;

       if(result == "kill"){
        System.out.println("You took " + numOfGuess + " guesses.");
       }
        return result;
    }
}
