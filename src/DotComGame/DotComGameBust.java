package DotComGame;

import java.util.*;

public class DotComGameBust {
    private DotComGameHelper helper = new DotComGameHelper();
    private ArrayList<DotComGame> dotComsList= new ArrayList<DotComGame>();
    private int numOfGuess = 0;

    private void setUpGame(){
        // first  make some dot coms and give them locations

        DotComGame one = new DotComGame();
        one.setName("Pets.com");

        DotComGame two = new DotComGame();
        one.setName("eToys.com");

        DotComGame three = new DotComGame();
        one.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms");
        System.out.println("Pets.com,eToys.com, Go2.com ");
        System.out.println("Try to sink them all in the fewest number if guesses");


        for(DotComGame dotComeSet: dotComsList){
            ArrayList<String> newLocation = DotComGameHelper.placeDotCom(3);
            dotComToSet.setcellLocations(newLocation);
        }// close for loop

    }//Close setUpGame method

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter User Guess");
            checkUserGuess(userGuess);
        }//close while

        finishGame();
    }//close startPlayingMethod


    private void checkUserGuess(String userGuess){
        numOfGuess++;
        String result = "miss";

        for(DotComGame dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("hit"));
            break;
        }// end for
    }//close method


    private void finishGame(){
        System.out.println("All Dot Corns are dead! Your stock i s now worthless.");

        if (numOfGuess <= 18) {
            System.out.println(" It only took you" + numOfGuess + " guesses.") ;
            System.out.println(" You got out before your option is sank.");
         } else {
            System.out.println("Took you long enough. " + numOfGuess + " guesses .");
            System.out.println("Fish are dancing with your options . " ) ;
            }
    }

}