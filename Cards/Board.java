import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


 
public class Board extends JFrame implements ActionListener {
    private JTextArea display,Log1,a5,b5,c5,d5;
    private JLabel p1,p2,p3,p4;
    public String[] Name;
    public ArrayList<Deeds> tiles;
    public JButton[] ButtonsOnBoard;
    public JLabel[] Players;
    public Player[] PlayerNumber;
    public Player Player1,Player2,Player3,Player4;
    public Board() {
	tiles = new ArrayList<Deeds>(40);
	Deeds a01 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,0,200,0);
	tiles.add(a01);
	Deeds a11 = new Deeds(1,2,4,10,30,90,160,250,50,30,33,60,0,1,0,0);
	tiles.add(a11);
	Deeds a21 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0);	
	tiles.add(a21);
	Deeds a31 = new Deeds(3,4,8,20,60,180,320,450,50,30,33,60,0,3,0,0);
	tiles.add(a31);
	Deeds a41 = new Deeds(4,0,0,0,0,0,0,0,0,0,0,0,0,4,-200,0);
	tiles.add(a41);
	Deeds a51 = new Deeds(5,25,0,0,0,0,0,0,0,100,110,200,0,5,0,0);
	tiles.add(a51);
	Deeds a61 = new Deeds(6,5,10,30,90,270,400,550,50,50,55,100,0,6,0,0);
	tiles.add(a61);
	Deeds a71 = new Deeds(7,0,0,0,0,0,0,0,0,0,0,0,0,7,0,0);
      tiles.add(a71);
      Deeds a81 = new Deeds(8,5,10,30,90,270,400,550,50,50,55,100,0,8,0,0);
      tiles.add(a81);
      Deeds a91 = new Deeds(9,8,16,40,100,300,450,600,50,60,66,120,0,9,0,0);
      tiles.add(a91);
      Deeds a101 = new Deeds(10,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0);
      tiles.add(a101);
      Deeds a111 = new Deeds(11,10,20,50,150,450,625,750,100,70,77,140,0,11,0,0);
      tiles.add(a111);
      Deeds a121 = new Deeds(12,4,10,0,0,0,0,0,0,75,83,150,0,12,0,0);
      tiles.add(a121);
      Deeds a131 = new Deeds(13,10,20,50,150,450,625,750,100,70,77,140,0,13,0,0);
      tiles.add(a131);
      Deeds a141 = new Deeds(14,12,24,60,180,500,700,900,100,80,88,160,0,14,0,0);
      tiles.add(a141);
      Deeds a151 = new Deeds(15,25,0,0,0,0,0,0,0,100,110,200,0,15,0,0);
      tiles.add(a151);
      Deeds a161 = new Deeds(16,14,28,70,200,550,750,950,100,90,99,180,0,16,0,0);
      tiles.add(a161);
      Deeds a171 = new Deeds(17,0,0,0,0,0,0,0,0,0,0,0,0,17,0,0);
      tiles.add(a171);
      Deeds a181 = new Deeds(18,14,28,70,200,550,750,950,100,90,99,180,0,18,0,0);
      tiles.add(a181);
      Deeds a191 = new Deeds(19,16,32,80,220,600,800,1000,100,100,110,200,0,19,0,0);
      tiles.add(a191);
      Deeds a201 = new Deeds(20,0,0,0,0,0,0,0,0,0,0,0,0,20,0,0);
      tiles.add(a201);
      Deeds a211 = new Deeds(21,18,36,90,250,700,875,1050,150,110,121,220,0,21,0,0);
      tiles.add(a211);
      Deeds a221 = new Deeds(22,0,0,0,0,0,0,0,0,0,0,0,0,22,0,0);
      tiles.add(a221);
      Deeds a231 = new Deeds(23,18,36,90,250,700,875,1050,150,110,121,220,0,23,0,0); 
      tiles.add(a231);
      Deeds a241 = new Deeds(24,20,40,100,300,750,925,1100,150,120,132,240,0,24,0,0);
      tiles.add(a241);
      Deeds a251 = new Deeds(25,25,0,0,0,0,0,0,0,100,110,200,0,25,0,0);
      tiles.add(a251);
      Deeds a261 = new Deeds(26,22,44,110,330,800,975,1150,150,130,143,260,0,26,0,0);
      tiles.add(a261);
      Deeds a271 = new Deeds(27,22,44,110,330,800,975,1150,150,130,143,260,0,27,0,0); 
      tiles.add(a271);
      Deeds a281 = new Deeds(28,4,10,0,0,0,0,0,0,75,83,150,0,28,0,0);
      tiles.add(a281);
      Deeds a291 = new Deeds(29,24,48,120,360,850,1025,1200,150,140,154,280,0,29,0,0);
      tiles.add(a291);
      Deeds a301 = new Deeds(30,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0);
      tiles.add(a301);
      Deeds a311 = new Deeds(31,26,52,130,390,900,1100,1275,200,150,165,300,0,31,0,0);
      tiles.add(a311);
      Deeds a321 = new Deeds(32,26,52,130,390,900,1100,1275,200,150,165,300,0,32,0,0);
      tiles.add(a321);
      Deeds a331 = new Deeds(33,0,0,0,0,0,0,0,0,0,0,0,0,33,0,0);
      tiles.add(a331);
      Deeds a341 = new Deeds(34,28,56,150,450,1000,1200,1400,200,160,176,320,0,34,0,0);
      tiles.add(a341);
      Deeds a351 = new Deeds(35,25,0,0,0,0,0,0,0,100,110,200,0,35,0,0);
      tiles.add(a351);
      Deeds a361 = new Deeds(36,0,0,0,0,0,0,0,0,0,0,0,0,36,0,0);
      tiles.add(a361);
      Deeds a371 = new Deeds(37,35,70,175,500,1100,1300,1500,200,175,193,350,0,37,0,0);
      tiles.add(a371);
      Deeds a381 = new Deeds(38,0,0,0,0,0,0,0,0,0,0,0,0,38,-100,0);
      tiles.add(a381);
      Deeds a391 = new Deeds(39,50,100,200,600,1400,1700,2000,200,200,220,400,0,39,0,0);
      tiles.add(a391);
      Name = new String[]{"Mediterranean Ave", "Baltic Ave", "Reading Railroad","Oriental Ave","Vermont Ave","Connecticut Ave","St. Charles Place","Electric Company","States Ave","Virginia Ave","Pennsylvania Railroad","St. James Place","Tennessee Avenue","New York Avenue","Kentucky Avenue","Indiana Avenue","Illinois Avenue","B&O Railroad","Atlantic Avenue","Ventnor Avenue","Water Work","Marvin Gardens","Pacific Avenue","North Carolina Avenue","Pennsylvania Avenue","Short Line","Park Place","Boardwalk"};

	p1 = new JLabel("P1",JLabel.LEFT);
	p2 = new JLabel("P2",JLabel.RIGHT);
	p3 = new JLabel("P3",JLabel.LEADING);
	p4 = new JLabel("P4",JLabel.TRAILING);

	Font labelFont = p1.getFont();
	p1.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p2.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p3.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));
	p4.setFont(new Font(labelFont.getName(), Font.PLAIN, 50));

	Players = new JLabel[4];
	Players[0] = p1;
	Players[1] = p2;
	Players[2] = p3;
	Players[3] = p4;
	
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
      	JButton b = new JButton("21");
	JButton c = new JButton("22");
	JButton d = new JButton("23");
	JButton e = new JButton("24");
	JButton f = new JButton("25");
	JButton g = new JButton("26");
	JButton h = new JButton("27");
	JButton i = new JButton("28");
	JButton j = new JButton("29");
	
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
	JButton b1 = new JButton("8");
	JButton c1 = new JButton("7");
	JButton d1 = new JButton("6");
	JButton e1 = new JButton("5");
	JButton f1 = new JButton("4");
	JButton g1 = new JButton("3");
	JButton h1 = new JButton("2");
	JButton i1 = new JButton("1");
	JButton j1 = new JButton("0");

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
	JButton b2 = new JButton("18");
	JButton c2 = new JButton("17");
	JButton d2 = new JButton("16");
	JButton e2 = new JButton("15");
	JButton f2 = new JButton("14");
	JButton g2 = new JButton("13");
	JButton h2 = new JButton("12");
	JButton i2 = new JButton("11");
	JButton j2 = new JButton("10");

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
	JButton b3 = new JButton("31");
	JButton c3 = new JButton("32");
	JButton d3 = new JButton("33");
	JButton e3 = new JButton("34");
	JButton f3 = new JButton("35");
	JButton g3 = new JButton("36");
	JButton h3 = new JButton("37");
	JButton i3 = new JButton("38");
	JButton j3 = new JButton("39");

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


	ButtonsOnBoard = new JButton[40];
	ButtonsOnBoard[0] = j1;
	ButtonsOnBoard[1] = i1;
	ButtonsOnBoard[2] = h1;
	ButtonsOnBoard[3] = g1;
	ButtonsOnBoard[4] = f1;
	ButtonsOnBoard[5] = e1;
	ButtonsOnBoard[6] = d1;
	ButtonsOnBoard[7]  = c1;
	ButtonsOnBoard[8] = b1;
	ButtonsOnBoard[9] = a1;
	ButtonsOnBoard[10] = j2;
	ButtonsOnBoard[11] = i2;
	ButtonsOnBoard[12] = h2;
	ButtonsOnBoard[13] = g2;
	ButtonsOnBoard[14] = f2;
	ButtonsOnBoard[15] = e2;
	ButtonsOnBoard[16] = d2;
	ButtonsOnBoard[17] = c2;
	ButtonsOnBoard[18] = b2;
	ButtonsOnBoard[19] = a2;
	ButtonsOnBoard[20] = a;
	ButtonsOnBoard[21] = b;
	ButtonsOnBoard[22] = c;
	ButtonsOnBoard[23] = d;
	ButtonsOnBoard[24] = e;
	ButtonsOnBoard[25] = f;
	ButtonsOnBoard[26] = g;
	ButtonsOnBoard[27] = h;
	ButtonsOnBoard[28] = i;
	ButtonsOnBoard[29] = j;
	ButtonsOnBoard[30] = a3;
	ButtonsOnBoard[31] = b3;
	ButtonsOnBoard[32] = c3;
	ButtonsOnBoard[33] = d3;
	ButtonsOnBoard[34] = e3;
	ButtonsOnBoard[35] = f3;
	ButtonsOnBoard[36] = g3;
	ButtonsOnBoard[37] = h3;
	ButtonsOnBoard[38] = i3;
	ButtonsOnBoard[39] = j3;

	for (int ii = 0; ii < 40; ii++) {
	    ButtonsOnBoard[ii].setPreferredSize(dim);
	    ButtonsOnBoard[ii].addActionListener(this);
	    ButtonsOnBoard[ii].setActionCommand("" + ii + "");
	    if (ii >= 30 || (ii >= 10 && ii < 20)){
		ButtonsOnBoard[ii].setPreferredSize(dim1);	
	    }
	}
	
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
	a5 = new JTextArea("Player 1: ");
	a5.setPreferredSize(dim3);	    	
	b5 = new JTextArea("Player 2: ");
	b5.setPreferredSize(dim3);
	c5 = new JTextArea("Player 3: ");
	c5.setPreferredSize(dim3);
	d5 = new JTextArea("Player 4: ");
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
    Rules rule = new Rules();
    /*
    Player1 = new Player();
    Player2 = new Player();
    Player3 = new Player();
    Player4 = new Player();
    
    PlayerNumber = new Player[4];
    PlayerNumber[1] = Player1;
    PlayerNumber[2] = Player2;
    PlayerNumber[3] = Player3;
    PlayerNumber[4] = Players4;
    */
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	switch (event) {
	case "0": display.setText("GO") ;
	    break;
	case "1": display.setText("Name: " + Name[0] + "\nCost: " + tiles.get(1).getCost() + "\nRent: " + tiles.get(1).getRent() + "\nRent of 1 House:" + tiles.get(1).getRent1H() + "\nRent of 2 House: " + tiles.get(1).getRent2H() + "\nRent of 3 House: " + tiles.get(1).getRent3H() + "\nRent of 4 Houses: " + tiles.get(1).getRent4H() + "\nRent of Hotel: " + tiles.get(1).getHotel() + "\nCost of Buying a House: " + tiles.get(1).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(1).getHouseCost() + "\nMortgage Cost: " + tiles.get(1).getMortgage() + "\nUnmortgage Cost: " + tiles.get(1).getUnmortgage() +"\nOwned By Player: "+ tiles.get(1).getOwnedBy());
	    break;
	case "2": display.setText("Name: Community Chest\nDraw a Community Chest Card");
	    break;
	case "3": display.setText("Name: " + Name[1] + "\nCost: " + tiles.get(3).getCost() + "\nRent: " + tiles.get(3).getRent() + "\nRent of 1 House:" + tiles.get(3).getRent1H() + "\nRent of 2 House: " + tiles.get(3).getRent2H() + "\nRent of 3 House: " + tiles.get(3).getRent3H() + "\nRent of 4 Houses: " + tiles.get(3).getRent4H() + "\nRent of Hotel: " + tiles.get(3).getHotel() + "\nCost of Buying a House: " + tiles.get(3).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(3).getHouseCost() + "\nMortgage Cost: " + tiles.get(3).getMortgage() + "\nUnmortgage Cost: " + tiles.get(3).getUnmortgage() + "\nOwned By Player: "+ tiles.get(3).getOwnedBy());
	    break;
	case "4": display.setText("Name: Income Tax\nPay 200");
	    break;
	case "5": display.setText("Name: " + Name[2] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(5).getOwnedBy());
	    break;
	case "6": display.setText("Name: " + Name[3] + "\nCost: " + tiles.get(6).getCost() + "\nRent: " + tiles.get(6).getRent() + "\nRent of 1 House:" + tiles.get(6).getRent1H() + "\nRent of 2 House: " + tiles.get(6).getRent2H() + "\nRent of 3 House: " + tiles.get(6).getRent3H() + "\nRent of 4 Houses: " + tiles.get(6).getRent4H() + "\nRent of Hotel: " + tiles.get(6).getHotel() + "\nCost of Buying a House: " + tiles.get(6).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(6).getHouseCost() + "\nMortgage Cost: " + tiles.get(6).getMortgage() + "\nUnmortgage Cost: " + tiles.get(6).getUnmortgage()+ "\nOwned By Player: "+ tiles.get(6).getOwnedBy());
	    break;
	case "7": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "8": display.setText("Name: " + Name[4] + "\nCost: " + tiles.get(8).getCost() + "\nRent: " + tiles.get(8).getRent() + "\nRent of 1 House:" + tiles.get(8).getRent1H() + "\nRent of 2 House: " + tiles.get(8).getRent2H() + "\nRent of 3 House: " + tiles.get(8).getRent3H() + "\nRent of 4 Houses: " + tiles.get(8).getRent4H() + "\nRent of Hotel: " + tiles.get(8).getHotel() + "\nCost of Buying a House: " + tiles.get(8).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(8).getHouseCost() + "\nMortgage Cost: " + tiles.get(8).getMortgage() + "\nUnmortgage Cost: " + tiles.get(8).getUnmortgage() + "\nOwned By Player: "+ tiles.get(8).getOwnedBy());
	    break;
	case "9": display.setText("Name: " + Name[5] + "\nCost: " + tiles.get(9).getCost() + "\nRent: " + tiles.get(9).getRent() + "\nRent of 1 House:" + tiles.get(9).getRent1H() + "\nRent of 2 House: " + tiles.get(9).getRent2H() + "\nRent of 3 House: " + tiles.get(9).getRent3H() + "\nRent of 4 Houses: " + tiles.get(9).getRent4H() + "\nRent of Hotel: " + tiles.get(9).getHotel() + "\nCost of Buying a House: " + tiles.get(9).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(9).getHouseCost() + "\nMortgage Cost: " + tiles.get(9).getMortgage() + "\nUnmortgage Cost: " + tiles.get(9).getUnmortgage() + "\nOwned By Player: "+ tiles.get(9).getOwnedBy());
	    break;
	case "10": display.setText("Jail \n[JUST VISITING JAIL IF YOU LAND ON IT]");
	    break;
	case "11": display.setText("Name: " + Name[6] + "\nCost: " + tiles.get(11).getCost() + "\nRent: " + tiles.get(11).getRent() + "\nRent of 1 House:" + tiles.get(11).getRent1H() + "\nRent of 2 House: " + tiles.get(11).getRent2H() + "\nRent of 3 House: " + tiles.get(11).getRent3H() + "\nRent of 4 Houses: " + tiles.get(11).getRent4H() + "\nRent of Hotel: " + tiles.get(11).getHotel() + "\nCost of Buying a House: " + tiles.get(11).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(11).getHouseCost() + "\nMortgage Cost: " + tiles.get(11).getMortgage() + "\nUnmortgage Cost: " + tiles.get(11).getUnmortgage() + "\nOwned By Player: "+ tiles.get(11).getOwnedBy());
	    break;
	case "12": display.setText("Name: " + Name[7] + "\nCost: " + tiles.get(28).getCost() + "\nRent: 4 times the number rolled on the dice" + "\nRent with Monpoly: 10 times the number rolled on the dice" + "\nMortgage Cost: " + tiles.get(28).getMortgage() + "\nUnmortgage Cost: " + tiles.get(28).getUnmortgage() + "\nOwned By Player: "+ tiles.get(12).getOwnedBy());
	    break;
	case "13": display.setText("Name: " + Name[8] + "\nCost: " + tiles.get(13).getCost() + "\nRent: " + tiles.get(13).getRent() + "\nRent of 1 House:" + tiles.get(13).getRent1H() + "\nRent of 2 House: " + tiles.get(13).getRent2H() + "\nRent of 3 House: " + tiles.get(13).getRent3H() + "\nRent of 4 Houses: " + tiles.get(13).getRent4H() + "\nRent of Hotel: " + tiles.get(13).getHotel() + "\nCost of Buying a House: " + tiles.get(13).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(13).getHouseCost() + "\nMortgage Cost: " + tiles.get(13).getMortgage() + "\nUnmortgage Cost: " + tiles.get(13).getUnmortgage() + "\nOwned By Player: "+ tiles.get(13).getOwnedBy());
	    break;
	case "14": display.setText("Name: " + Name[9] + "\nCost: " + tiles.get(14).getCost() + "\nRent: " + tiles.get(14).getRent() + "\nRent of 1 House:" + tiles.get(14).getRent1H() + "\nRent of 2 House: " + tiles.get(14).getRent2H() + "\nRent of 3 House: " + tiles.get(14).getRent3H() + "\nRent of 4 Houses: " + tiles.get(14).getRent4H() + "\nRent of Hotel: " + tiles.get(14).getHotel() + "\nCost of Buying a House: " + tiles.get(14).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(14).getHouseCost() + "\nMortgage Cost: " + tiles.get(14).getMortgage() + "\nUnmortgage Cost: " + tiles.get(14).getUnmortgage() + "\nOwned By Player: "+ tiles.get(14).getOwnedBy());
	    break;
	case "15": display.setText("Name: " + Name[10] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(15).getOwnedBy());
	    break;
	case "16": display.setText("Name: " + Name[11] + "\nCost: " + tiles.get(16).getCost() + "\nRent: " + tiles.get(16).getRent() + "\nRent of 1 House:" + tiles.get(16).getRent1H() + "\nRent of 2 House: " + tiles.get(16).getRent2H() + "\nRent of 3 House: " + tiles.get(16).getRent3H() + "\nRent of 4 Houses: " + tiles.get(16).getRent4H() + "\nRent of Hotel: " + tiles.get(16).getHotel() + "\nCost of Buying a House: " + tiles.get(16).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(16).getHouseCost() + "\nMortgage Cost: " + tiles.get(16).getMortgage() + "\nUnmortgage Cost: " + tiles.get(16).getUnmortgage() + "\nOwned By Player: "+ tiles.get(16).getOwnedBy());
	    break;
	case "17": display.setText("Name: Community Chest\nDraw a Community Chest Card");
	    break;
	case "18": display.setText("Name: " + Name[12] + "\nCost: " + tiles.get(18).getCost() + "\nRent: " + tiles.get(18).getRent() + "\nRent of 1 House:" + tiles.get(18).getRent1H() + "\nRent of 2 House: " + tiles.get(18).getRent2H() + "\nRent of 3 House: " + tiles.get(18).getRent3H() + "\nRent of 4 Houses: " + tiles.get(18).getRent4H() + "\nRent of Hotel: " + tiles.get(18).getHotel() + "\nCost of Buying a House: " + tiles.get(18).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(18).getHouseCost() + "\nMortgage Cost: " + tiles.get(18).getMortgage() + "\nUnmortgage Cost: " + tiles.get(18).getUnmortgage() + "\nOwned By Player: "+ tiles.get(18).getOwnedBy());
	    break;
	case "19": display.setText("Name: " + Name[13] + "\nCost: " + tiles.get(19).getCost() + "\nRent: " + tiles.get(19).getRent() + "\nRent of 1 House:" + tiles.get(19).getRent1H() + "\nRent of 2 House: " + tiles.get(19).getRent2H() + "\nRent of 3 House: " + tiles.get(19).getRent3H() + "\nRent of 4 Houses: " + tiles.get(19).getRent4H() + "\nRent of Hotel: " + tiles.get(19).getHotel() + "\nCost of Buying a House: " + tiles.get(19).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(19).getHouseCost() + "\nMortgage Cost: " + tiles.get(19).getMortgage() + "\nUnmortgage Cost: " + tiles.get(19).getUnmortgage() + "\nOwned By Player: "+ tiles.get(19).getOwnedBy());
	    break;
	case "20": display.setText("FREE PARKING\nNothing Happens!");
	    break;
	case "21": display.setText("Name: " + Name[14] + "\nCost: " + tiles.get(21).getCost() + "\nRent: " + tiles.get(21).getRent() + "\nRent of 1 House:" + tiles.get(21).getRent1H() + "\nRent of 2 House: " + tiles.get(21).getRent2H() + "\nRent of 3 House: " + tiles.get(21).getRent3H() + "\nRent of 4 Houses: " + tiles.get(21).getRent4H() + "\nRent of Hotel: " + tiles.get(21).getHotel() + "\nCost of Buying a House: " + tiles.get(21).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(21).getHouseCost() + "\nMortgage Cost: " + tiles.get(21).getMortgage() + "\nUnmortgage Cost: " + tiles.get(21).getUnmortgage() + "\nOwned By Player: "+ tiles.get(21).getOwnedBy());
	    break;
	case "22": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "23": display.setText("Name: " + Name[15] + "\nCost: " + tiles.get(23).getCost() + "\nRent: " + tiles.get(23).getRent() + "\nRent of 1 House:" + tiles.get(23).getRent1H() + "\nRent of 2 House: " + tiles.get(23).getRent2H() + "\nRent of 3 House: " + tiles.get(23).getRent3H() + "\nRent of 4 Houses: " + tiles.get(23).getRent4H() + "\nRent of Hotel: " + tiles.get(23).getHotel() + "\nCost of Buying a House: " + tiles.get(23).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(23).getHouseCost() + "\nMortgage Cost: " + tiles.get(23).getMortgage() + "\nUnmortgage Cost: " + tiles.get(23).getUnmortgage() + "\nOwned By Player: "+ tiles.get(23).getOwnedBy());
	    break;
	case "24": display.setText("Name: " + Name[16] + "\nCost: " + tiles.get(24).getCost() + "\nRent: " + tiles.get(24).getRent() + "\nRent of 1 House:" + tiles.get(24).getRent1H() + "\nRent of 2 House: " + tiles.get(24).getRent2H() + "\nRent of 3 House: " + tiles.get(24).getRent3H() + "\nRent of 4 Houses: " + tiles.get(24).getRent4H() + "\nRent of Hotel: " + tiles.get(24).getHotel() + "\nCost of Buying a House: " + tiles.get(24).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(24).getHouseCost() + "\nMortgage Cost: " + tiles.get(24).getMortgage() + "\nUnmortgage Cost: " + tiles.get(24).getUnmortgage() + "\nOwned By Player: "+ tiles.get(24).getOwnedBy());
	    break;
	case "25": display.setText("Name: " + Name[17] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(25).getOwnedBy());
	    break;
	case "26": display.setText("Name: " + Name[18] + "\nCost: " + tiles.get(26).getCost() + "\nRent: " + tiles.get(26).getRent() + "\nRent of 1 House:" + tiles.get(26).getRent1H() + "\nRent of 2 House: " + tiles.get(26).getRent2H() + "\nRent of 3 House: " + tiles.get(26).getRent3H() + "\nRent of 4 Houses: " + tiles.get(26).getRent4H() + "\nRent of Hotel: " + tiles.get(26).getHotel() + "\nCost of Buying a House: " + tiles.get(26).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(26).getHouseCost() + "\nMortgage Cost: " + tiles.get(26).getMortgage() + "\nUnmortgage Cost: " + tiles.get(26).getUnmortgage() + "\nOwned By Player: "+ tiles.get(26).getOwnedBy());
	    break;
	case "27": display.setText("Name: " + Name[19] + "\nCost: " + tiles.get(27).getCost() + "\nRent: " + tiles.get(27).getRent() + "\nRent of 1 House:" + tiles.get(27).getRent1H() + "\nRent of 2 House: " + tiles.get(27).getRent2H() + "\nRent of 3 House: " + tiles.get(27).getRent3H() + "\nRent of 4 Houses: " + tiles.get(27).getRent4H() + "\nRent of Hotel: " + tiles.get(27).getHotel() + "\nCost of Buying a House: " + tiles.get(27).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(27).getHouseCost() + "\nMortgage Cost: " + tiles.get(27).getMortgage() + "\nUnmortgage Cost: " + tiles.get(27).getUnmortgage() + "\nOwned By Player: "+ tiles.get(27).getOwnedBy());
	    break;
	case "28": display.setText("Name: " + Name[20] + "\nCost: " + tiles.get(28).getCost() + "\nRent: 4 times the number rolled on the dice" + "\nRent with Monpoly: 10 times the number rolled on the dice" + "\nMortgage Cost: " + tiles.get(28).getMortgage() + "\nUnmortgage Cost: " + tiles.get(28).getUnmortgage() + "\nOwned By Player: "+ tiles.get(28).getOwnedBy());
	    break;
	case "29": display.setText("Name: " + Name[21] + "\nCost: " + tiles.get(29).getCost() + "\nRent: " + tiles.get(29).getRent() + "\nRent of 1 House:" + tiles.get(29).getRent1H() + "\nRent of 2 House: " + tiles.get(29).getRent2H() + "\nRent of 3 House: " + tiles.get(29).getRent3H() + "\nRent of 4 Houses: " + tiles.get(29).getRent4H() + "\nRent of Hotel: " + tiles.get(29).getHotel() + "\nCost of Buying a House: " + tiles.get(29).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(29).getHouseCost() + "\nMortgage Cost: " + tiles.get(29).getMortgage() + "\nUnmortgage Cost: " + tiles.get(29).getUnmortgage() + "\nOwned By Player: "+ tiles.get(29).getOwnedBy());
	    break;
	case "30": display.setText("GO TO JAIL");
	    break;
	case "31": display.setText("Name: " + Name[22] + "\nCost: " + tiles.get(31).getCost() + "\nRent: " + tiles.get(31).getRent() + "\nRent of 1 House:" + tiles.get(31).getRent1H() + "\nRent of 2 House: " + tiles.get(31).getRent2H() + "\nRent of 3 House: " + tiles.get(31).getRent3H() + "\nRent of 4 Houses: " + tiles.get(31).getRent4H() + "\nRent of Hotel: " + tiles.get(31).getHotel() + "\nCost of Buying a House: " + tiles.get(31).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(31).getHouseCost() + "\nMortgage Cost: " + tiles.get(31).getMortgage() + "\nUnmortgage Cost: " + tiles.get(31).getUnmortgage() + "\nOwned By Player: "+ tiles.get(31).getOwnedBy());
	    break;
	    case "32": display.setText("Name: " + Name[23] + "\nCost: " + tiles.get(32).getCost() + "\nRent: " + tiles.get(32).getRent() + "\nRent of 1 House:" + tiles.get(32).getRent1H() + "\nRent of 2 House: " + tiles.get(32).getRent2H() + "\nRent of 3 House: " + tiles.get(32).getRent3H() + "\nRent of 4 Houses: " + tiles.get(32).getRent4H() + "\nRent of Hotel: " + tiles.get(32).getHotel() + "\nCost of Buying a House: " + tiles.get(32).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(32).getHouseCost() + "\nMortgage Cost: " + tiles.get(32).getMortgage() + "\nUnmortgage Cost: " + tiles.get(32).getUnmortgage() + "\nOwned By Player: "+ tiles.get(32).getOwnedBy());
	    break;
	case "33": display.setText("Name: Community Chest\n Draw a Community Chest Card");
	    break;
	case "34": display.setText("Name: " + Name[24] + "\nCost: " + tiles.get(34).getCost() + "\nRent: " + tiles.get(34).getRent() + "\nRent of 1 House:" + tiles.get(34).getRent1H() + "\nRent of 2 House: " + tiles.get(34).getRent2H() + "\nRent of 3 House: " + tiles.get(34).getRent3H() + "\nRent of 4 Houses: " + tiles.get(34).getRent4H() + "\nRent of Hotel: " + tiles.get(34).getHotel() + "\nCost of Buying a House: " + tiles.get(34).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(34).getHouseCost() + "\nMortgage Cost: " + tiles.get(34).getMortgage() + "\nUnmortgage Cost: " + tiles.get(34).getUnmortgage()  + "\nOwned By Player: "+ tiles.get(34).getOwnedBy());
	    break;
	case "35": display.setText("Name: " + Name[25] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(35).getOwnedBy());
	    break;
	case "36": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "37": display.setText("Name: " + Name[26] + "\nCost: " + tiles.get(37).getCost() + "\nRent: " + tiles.get(37).getRent() + "\nRent of 1 House:" + tiles.get(37).getRent1H() + "\nRent of 2 House: " + tiles.get(37).getRent2H() + "\nRent of 3 House: " + tiles.get(37).getRent3H() + "\nRent of 4 Houses: " + tiles.get(37).getRent4H() + "\nRent of Hotel: " + tiles.get(37).getHotel() + "\nCost of Buying a House: " + tiles.get(37).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(37).getHouseCost() + "\nMortgage Cost: " + tiles.get(37).getMortgage() + "\nUnmortgage Cost: " + tiles.get(37).getUnmortgage() + "\nOwned By Player: "+ tiles.get(37).getOwnedBy());
	    break;
	case "38": display.setText("Name: Super Tax\nPay 100");
	    break;
	    case "39": display.setText("Name: " + Name[27] + "\nCost: " + tiles.get(39).getCost() + "\nRent: " + tiles.get(39).getRent() + "\nRent of 1 House:" + tiles.get(39).getRent1H() + "\nRent of 2 House: " + tiles.get(39).getRent2H() + "\nRent of 3 House: " + tiles.get(39).getRent3H() + "\nRent of 4 Houses: " + tiles.get(39).getRent4H() + "\nRent of Hotel: " + tiles.get(39).getHotel() + "\nCost of Buying a House: " + tiles.get(39).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(39).getHouseCost() + "\nMortgage Cost: " + tiles.get(39).getMortgage() + "\nUnmortgage Cost: " + tiles.get(39).getUnmortgage() + "\nOwned By Player: "+ tiles.get(39).getOwnedBy());
	    break;
	}
	//have to add more limitation
	if (event.equals("Dice")){
	    int randomNum,randomNum1 = 0;
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6); 
	    display.setText("" + randomNum + "," + randomNum1);
	    int x = rule.getPlayerGoing();
		ButtonsOnBoard[Player1.getPosition()].remove(Players[x]);
		int newPosition = Player1.getPosition() + randomNum + randomNum1;
		ButtonsOnBoard[newPosition].add(Players[x]);
	    
	       
	}
	
	   
	//for player update
	//panel.remove(...);
	//panel.revalidate();
    }
    
    public static void main(String[] args) {
      Board g = new Board();
      g.setVisible(true);
    }
}
