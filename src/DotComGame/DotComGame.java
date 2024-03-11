package DotComGame;

import java.util.ArrayList;

public class DotComGame {
    ArrayList<Integer> cellLocations = new ArrayList<Integer>();
     private String name = "";


     public void setcellLocations(ArrayList<Integer> locations){
        cellLocations = locations;
    }
     public void setName(String comName){
        name = comName;
     }
   

   
    public String checkYourself(String userGuess){
       String result = "miss";
       int index = cellLocations.indexOf(userGuess);
       

       if(index>=0){
        cellLocations.remove(index);
  

       if(cellLocations.isEmpty()){
        result = "kill";

       if(cellLocations.size()  == 0){
        result = "kill";
        System.out.println("Ouch! You sunk " + name + " : ( ");
      
       }else{
        result = "hit";
       }//close if'
    }//close if
       return result;

       
        }
    }//close method
 }//close class

