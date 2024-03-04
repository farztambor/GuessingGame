public class SimpleDotGameTest {

    public static void main (String[] args ){
        SimpleDotGame dotGame = new SimpleDotGame();
        int[] cellLocations = {2,3,4};
        dotGame.setcellLocations(cellLocations);
        String userGuess = "6";
        
        String result = dotGame.checkYourself(userGuess);
    }
}