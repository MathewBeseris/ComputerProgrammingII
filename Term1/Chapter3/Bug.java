

public class Bug{
  
  int position;
  int direction;
  
  
  public Bug(int position){
    this.position = position;
    direction = 1;
  }
  
  
  
  public void turn(){
    direction *= -1;
  }
  
  public void move(){
    position += direction;
  }
  
  public int getPosition(){
    return position;
  }
}