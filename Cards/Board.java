import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


 
public class Board extends JFrame implements ActionListener {
    private JTextArea display,Log1;
    private int Money1,Money2,Money3,Money4,turn,position;
    private JLabel a5,b5,c5,d5;
    public Board() {
	Money1 = 1500;
	Money2 = 1500;
	Money3 = 1500;
	Money4 = 1500;
	turn = 0;
	position = 0;

	JLabel p1 = new JLabel("P1",JLabel.LEFT);
	JLabel p2 = new JLabel("P2",JLabel.RIGHT);
	JLabel p3 = new JLabel("P3",JLabel.LEADING);
	JLabel p4 = new JLabel("P4",JLabel.TRAILING);

	Font labelFont = p1.getFont();
	p1.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p2.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p3.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p4.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	
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
	display = new JTextArea("WELCOME");
	display.setEditable(false);
	display.setPreferredSize(new Dimension(150,150));
	wholePane.add(display, BorderLayout.CENTER);
	
	

	
	Dimension dim = new Dimension(42,45);
	Dimension dim1 = new Dimension(48,52);
	
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

	j1.add(p1);
	j1.add(p2);
	j1.add(p3);
	j1.add(p4);
	
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
	a3.addActionListener(this);
	a3.setActionCommand("30");
	JButton b3 = new JButton("31");
	b3.setPreferredSize(dim1);
	b3.addActionListener(this);
	b3.setActionCommand("31");
	JButton c3 = new JButton("32");
	c3.setPreferredSize(dim1);
	c3.addActionListener(this);
	c3.setActionCommand("32");
	JButton d3 = new JButton("33");
	d3.setPreferredSize(dim1);
	d3.addActionListener(this);
	d3.setActionCommand("33");
	JButton e3 = new JButton("34");
	e3.setPreferredSize(dim1);
	e3.addActionListener(this);
	e3.setActionCommand("34");
	JButton f3 = new JButton("35");
	f3.setPreferredSize(dim1);
	f3.addActionListener(this);
	f3.setActionCommand("35");
	JButton g3 = new JButton("36");
	g3.setPreferredSize(dim1);
	g3.addActionListener(this);
	g3.setActionCommand("36");
	JButton h3 = new JButton("37");
	h3.setPreferredSize(dim1);	
	h3.addActionListener(this);
	h3.setActionCommand("37");
	JButton i3 = new JButton("38");
	i3.setPreferredSize(dim1);
	i3.addActionListener(this);
	i3.setActionCommand("38");
	JButton j3 = new JButton("39");
	j3.setPreferredSize(dim1);	
	j3.addActionListener(this);
	j3.setActionCommand("39");
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

	Dimension dim2 = new Dimension(150,150);	
	JButton a4 = new JButton("Roll the Dice");
	a4.setPreferredSize(dim2);		
	a4.addActionListener(this);
	a4.setActionCommand("Dice");
	JButton b4 = new JButton("Buy a House");
	b4.setPreferredSize(dim2);		
	b4.addActionListener(this);
	b4.setActionCommand("House");
	JButton c4 = new JButton("Mortgaging");
	c4.setPreferredSize(dim2);	    
	c4.addActionListener(this);
	c4.setActionCommand("Mortgage");
	JButton d4 = new JButton("Trading");
	d4.setPreferredSize(dim2);	       
	d4.addActionListener(this);
	d4.setActionCommand("Trade");
	JButton e4 = new JButton("Jail Free Card");
	e4.setPreferredSize(dim2);		
	e4.addActionListener(this);
	e4.setActionCommand("Jail Card");
	Buttons.add(a4);
	Buttons.add(b4);
	Buttons.add(c4);
	Buttons.add(d4);
	Buttons.add(e4);

	JPanel Players = new JPanel();
	Players.setLayout(new FlowLayout(FlowLayout.LEFT));

	Dimension dim3 = new Dimension(150,50);	
	a5 = new JLabel("Player 1: ");
	a5.setPreferredSize(dim3);	    	
	b5 = new JLabel("Player 2: ");
	b5.setPreferredSize(dim3);
	c5 = new JLabel("Player 3: ");
	c5.setPreferredSize(dim3);
	d5 = new JLabel("Player 4: ");
	d5.setPreferredSize(dim3);	    	

	
	Players.add(a5);
	Players.add(b5);
	Players.add(c5);
	Players.add(d5);


	//change later
	JPanel Log = new JPanel();
	Log.setLayout(new FlowLayout());

	Log1 = new JTextArea("Log");
	Log1.setEditable(false);
	Log1.setPreferredSize(new Dimension(150,600));
	Log.add(Log1);

	//change later
	JPanel Title = new JPanel();
	Title.setLayout(new FlowLayout());
	
	//outsideLayout.add(Title, BorderLayout.PAGE_START);
	outsideLayout.add(wholePane,BorderLayout.CENTER);
	outsideLayout.add(Buttons, BorderLayout.LINE_START);
     	outsideLayout.add(Players, BorderLayout.PAGE_END);
	outsideLayout.add(Log, BorderLayout.LINE_END);


	JFrame frame =  new JFrame("Monopoly");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(outsideLayout);
	frame.setSize(760,700);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	switch (event) {
	case "0": display.setText("GO");
	    break;
	case "1": display.setText("GO");
	    break;
	case "2": display.setText("GO");
	    break;
	case "3": display.setText("GO");
	    break;
	case "4": display.setText("GO");
	    break;
	case "5": display.setText("GO");
	    break;
	case "6": display.setText("GO");
	    break;
	case "7": display.setText("GO");
	    break;
	case "8": display.setText("GO");
	    break;
	case "9": display.setText("GO");
	    break;
	case "10": display.setText("JAIL \n[VISITING JAIL IF YOU LAND ON IT]");
	    break;
	case "11": display.setText("GO");
	    break;
	case "12": display.setText("GO");
	    break;
	case "13": display.setText("GO");
	    break;
	case "14": display.setText("GO");
	    break;
	case "15": display.setText("GO");
	    break;
	case "16": display.setText("GO");
	    break;
	case "17": display.setText("GO");
	    break;
	case "18": display.setText("GO");
	    break;
	case "19": display.setText("GO");
	    break;
	case "20": display.setText("FREE PARKING");
	    break;
	case "21": display.setText("GO");
	    break;
	case "22": display.setText("GO");
	    break;
	case "23": display.setText("GO");
	    break;
	case "24": display.setText("GO");
	    break;
	case "25": display.setText("GO");
	    break;
	case "26": display.setText("GO");
	    break;
	case "27": display.setText("GO");
	    break;
	case "28": display.setText("GO");
	    break;
	case "29": display.setText("GO");
	    break;
	case "30": display.setText("GO TO JAIL");
	    break;
	case "31": display.setText("GO");
	    break;
	case "32": display.setText("GO");
	    break;
	case "33": display.setText("GO");
	    break;
	case "34": display.setText("GO");
	    break;
	case "35": display.setText("GO");
	    break;
	case "36": display.setText("GO");
	    break;
	case "37": display.setText("GO");
	    break;
	case "38": display.setText("GO");
	    break;
	case "39": display.setText("GO");
	    break;
	}
	//have to add more limitation
	if (event.equals("Dice")) {
	    int randomNum,randomNum1 = 0;
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6); 
	    display.setText("" + randomNum + "," + randomNum1);
	    
	}
	//for player update
	//panel.remove(...);
	//panel.revalidate();
    }
    
    public static void main(String[] args) {
      Board g = new Board();
      g.setVisible(true);
      	ArrayList<Deeds> tiles = new ArrayList<Deeds>(40);
        Deeds a0 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,0,200);
	tiles.add(a0);
	Deeds a1 = new Deeds(1,2,4,10,30,90,160,250,50,30,33,60,0,1,0);
       	tiles.add(a1);
	Deeds a2 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,2,0);	
	tiles.add(a2);
	Deeds a3 = new Deeds(3,4,8,20,60,180,320,450,50,30,33,60,0,3,0);
	tiles.add(a3);
	Deeds a4 = new Deeds(4,0,0,0,0,0,0,0,0,0,0,0,0,4,-200);
	tiles.add(a4);
	Deeds a5 = new Deeds(5,25,0,0,0,0,0,0,0,100,110,200,0,5,0);
	tiles.add(a5);
	Deeds a6 = new Deeds(6,5,10,30,90,270,400,550,50,50,55,100,0,6,0);
	tiles.add(a6);
	Deeds a7 = new Deeds(7,0,0,0,0,0,0,0,0,0,0,0,0,7,0);
	tiles.add(a7);
	Deeds a8 = new Deeds(8,5,10,30,90,270,400,550,50,50,55,100,0,8,0);
	tiles.add(a8);
	Deeds a9 = new Deeds(9,8,16,40,100,300,450,600,50,60,66,120,0,9,0);
	tiles.add(a9);
	Deeds a10 = new Deeds(10,0,0,0,0,0,0,0,0,0,0,0,0,10,0);
	tiles.add(a10);
	Deeds a11 = new Deeds(11,10,20,50,150,450,625,750,100,70,77,140,0,11,0);
	tiles.add(a11);
	Deeds a12 = new Deeds(12,4,10,0,0,0,0,0,0,75,83,150,0,12,0);
	tiles.add(a12);
	Deeds a13 = new Deeds(13,10,20,50,150,450,625,750,100,70,77,140,0,13,0);
	tiles.add(a13);
	Deeds a14 = new Deeds(14,12,24,60,180,500,700,900,100,80,88,160,0,14,0);
	tiles.add(a14);
	Deeds a15 = new Deeds(15,25,0,0,0,0,0,0,0,100,110,200,0,15,0);
	tiles.add(a15);
	Deeds a16 = new Deeds(16,14,28,70,200,550,750,950,100,90,99,180,0,16,0);
	tiles.add(a16);
	Deeds a17 = new Deeds(17,0,0,0,0,0,0,0,0,0,0,0,0,17,0);
	tiles.add(a17);
	Deeds a18 = new Deeds(18,14,28,70,200,550,750,950,100,90,99,180,0,18,0);
	tiles.add(a18);
	Deeds a19 = new Deeds(19,16,32,80,220,600,800,1000,100,100,110,200,0,19,0);
	tiles.add(a19);
	Deeds a20 = new Deeds(20,0,0,0,0,0,0,0,0,0,0,0,0,20,0);
	tiles.add(a20);
	Deeds a21 = new Deeds(21,18,36,90,250,700,875,1050,150,110,121,220,0,21,0);
	tiles.add(a21);
	Deeds a22 = new Deeds(22,0,0,0,0,0,0,0,0,0,0,0,0,22,0);
	tiles.add(a22);
	Deeds a23 = new Deeds(23,18,36,90,250,700,875,1050,150,110,121,220,0,23,0); 
	tiles.add(a23);
	Deeds a24 = new Deeds(24,20,40,100,300,750,925,1100,150,120,132,240,0,24,0);
	tiles.add(a24);
	Deeds a25 = new Deeds(25,25,0,0,0,0,0,0,0,100,110,200,0,25,0);
	tiles.add(a25);
	Deeds a26 = new Deeds(26,22,44,110,330,800,975,1150,150,130,143,260,0,26,0);
	tiles.add(a26);
	Deeds a27 = new Deeds(27,22,44,110,330,800,975,1150,150,130,143,260,0,27,0); 
	tiles.add(a27);
	Deeds a28 = new Deeds(28,4,10,0,0,0,0,0,0,75,83,150,0,28,0);
	tiles.add(a28);
	Deeds a29 = new Deeds(29,24,48,120,360,850,1025,1200,150,140,154,280,0,29,0);
	tiles.add(a29);
	Deeds a30 = new Deeds(30,0,0,0,0,0,0,0,0,0,0,0,0,10,0);
	tiles.add(a30);
	Deeds a31 = new Deeds(31,26,52,130,390,900,1100,1275,200,150,165,300,0,31,0);
	tiles.add(a31);
	Deeds a32 = new Deeds(32,26,52,130,390,900,1100,1275,200,150,165,300,0,32,0);
	tiles.add(a32);
	Deeds a33 = new Deeds(33,0,0,0,0,0,0,0,0,0,0,0,0,33,0);
	tiles.add(a33);
	Deeds a34 = new Deeds(34,28,56,150,450,1000,1200,1400,200,160,176,320,0,34,0);
	tiles.add(a34);
	Deeds a35 = new Deeds(35,25,0,0,0,0,0,0,0,100,110,200,0,35,0);
	tiles.add(a35);
	Deeds a36 = new Deeds(36,0,0,0,0,0,0,0,0,0,0,0,0,36,0);
	tiles.add(a36);
	Deeds a37 = new Deeds(37,35,70,175,500,1100,1300,1500,200,175,193,350,0,37,0);
	tiles.add(a37);
	Deeds a38 = new Deeds(38,0,0,0,0,0,0,0,0,0,0,0,0,38,-100);
	tiles.add(a38);
	Deeds a39 = new Deeds(39,50,100,200,600,1400,1700,2000,200,200,220,400,0,39,0);
	tiles.add(a39);
	System.out.println(tiles.get(1).getPosition());
    }
}
