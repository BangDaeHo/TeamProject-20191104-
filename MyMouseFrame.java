import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MyMouseFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseFrame extends JFrame
{
    public MyMouseFrame(){
      this.setTitle("MouseListener & MouseMotionListener");
      this.setSize(300,300);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel ml;
      ml.addMouseListener(new MyMouseListener(ml));
      this.setLayout(null);
      ml = new JLabel("No Mouse Event");
      ml.setSize(50,20);
      ml.setLocation(50,50);
      this.add(ml);
    }
}
