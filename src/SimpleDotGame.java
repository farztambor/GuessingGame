public class SimpleDotGame {
    int numOfHits = 0;
    int[] cellLocations;

    public void setcellLocations(int[] locations){
        cellLocations = locations;
    }

    public String checkYourself(String userGuess){
       String result = "miss";
       
       int numGuess = Integer.parseInt(userGuess);
       
       for(int cell: cellLocations){
            if(cell == numGuess){
                result = "hit";
                numOfHits++;
                break;
            }
       }

       if(numOfHits  == 3){
        result = "kill";
       }

       System.out.println(result);

        return result;
    }
}
