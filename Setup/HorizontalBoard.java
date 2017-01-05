import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HorizontalBoard extends JFrame implements ActionListener{
    private Container pane;
    public HorizontalBoard(){
	//this.setTitle("Horizontal Board");
	//this.setSize(200,200);
	//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//pane = this.getContentPane();
	//pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
	JPanel pane = new JPanel();
	pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
	
	JFrame frame = new JFrame("Horizontal Board");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(pane);
	frame.setSize(200,200);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	Dimension dim = new Dimension(100,100);
	JButton a = new JButton("");
	a.setPreferredSize(dim);
	JButton b = new JButton("");
	b.setPreferredSize(dim);
	JButton c = new JButton("");
	c.setPreferredSize(dim);
	JButton d = new JButton("");
	d.setPreferredSize(dim);
	JButton e = new JButton("");
	e.setPreferredSize(dim);
	/*
	JButton f = new JButton("");
	JButton g = new JButton("");
	JButton h = new JButton("");
	JButton i = new JButton("");
	JButton j = new JButton("");
	*/
	pane.add(a);
	pane.add(b);
	pane.add(c);
	pane.add(d);
	pane.add(e);
	/*
	pane.add(f);
	pane.add(g);
	pane.add(h);
	pane.add(i);
	pane.add(j);
	*/
    }
    public void actionPerformed(ActionEvent e){
    }
    public static void main(String[]args){
        HorizontalBoard f = new HorizontalBoard();
    }
}
