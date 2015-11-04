import java.util.*;

public class RollDice
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int[] diceNums = {0, 0, 0, 0, 0, 0};
    int roll;
    int largest = 0;
    int second = 0;
    int winner = 0;
    boolean tie = false;
    for(int i=0; i<100; i++)
    {
      roll = random.nextInt(6);
      diceNums[roll]++;
    }
    System.out.println("Dice rolls: 100");
    for(int i=0; i<6; i++)
    {
      System.out.println((i+1) + ": " + diceNums[i]);
      if(diceNums[i] == largest)
      {
        tie = true;
      }
      if(diceNums[i] > largest)
      {
        if(tie)
        {
          tie = false;
        }
        second = largest;
        largest = diceNums[i];
        winner = i+1;
      }
    }
    if(tie)
    {
      System.out.println("It was a tie!");
    }
    else
    {
      System.out.println("And the winner is: " + winner + " with " + largest + " rolls!");
      System.out.println(winner + " wins by " + (largest - second) + " rolls!");
    }
  }
}