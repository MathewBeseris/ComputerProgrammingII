public class Tester
{
  public static void main(String[] args)
  {
    double[] values = new double[100]; 
    double total = 0; 
    for (int i = 0; i < values.length; i++) { 
      values[i] += values[i] + i; 
      total += values[i];
    }
    
    
    int searchedValue = 55; 
    int pos = 0; 
    boolean found = false; 
    while (pos < values.length && !found) { 
      if (values[pos] == searchedValue) { 
        found = true; 
      } else { 
        pos++; 
      } 
    } if (found) { 
      System.out.println("Found at position: " + pos + " and Total is: " + total); 
    } else { 
      System.out.println("Not found"); 
    }     
  }
}
