import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HorizontalBoard extends JFrame implements ActionListener{
    private Container pane;
    public HorizontalBoard(){
	this.setTitle("Horizontal Board");
	this.setSize(1000,1000);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
	JButton a = new JButton("");
	JButton b = new JButton("");
	JButton c = new JButton("");
	JButton d = new JButton("");
	JButton e = new JButton("");
	JButton f = new JButton("");
	JButton g = new JButton("");
	JButton h = new JButton("");
	JButton i = new JButton("");
	JButton j = new JButton("");
	pane.add(a);
	pane.add(b);
	pane.add(c);
	pane.add(d);
	pane.add(e);
	pane.add(f);
	pane.add(g);
	pane.add(h);
	pane.add(i);
	pane.add(j);
    }
    public void actionPerformed(ActionEvent e){
    }
    public static void main(String[]args){
        HorizontalBoard f = new HorizontalBoard();
	f.setVisible(true);
    }
}
