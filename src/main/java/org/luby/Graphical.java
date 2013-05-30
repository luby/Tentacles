package main.java.org.luby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created with IntelliJ IDEA.
 * User: Lucy
 * Date: 5/28/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Graphical {
  public static void main( String[] args ) {
    JFrame frame = new JFrame("Shady as fuck");
    frame.getContentPane().add( new Viz());
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}

class Viz extends JComponent   {
  public void paintComponent (Graphics g) {
    Person luby = new Person("Lucy Cunningham", 30, 15);
    g.setColor(Color.BLACK);
    g.drawString(Double.toString(luby.getCapacityRatio()), 70,50);
    g.setColor(Color.getHSBColor(0.35f, 0.5f, 0.9f));
    g.fillOval(30,30,30,30) ;
    g.setColor(Color.BLACK);
    g.drawString(luby.getName(), 30,30);
  }

}

