public class Reverse{
  public static void main(String[] args){
    String s1;
    String s2;
    
    String s = "hello";
      for(int i = 0; i<s.length()-1;i++){
        
        s1 = s.substring(0,1);
        s = s.substring(1,s.length());
        s = s.substring(0,s.length()-i)+s1+s.substring(s.length()-i,s.length());
        
        System.out.println(s);
    }
  }
}