import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

 
public class Board extends JFrame implements ActionListener {

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
	JLabel display = new JLabel("Welcome",JLabel.CENTER);
	display.setPreferredSize(new Dimension(11,11));
	wholePane.add(display, BorderLayout.CENTER);
	
	

	
	Dimension dim = new Dimension(50,50);
	Dimension dim1 = new Dimension(52,52);
	JButton a = new JButton("20");
	a.setPreferredSize(dim);
	a.addActionListener(this);
	a.setActionCommand("20");
	JButton b = new JButton("21");
	b.setPreferredSize(dim);
	b.addActionListener(this);
	b.setActionCommand("21");
	JButton c = new JButton("22");
	c.setPreferredSize(dim);
	c.addActionListener(this);
	c.setActionCommand("22");
	JButton d = new JButton("23");
	d.setPreferredSize(dim);
	d.addActionListener(this);
	d.setActionCommand("23");
	JButton e = new JButton("24");
	e.setPreferredSize(dim);
	e.addActionListener(this);
	e.setActionCommand("24");
	JButton f = new JButton("25");
	f.setPreferredSize(dim);
	f.addActionListener(this);
	f.setActionCommand("25");
	JButton g = new JButton("26");
	g.setPreferredSize(dim);
	g.addActionListener(this);
	g.setActionCommand("26");
	JButton h = new JButton("27");
	h.setPreferredSize(dim);	
	h.addActionListener(this);
	h.setActionCommand("27");
	JButton i = new JButton("28");
	i.setPreferredSize(dim);
	i.addActionListener(this);
	i.setActionCommand("28");
	JButton j = new JButton("29");
	j.setPreferredSize(dim);
	j.addActionListener(this);
	j.setActionCommand("29");
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
	
	JButton a1 = new JButton("9");
	a1.setPreferredSize(dim);
	a1.addActionListener(this);
	a1.setActionCommand("9");
	JButton b1 = new JButton("8");
	b1.setPreferredSize(dim);
	b1.addActionListener(this);
	b1.setActionCommand("8");
	JButton c1 = new JButton("7");
	c1.setPreferredSize(dim);
	c1.addActionListener(this);
	c1.setActionCommand("7");
	JButton d1 = new JButton("6");
	d1.setPreferredSize(dim);
	d1.addActionListener(this);
	d1.setActionCommand("6");
	JButton e1 = new JButton("5");
	e1.setPreferredSize(dim);
	e1.addActionListener(this);
	e1.setActionCommand("5");
	JButton f1 = new JButton("4");
	f1.setPreferredSize(dim);
	f1.addActionListener(this);
	f1.setActionCommand("4");
	JButton g1 = new JButton("3");
	g1.setPreferredSize(dim);
	g1.addActionListener(this);
	g1.setActionCommand("3");
	JButton h1 = new JButton("2");
	h1.setPreferredSize(dim);	
	h1.addActionListener(this);
	h1.setActionCommand("2");
	JButton i1 = new JButton("1");
	i1.setPreferredSize(dim);
	i1.addActionListener(this);
	i1.setActionCommand("1");
	JButton j1 = new JButton("0");
	j1.setPreferredSize(dim);
	j1.addActionListener(this);
	j1.setActionCommand("0");
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

	JButton a2 = new JButton("19");
	a2.setPreferredSize(dim1);
	a2.addActionListener(this);
	a2.setActionCommand("19");
	JButton b2 = new JButton("18");
	b2.setPreferredSize(dim1);
	b2.addActionListener(this);
	b2.setActionCommand("18");
	JButton c2 = new JButton("17");
	c2.setPreferredSize(dim1);
	c2.addActionListener(this);
	c2.setActionCommand("17");
	JButton d2 = new JButton("16");
	d2.setPreferredSize(dim1);
	d2.addActionListener(this);
	d2.setActionCommand("16");
	JButton e2 = new JButton("15");
	e2.setPreferredSize(dim1);
	e2.addActionListener(this);
	e2.setActionCommand("15");
	JButton f2 = new JButton("14");
	f2.setPreferredSize(dim1);
	f2.addActionListener(this);
	f2.setActionCommand("14");
	JButton g2 = new JButton("13");
	g2.setPreferredSize(dim1);
	g2.addActionListener(this);
	g2.setActionCommand("13");
	JButton h2 = new JButton("12");
	h2.setPreferredSize(dim1);	
	h2.addActionListener(this);
	h2.setActionCommand("12");
	JButton i2 = new JButton("11");
	i2.setPreferredSize(dim1);
	i2.addActionListener(this);
	i2.setActionCommand("11");
	JButton j2 = new JButton("10");
	j2.setPreferredSize(dim1);	
	j2.addActionListener(this);
	j2.setActionCommand("10");
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

	JButton a3 = new JButton("30");
	a3.setPreferredSize(dim1);
	JButton b3 = new JButton("31");
	b3.setPreferredSize(dim1);
	JButton c3 = new JButton("32");
	c3.setPreferredSize(dim1);
	JButton d3 = new JButton("33");
	d3.setPreferredSize(dim1);
	JButton e3 = new JButton("34");
	e3.setPreferredSize(dim1);
	JButton f3 = new JButton("35");
	f3.setPreferredSize(dim1);
	JButton g3 = new JButton("36");
	g3.setPreferredSize(dim1);
	JButton h3 = new JButton("37");
	h3.setPreferredSize(dim1);	
	JButton i3 = new JButton("38");
	i3.setPreferredSize(dim1);
	JButton j3 = new JButton("39");
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
	frame.setSize(650,600);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("0")) {
	    display.setText("GO!");
	}
    }
    
    public static void main(String[] args) {
      Board g = new Board();
      g.setVisible(true);
    }
}
