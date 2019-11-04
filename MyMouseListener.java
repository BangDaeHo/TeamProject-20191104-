import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener extends MouseMotionAdapter implements MouseListener
{
    JLabel ml;
    public MyMouseListener(JLabel ml){
        this.ml = ml;
    }
    
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){
        Component c = (Component)e.getSource();
        ml.setText("MouseEntered" + "(" + ml.getX() + ", " + ml.getY());
        c.setBackground(Color.CYAN);
    }
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
}
