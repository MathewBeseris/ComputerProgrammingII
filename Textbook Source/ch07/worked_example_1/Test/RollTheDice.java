import java.util.Arrays;

// Challenge: change the app to produce a winner after the first die hits 
public class RollTheDice {
  
  public static void main(String[] args) {
    // Set number of rolls
    final int rolls = 100;
    int winner = 0;
    int winnerNum = 0;
    
    // Create dice array
    int[] dice = new int[7];
    
    // Initialize values to 0
    for (int val = 1; val < 7; val++) {
      dice[val] = 0;
    }
    
    // Simulate rolls with counter
    for (int count = 0; count < rolls; count++) {
      // Produce a random value between 1 and 6
      int roll = (int)(6.0*Math.random() + 1.0);
      // assign each occurance of 1-6 to dice array
      dice[roll]++;
    }
    
    // Print results
    System.out.println("Dice Rolls: " + rolls);
    for (int i = 1; i < 7; i++) {
      System.out.println( i + ": " + dice[i]);
      if (dice[i] > dice[1] && dice[i] > dice[2] &&  dice[i] > dice[3] && dice[i] > dice[4] && dice[i] > dice[5]) { winner = dice[i]; winnerNum = 6;}
      else if (dice[i] > dice[1] && dice[i] > dice[2] && dice[i] > dice[3] && dice[i] > dice[4] && dice[i] > dice[6]) { winner = dice[i]; winnerNum = 5;}
      else if (dice[i] > dice[1] && dice[i] > dice[2] && dice[i] > dice[3] && dice[i] > dice[5] && dice[i] > dice[6]) { winner = dice[i]; winnerNum = 4;}
      else if (dice[i] > dice[1] && dice[i] > dice[2] && dice[i] > dice[4] && dice[i] > dice[5] && dice[i] > dice[6]) { winner = dice[i]; winnerNum = 3;}
      else if (dice[i] > dice[1] && dice[i] > dice[3] && dice[i] > dice[4] && dice[i] > dice[5] && dice[i] > dice[6]) { winner = dice[i]; winnerNum = 2;}
      else if (dice[i] > dice[2] && dice[i] > dice[3] && dice[i] > dice[4] && dice[i] > dice[5] && dice[i] > dice[6]) { winner = dice[i]; winnerNum = 1;}      
    }
    
    //System.out.println(Arrays.toString(dice));
    //System.out.println("And the winner is: (" + winnerNum + ") with " + winner + " roles!");
    if (winnerNum == 0) {
      System.out.println("It was a tie!");
      //System.out.println(Arrays.toString(dice));
    } else {
      Arrays.sort(dice);
      System.out.println("And the winner is: " + winnerNum + " with " + dice[6] + " roles!");
      if ((dice[6]-dice[5]) == 1) {
        System.out.println(winnerNum + " won by " + (dice[6]-dice[5]) + " roll!");
      } else {
        System.out.println(winnerNum + " won by " + (dice[6]-dice[5]) + " rolls!");
      }
    }
  }
  
  public int FindWinner(int dRoll) {
    //if (dice[1] > dRoll && dice[2] > dRoll && dice[3] > dRoll && dice[4] > dRoll && dice[6] > dRoll) { dRoll = 6; }
    return dRoll;
  }
}