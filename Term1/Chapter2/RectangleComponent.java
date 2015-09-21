import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
     //Color declarations
     Color c1 = new Color(9,133,247);
     Color c2 = new Color(22,206,235);
     Color c3 = new Color(0,255,198);
     Color c4 = new Color(0,232,95);
     Color c5 = new Color(5,191,12);
     
     
     // Recover Graphics2D
     Graphics2D g2 = (Graphics2D) g;
     
     Day today = new Day();
     Day ethan = new Day(2016,2,20);
     Day emily = new Day(2015,10,31);
     Day mathew = new Day(2015,10,25);
     Day wendi = new Day(2016,4,27);
     Day alex = new Day(2016,5,22);
     
     int dEthan = ethan.daysFrom(today);
     int dEmily = emily.daysFrom(today);
     int dMathew = mathew.daysFrom(today);
     int dWendi = wendi.daysFrom(today);
     int dAlex = alex.daysFrom(today);
     
     System.out.println(365-ethan.daysFrom(today));
     
     // Construct rectangles for bars
     g2.setColor(c1);
     Rectangle box1 = new Rectangle(80, 365-dEthan, 40, dEthan);
     g2.draw(box1);
     g2.fill(box1);
     
     g2.setColor(c2);
     Rectangle box2 = new Rectangle(130, 365-dEmily, 40, dEmily);
     g2.draw(box2);
     g2.fill(box2);
     
     g2.setColor(c3);
     Rectangle box3 = new Rectangle(180, 365-dMathew, 40, dMathew);
     g2.draw(box3);
     g2.fill(box3);
     
     g2.setColor(c4);
     Rectangle box4 = new Rectangle(230, 365-dWendi, 40, dWendi);
     g2.draw(box4);
     g2.fill(box4);
     
     g2.setColor(c5);
     Rectangle box5 = new Rectangle(280, 365-dAlex, 40, dAlex);
     g2.draw(box5);
     g2.fill(box5);
     
     
     //Draw grid lines and scale
     g2.setColor(Color.BLACK);
     
     for(int i = 365; i >= 50; i-=50){
       Line2D.Double lines= new Line2D.Double(70,i,350,i);
       g2.draw(lines);
       g2.drawString(Integer.toString(365-i),45,i);
     }
     
     Line2D.Double lines = new Line2D.Double(70,365,70,65);
     g2.draw(lines);
     Line2D.Double liner = new Line2D.Double(350,365,350,65);
     g2.draw(liner);
     
     
     //Labels and titles
     g2.drawString("Ethan",80,382);
     g2.drawString("Emily",130,382);
     g2.drawString("Mathew",180,382);
     g2.drawString("Alex",230,382);
     g2.drawString("Wendi",280,382);
     
     g2.drawString("Family Members",150,420);
     
     g2.drawString("Days until",1,180);
     g2.drawString("Birthday",1,195);
     
     g2.drawString("Days Until Family Birthdays",50,30);
   }
}
