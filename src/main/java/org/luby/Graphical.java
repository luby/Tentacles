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
    frame.getContentPane().add( new PersonViz(new Person("Lucy Cunningham", 30, 15)));
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}

class PersonViz extends JComponent   {

  private Person person;

  public PersonViz(Person p) {
    this.person = p;
  }
  public void paintComponent (Graphics g) {
    float p_ratio = (float) person.getCapacityRatio();
    String p_name = person.getName();
    g.setColor(Color.BLACK);
    g.drawString(Double.toString(p_ratio), 70,50);
    g.setColor(Color.getHSBColor(0.35f, p_ratio, 0.9f));
    g.fillOval(30,30,30,30) ;
    g.setColor(Color.BLACK);
    g.drawString(p_name, 30,30);

  }

}

