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
        c.setBackground(Color.BLUE);
        c.setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e){
        Component c = (Component)e.getSource();
        c.setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e){
        ml.setText("MousePressed" + "(" + ml.getX() + ", " + ml.getY() + ")");
    }

    public void mouseReleased(MouseEvent e){
        ml.setText("MouseReleased" + "(" + ml.getX() + ", " + ml.getY() + ")");
    }

    public void mouseDragged(MouseEvent e){
        ml.setText("MouseReleased" + "(" + ml.getX() + ", " + ml.getY() + ")");
    }

    public void mouseMoved(MouseEvent e){
         ml.setText("MouseReleased" + "(" + ml.getX() + ", " + ml.getY() + ")");
    }
}
