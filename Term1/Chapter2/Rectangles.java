import java.awt.Rectangle;
import javax.swing.JFrame;

public class Rectangles{
  public static void main(String[] args){
    
    JFrame frame = new JFrame();
    frame.setSize(16*45,9*45);
    frame.setTitle("Boxes!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    Rectangle box1 = new Rectangle(5,10,20,30);
    box1.translate(15,25);
    
    
  }
}