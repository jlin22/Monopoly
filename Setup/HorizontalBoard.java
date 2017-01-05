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
	JPanel tpane = new JPanel();
	tpane.setLayout(new FlowLayout(FlowLayout.LEFT));

	JPanel bpane = new JPanel();
	bpane.setLayout(new FlowLayout(FlowLayout.LEFT));

	JPanel wholePane = new JPanel();
	wholePane.setLayout(new BoxLayout(wholePane,BoxLayout.Y_AXIS));

	wholePane.add(tpane);
	wholePane.add(bpane);
	
	JFrame frame = new JFrame("Horizontal Board");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//need to fix later
	//frame.add(tpane);
	//frame.add(bpane);
	frame.add(wholePane);
	
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	Dimension dim = new Dimension(25,25);
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
	JButton f = new JButton("");
	f.setPreferredSize(dim);
	JButton g = new JButton("");
	g.setPreferredSize(dim);
	JButton h = new JButton("");
	h.setPreferredSize(dim);	
	JButton i = new JButton("");
	i.setPreferredSize(dim);
	JButton j = new JButton("");
	j.setPreferredSize(dim);	
	tpane.add(a);
	tpane.add(b);
	tpane.add(c);
	tpane.add(d);
	tpane.add(e);
	tpane.add(f);
	tpane.add(g);
	tpane.add(h);
	tpane.add(i);
	tpane.add(j);
	
	JButton a1 = new JButton("");
	a1.setPreferredSize(dim);
	JButton b1 = new JButton("");
	b1.setPreferredSize(dim);
	JButton c1 = new JButton("");
	c1.setPreferredSize(dim);
	JButton d1 = new JButton("");
	d1.setPreferredSize(dim);
	JButton e1 = new JButton("");
	e1.setPreferredSize(dim);
	JButton f1 = new JButton("");
	f1.setPreferredSize(dim);
	JButton g1 = new JButton("");
	g1.setPreferredSize(dim);
	JButton h1 = new JButton("");
	h1.setPreferredSize(dim);	
	JButton i1 = new JButton("");
	i1.setPreferredSize(dim);
	JButton j1 = new JButton("");
	j1.setPreferredSize(dim);	
	bpane.add(a1);
	bpane.add(b1);
	bpane.add(c1);
	bpane.add(d1);
	bpane.add(e1);
	bpane.add(f1);
	bpane.add(g1);
	bpane.add(h1);
	bpane.add(i1);
	bpane.add(j1);

	
	
    }
    public void actionPerformed(ActionEvent e){
    }
    public static void main(String[]args){
        HorizontalBoard f = new HorizontalBoard();
    }
}
