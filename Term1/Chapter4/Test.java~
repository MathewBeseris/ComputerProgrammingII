import java.util.Scanner;
import java.util.*;

public class Test{
  public static void main(String[] args){
    int[] nums = new int[100];
    
    Random rn = new Random();
    
    for(int i = 0; i < 100; i++){
      
      nums[i] = rn.nextInt(100);
      
    }
    
    int maxValue = nums[0];
    
    for(int i = 1; i < nums.length; i ++){
      
      if(nums[i] > maxValue){
        
        maxValue = nums[i];
        
      }
      
    }
    System.out.println(maxValue);
    
    
    for(int i = 0; i < nums.length; i ++){

      if(i>0){
        
        System.out.print(" | ");
        
      }
      
      System.out.print(nums[i]);
      
    }
    
    
    
    boolean found = false;

    int pos = 0;
    
    while(pos < nums.length && !found){
      
      if(nums[pos] == 23){

        found = true;
       
      }
      
      pos++;
      
    }
    
    
    for(int i = 0; i < nums.length; i++){
      
      nums[i] = nums[i] *2;
  
    }
    
    nums[nums.length-1] = 0;
    
    int[] nums2;
    nums2 = Arrays.copyOf(nums,nums.length);
  }
}