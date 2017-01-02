import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
 
public class Board extends JFrame {
 private Container pane;

 private JButton b;
 private JLabel l;
 private JTextField t;
 private JCheckBox c;

    public Board() {
     this.setTitle("Monopoly");
     this.setSize(800,800);
     this.setLocation(200,0);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(new BorderLayout());
     JTextField field = new JTextField();
     JButton button = new JButton("Monopoly");
     pane.add(button, BorderLayout.PAGE_START);

     button = new JButton("Board Goes Here");
     button.setPreferredSize(new Dimension(200, 200));
     pane.add(button, BorderLayout.CENTER);

     button = new JButton("Box Layout Here");
     pane.add(button, BorderLayout.LINE_START);
     
     button = new JButton("Flow Layout then Box layout");
     pane.add(button, BorderLayout.PAGE_END);

     button = new JButton("Leave as long box for Log");
     pane.add(button, BorderLayout.LINE_END);
   
 }

  public static void main(String[] args) {
     Board g = new Board();
     g.setVisible(true);
  }
}