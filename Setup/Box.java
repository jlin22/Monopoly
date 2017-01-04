import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Box extends JFrame implements ActionListener{
    private Container pane;
    public Box(){
	this.setTitle("Buttons on Side");
	this.setSize(200,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	JButton a = new JButton("Roll the Dice");
	JButton b = new JButton("Buy a House");
	JButton c = new JButton("Mortgage a Property");
	JButton d = new JButton("Trade with Other Players");
	JButton e = new JButton("Use Get Out of Jail Free Card");
	pane.add(a);
	pane.add(b);
	pane.add(c);
	pane.add(d);
	pane.add(e);
    }
    public void actionPerformed(ActionEvent e){
    }
    public static void main(String[]args){
	Box f = new Box();
	f.setVisible(true);
    }
}
	    
