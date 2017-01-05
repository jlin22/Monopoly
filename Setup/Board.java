import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

 
public class Board extends JFrame { //impolments ActionListener

    public Board() {
	/*this.setTitle("Monopoly");
     this.setSize(800,800);
     this.setLocation(200,0);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(new BorderLayout());
	*/

	JPanel outsideLayout = new JPanel();
	outsideLayout.setLayout(new BorderLayout());
	
	//add in later
	JPanel wholePane = new JPanel();
	//wholePane.setPreferredSize(new Dimension(500, 500));
	wholePane.setLayout(new BorderLayout());

	JPanel tpane = new JPanel();
	tpane.setLayout(new FlowLayout(1,0,0));

	JPanel bpane = new JPanel();
	bpane.setLayout(new FlowLayout(1,0,0));

	JPanel lpane = new JPanel();
	lpane.setLayout(new BoxLayout(lpane, BoxLayout.Y_AXIS));

	JPanel rpane = new JPanel();
	rpane.setLayout(new BoxLayout(rpane, BoxLayout.Y_AXIS));
		
        

	
	wholePane.add(tpane, BorderLayout.PAGE_START);
	wholePane.add(bpane, BorderLayout.PAGE_END);
	wholePane.add(lpane, BorderLayout.LINE_START);
	wholePane.add(rpane, BorderLayout.LINE_END);
	//may change later
	JButton button = new JButton("SPACE");
	button.setPreferredSize(new Dimension(11,11));
	wholePane.add(button, BorderLayout.CENTER);
	
	

	
	Dimension dim = new Dimension(40,40);
	Dimension dim1 = new Dimension(50,50);
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

	JButton a2 = new JButton("");
	a2.setPreferredSize(dim1);
	JButton b2 = new JButton("");
	b2.setPreferredSize(dim1);
	JButton c2 = new JButton("");
	c2.setPreferredSize(dim1);
	JButton d2 = new JButton("");
	d2.setPreferredSize(dim1);
	JButton e2 = new JButton("");
	e2.setPreferredSize(dim1);
	JButton f2 = new JButton("");
	f2.setPreferredSize(dim1);
	JButton g2 = new JButton("");
	g2.setPreferredSize(dim1);
	JButton h2 = new JButton("");
	h2.setPreferredSize(dim1);	
	JButton i2 = new JButton("");
	i2.setPreferredSize(dim1);
	JButton j2 = new JButton("");
	j2.setPreferredSize(dim1);	
	lpane.add(a2);
	lpane.add(b2);
	lpane.add(c2);
	lpane.add(d2);
	lpane.add(e2);
	lpane.add(f2);
	lpane.add(g2);
	lpane.add(h2);
	lpane.add(i2);
	lpane.add(j2);

	JButton a3 = new JButton("");
	a3.setPreferredSize(dim1);
	JButton b3 = new JButton("");
	b3.setPreferredSize(dim1);
	JButton c3 = new JButton("");
	c3.setPreferredSize(dim1);
	JButton d3 = new JButton("");
	d3.setPreferredSize(dim1);
	JButton e3 = new JButton("");
	e3.setPreferredSize(dim1);
	JButton f3 = new JButton("");
	f3.setPreferredSize(dim1);
	JButton g3 = new JButton("");
	g3.setPreferredSize(dim1);
	JButton h3 = new JButton("");
	h3.setPreferredSize(dim1);	
	JButton i3 = new JButton("");
	i3.setPreferredSize(dim1);
	JButton j3 = new JButton("");
	j3.setPreferredSize(dim1);	
	rpane.add(a3);
	rpane.add(b3);
	rpane.add(c3);
	rpane.add(d3);
	rpane.add(e3);
	rpane.add(f3);
	rpane.add(g3);
	rpane.add(h3);
	rpane.add(i3);
	rpane.add(j3);
	

	JPanel Buttons = new JPanel();
	Buttons.setLayout(new BoxLayout(Buttons, BoxLayout.Y_AXIS));

	JButton a4 = new JButton("Roll the Dice");
	JButton b4 = new JButton("Buy a House");
	JButton c4 = new JButton("Mortgaging");
	JButton d4 = new JButton("Trading");
	JButton e4 = new JButton("Jail Free Card");
	Buttons.add(a4);
	Buttons.add(b4);
	Buttons.add(c4);
	Buttons.add(d4);
	Buttons.add(e4);

	JPanel Players = new JPanel();
	Players.setLayout(new FlowLayout());

	//change later
	JPanel Log = new JPanel();
	Log.setLayout(new FlowLayout());

	JPanel Title = new JPanel();
	Title.setLayout(new FlowLayout());
	
	//outsideLayout.add(Title, BorderLayout.PAGE_START);
	outsideLayout.add(wholePane,BorderLayout.CENTER);
	outsideLayout.add(Buttons, BorderLayout.LINE_START);
     	//outsideLayout.add(Players, BorderLayout.PAGE_END);
	//outsideLayout.add(Log, BorderLayout.LINE_END);


	JFrame frame =  new JFrame("Monopoly");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(outsideLayout);
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
 }

  public static void main(String[] args) {
     Board g = new Board();
     g.setVisible(true);
  }
}
