import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
 
public class Board extends JFrame implements ActionListener {
    private JTextArea display,Log1,a5,b5,c5,d5,TurnDisplay;
    private JTextField textField;
    private JButton Enter;
    private JLabel p1,p2,p3,p4;
    private String[] Name,playerName;
    private ArrayList<Deeds> tiles;
    private JButton[] ButtonsOnBoard;
    private JLabel[] Players;
    private ArrayList<Player> PlayerNumber;
    private int randomNum,randomNum1,doubleRolls,jailCounter,temp,houseCount,hotelCount,counter,highestBid,highestNumber,roll1,roll2,roll3,roll4,playerWithHighestNumber,trading1,tradedTile,tradedMoney;
    private boolean rolls,hasMonopoly,hasHouse,hasHotel,charged,player1Dead,player2Dead,player3Dead,player4Dead,trigger;
    private boolean[] playerDead;
    private boolean trading3, gameStart,setNickname,setTurns,mortgagingHouse,trading;
    
    
    public Board() {
	trading3 = false;
	trading = false;
	setTurns = false;
	setNickname = false;
	gameStart = true;
	houseCount = 32;
	hotelCount = 12;
	playerDead = new boolean[4];
	playerDead[0] = player1Dead;
	playerDead[1] = player2Dead;
	playerDead[2] = player3Dead;
	playerDead[3] = player4Dead;
	for (int i = 0; i < 4; i++) {
	    playerDead[i] = false;
	}
	charged = false;
	rolls = true;
	PlayerNumber = new ArrayList<Player>(4);
	Player one = new Player();
	PlayerNumber.add(one);
	Player two = new Player();
	PlayerNumber.add(two);
	Player three = new Player();
	PlayerNumber.add(three);
	Player four = new Player();
	PlayerNumber.add(four);

	tiles = new ArrayList<Deeds>(40);
	Deeds a01 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,0,200,-1,0);
	tiles.add(a01);
	Deeds a11 = new Deeds(1,2,4,10,30,90,160,250,50,30,33,60,0,1,0,0,1);
	tiles.add(a11);
	Deeds a21 = new Deeds(2,0,0,0,0,0,0,0,0,0,0,0,0,2,0,-1,0);	
	tiles.add(a21);
	Deeds a31 = new Deeds(3,4,8,20,60,180,320,450,50,30,33,60,0,3,0,0,2);
	tiles.add(a31);
	Deeds a41 = new Deeds(4,0,0,0,0,0,0,0,0,0,0,0,0,4,-200,-1,0);
	tiles.add(a41);
	Deeds a51 = new Deeds(5,25,0,0,0,0,0,0,0,100,110,200,0,5,0,0,0);
	tiles.add(a51);
	Deeds a61 = new Deeds(6,5,10,30,90,270,400,550,50,50,55,100,0,6,0,0,1);
	tiles.add(a61);
	Deeds a71 = new Deeds(7,0,0,0,0,0,0,0,0,0,0,0,0,7,0,-1,0);
      tiles.add(a71);
      Deeds a81 = new Deeds(8,5,10,30,90,270,400,550,50,50,55,100,0,8,0,0,2);
      tiles.add(a81);
      Deeds a91 = new Deeds(9,8,16,40,100,300,450,600,50,60,66,120,0,9,0,0,3);
      tiles.add(a91);
      Deeds a101 = new Deeds(10,0,0,0,0,0,0,0,0,0,0,0,0,10,0,-1,0);
      tiles.add(a101);
      Deeds a111 = new Deeds(11,10,20,50,150,450,625,750,100,70,77,140,0,11,0,0,1);
      tiles.add(a111);
      Deeds a121 = new Deeds(12,4,10,0,0,0,0,0,0,75,83,150,0,12,0,0,0);
      tiles.add(a121);
      Deeds a131 = new Deeds(13,10,20,50,150,450,625,750,100,70,77,140,0,13,0,0,2);
      tiles.add(a131);
      Deeds a141 = new Deeds(14,12,24,60,180,500,700,900,100,80,88,160,0,14,0,0,3);
      tiles.add(a141);
      Deeds a151 = new Deeds(15,25,0,0,0,0,0,0,0,100,110,200,0,15,0,0,0);
      tiles.add(a151);
      Deeds a161 = new Deeds(16,14,28,70,200,550,750,950,100,90,99,180,0,16,0,0,1);
      tiles.add(a161);
      Deeds a171 = new Deeds(17,0,0,0,0,0,0,0,0,0,0,0,0,17,0,-1,0);
      tiles.add(a171);
      Deeds a181 = new Deeds(18,14,28,70,200,550,750,950,100,90,99,180,0,18,0,0,2);
      tiles.add(a181);
      Deeds a191 = new Deeds(19,16,32,80,220,600,800,1000,100,100,110,200,0,19,0,0,3);
      tiles.add(a191);
      Deeds a201 = new Deeds(20,0,0,0,0,0,0,0,0,0,0,0,0,20,0,-1,0);
      tiles.add(a201);
      Deeds a211 = new Deeds(21,18,36,90,250,700,875,1050,150,110,121,220,0,21,0,0,1);
      tiles.add(a211);
      Deeds a221 = new Deeds(22,0,0,0,0,0,0,0,0,0,0,0,0,22,0,-1,0);
      tiles.add(a221);
      Deeds a231 = new Deeds(23,18,36,90,250,700,875,1050,150,110,121,220,0,23,0,0,2); 
      tiles.add(a231);
      Deeds a241 = new Deeds(24,20,40,100,300,750,925,1100,150,120,132,240,0,24,0,0,3);
      tiles.add(a241);
      Deeds a251 = new Deeds(25,25,0,0,0,0,0,0,0,100,110,200,0,25,0,0,0);
      tiles.add(a251);
      Deeds a261 = new Deeds(26,22,44,110,330,800,975,1150,150,130,143,260,0,26,0,0,1);
      tiles.add(a261);
      Deeds a271 = new Deeds(27,22,44,110,330,800,975,1150,150,130,143,260,0,27,0,0,2); 
      tiles.add(a271);
      Deeds a281 = new Deeds(28,4,10,0,0,0,0,0,0,75,83,150,0,28,0,0,0);
      tiles.add(a281);
      Deeds a291 = new Deeds(29,24,48,120,360,850,1025,1200,150,140,154,280,0,29,0,0,3);
      tiles.add(a291);
      Deeds a301 = new Deeds(30,0,0,0,0,0,0,0,0,0,0,0,0,10,0,-1,0);
      tiles.add(a301);
      Deeds a311 = new Deeds(31,26,52,130,390,900,1100,1275,200,150,165,300,0,31,0,0,1);
      tiles.add(a311);
      Deeds a321 = new Deeds(32,26,52,130,390,900,1100,1275,200,150,165,300,0,32,0,0,2);
      tiles.add(a321);
      Deeds a331 = new Deeds(33,0,0,0,0,0,0,0,0,0,0,0,0,33,0,-1,0);
      tiles.add(a331);
      Deeds a341 = new Deeds(34,28,56,150,450,1000,1200,1400,200,160,176,320,0,34,0,0,3);
      tiles.add(a341);
      Deeds a351 = new Deeds(35,25,0,0,0,0,0,0,0,100,110,200,0,35,0,0,0);
      tiles.add(a351);
      Deeds a361 = new Deeds(36,0,0,0,0,0,0,0,0,0,0,0,0,36,0,-1,0);
      tiles.add(a361);
      Deeds a371 = new Deeds(37,35,70,175,500,1100,1300,1500,200,175,193,350,0,37,0,0,1);
      tiles.add(a371);
      Deeds a381 = new Deeds(38,0,0,0,0,0,0,0,0,0,0,0,0,38,-100,-1,0);
      tiles.add(a381);
      Deeds a391 = new Deeds(39,50,100,200,600,1400,1700,2000,200,200,220,400,0,39,0,0,2);
      tiles.add(a391);
      Name = new String[]{"GO", "Mediterranean Ave", "Community Chest","Baltic Ave", "Income Tax","Reading Railroad","Oriental Ave","Chance","Vermont Ave","Connecticut Ave","Jail(Just Visiting Jail If You Land On It)", "St. Charles Place","Electric Company","States Ave","Virginia Ave","Pennsylvania Railroad","St. James Place","Community Chest","Tennessee Avenue","New York Avenue","Free Parking","Kentucky Avenue","Chance","Indiana Avenue","Illinois Avenue","B&O Railroad","Atlantic Avenue","Ventnor Avenue","Water Work","Marvin Gardens","Go To Jail", "Pacific Avenue","North Carolina Avenue","Community Chest","Pennsylvania Avenue","Short Line","Chance","Park Place", "Luxury Tax","Boardwalk"};

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

	
	display = new JTextArea("Type in a number on the bottom corner to declare how many players are playing. Then, press enter.");
	display.setEditable(false);
	display.setLineWrap(true);
	display.setWrapStyleWord(true);
	display.setPreferredSize(new Dimension(150,150));
	wholePane.add(display, BorderLayout.CENTER);
		
	Dimension dim = new Dimension(42,45);
	Dimension dim1 = new Dimension(48,52);
	
	JButton a = new JButton("20");
      	JButton b = new JButton("21");
	b.setBackground(Color.RED);
	JButton c = new JButton("22");
	JButton d = new JButton("23");
	d.setBackground(Color.RED);
	JButton e = new JButton("24");
	e.setBackground(Color.RED);
	JButton f = new JButton("25");
	JButton g = new JButton("26");
	g.setBackground(Color.YELLOW);
	JButton h = new JButton("27");
	h.setBackground(Color.YELLOW);
	JButton i = new JButton("28");
	JButton j = new JButton("29");
	j.setBackground(Color.YELLOW);
	
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
	a1.setBackground(Color.CYAN);
	JButton b1 = new JButton("8");
	b1.setBackground(Color.CYAN);
	JButton c1 = new JButton("7");
	JButton d1 = new JButton("6");
	d1.setBackground(Color.CYAN);
	JButton e1 = new JButton("5");
	JButton f1 = new JButton("4");
	JButton g1 = new JButton("3");
	g1.setBackground(Color.BLACK);
	JButton h1 = new JButton("2");
	JButton i1 = new JButton("1");
	i1.setBackground(Color.BLACK);
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
	a2.setBackground(Color.ORANGE);
	JButton b2 = new JButton("18");
	b2.setBackground(Color.ORANGE);
	JButton c2 = new JButton("17");
	JButton d2 = new JButton("16");
	d2.setBackground(Color.ORANGE);
	JButton e2 = new JButton("15");
	JButton f2 = new JButton("14");
	f2.setBackground(Color.MAGENTA);
	JButton g2 = new JButton("13");
	g2.setBackground(Color.MAGENTA);
	JButton h2 = new JButton("12");
	JButton i2 = new JButton("11");
	i2.setBackground(Color.MAGENTA);
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
	b3.setBackground(Color.GREEN);
	JButton c3 = new JButton("32");
	c3.setBackground(Color.GREEN);
	JButton d3 = new JButton("33");
	JButton e3 = new JButton("34");
	e3.setBackground(Color.GREEN);
	JButton f3 = new JButton("35");
	JButton g3 = new JButton("36");
	JButton h3 = new JButton("37");
	h3.setBackground(Color.BLUE);
	JButton i3 = new JButton("38");
	JButton j3 = new JButton("39");
	j3.setBackground(Color.BLUE);

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

	Dimension dim2 = new Dimension(100,100);	
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
	JButton f4 = new JButton("Buy Property");
	f4.setPreferredSize(dim2);		
	f4.addActionListener(this);
	f4.setActionCommand("Property");
	JButton g4 = new JButton("End Turn");
	g4.setPreferredSize(dim2);		
	g4.addActionListener(this);
	g4.setActionCommand("End");
	
	Buttons.add(a4);
	Buttons.add(f4);
	Buttons.add(b4);
	Buttons.add(c4);
	Buttons.add(d4);
	Buttons.add(e4);
	Buttons.add(g4);

	JPanel Players = new JPanel();
	Players.setLayout(new FlowLayout(FlowLayout.LEFT));

	playerName = new String[4];
        playerName[0] = "Player 1";
	playerName[1] = "Player 2";
	playerName[2] = "Player 3";
	playerName[3] = "Player 4";
	
	Dimension dim3 = new Dimension(150,50);	
	a5 = new JTextArea(playerName[0]);
	a5.setPreferredSize(dim3);	
	a5.setLineWrap(true);
	a5.setWrapStyleWord(true);
	a5.setEditable(false);
	b5 = new JTextArea(playerName[1]);
	b5.setPreferredSize(dim3);
	b5.setLineWrap(true);
	b5.setWrapStyleWord(true);
	b5.setEditable(false);
	c5 = new JTextArea(playerName[2]);
	c5.setPreferredSize(dim3);
	c5.setLineWrap(true);
	c5.setWrapStyleWord(true);
	c5.setEditable(false);
	d5 = new JTextArea(playerName[3]);
	d5.setPreferredSize(dim3);	    	
	d5.setLineWrap(true);
	d5.setWrapStyleWord(true);
	d5.setEditable(false);
	Players.add(a5);
	Players.add(b5);
	Players.add(c5);
	Players.add(d5);



	//change later
	textField = new JTextField();
	Enter = new JButton("Enter");
	Enter.setPreferredSize(dim1);
	Enter.addActionListener(this);
	Enter.setActionCommand("Enter");

	JPanel Log = new JPanel();
	Log.setLayout(new BoxLayout(Log,BoxLayout.PAGE_AXIS));
	    
	Log1 = new JTextArea("");
	Log1.setPreferredSize(new Dimension(150,500));
	Log1.setLineWrap(true);
	Log1.setWrapStyleWord(true);
	Log1.setEditable(false);
	JScrollPane Scroll = new JScrollPane(Log1);
	Scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	Scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	Log.add(Log1);
	Log.add(Scroll);
	Log.add(textField);
	Log.add(Enter);
		
	
	JPanel Title = new JPanel();
	Title.setLayout(new FlowLayout());
	TurnDisplay = new JTextArea("Player's Turns");
	TurnDisplay.setEditable(false);
	Title.add(TurnDisplay);
	
	
	outsideLayout.add(Title, BorderLayout.PAGE_START);
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
    CardArray cards = new CardArray();
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if (!trading) {
	switch(event) {
    case "0": display.setText("GO\nCollect $200 Salary As You Pass");
	    break;
	case "1": display.setText("Name: " + Name[1] + "\nCost: " + tiles.get(1).getCost() + "\nRent: " + tiles.get(1).getRent() + "\nRent of 1 House :" + tiles.get(1).getRent1H() + "\nRent of 2 House: " + tiles.get(1).getRent2H() + "\nRent of 3 House: " + tiles.get(1).getRent3H() + "\nRent of 4 Houses: " + tiles.get(1).getRent4H() + "\nRent of Hotel: " + tiles.get(1).getHotelRent() + "\nCost of Buying a House: " + tiles.get(1).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(1).getHouseCost() + "\nMortgage Cost: " + tiles.get(1).getMortgage() + "\nUnmortgage Cost: " + tiles.get(1).getUnmortgage() +"\nOwned By Player: "+ tiles.get(1).getOwnedBy() + "\nNumber of Houses: " + tiles.get(1).getHouseNumber() + "\nHotel: " + tiles.get(1).getHotel()) ;
	    break;
	case "2": display.setText("Name: Community Chest\nDraw a Community Chest Card");
	    break;
	case "3": display.setText("Name: " + Name[3] + "\nCost: " + tiles.get(3).getCost() + "\nRent: " + tiles.get(3).getRent() + "\nRent of 1 House: " + tiles.get(3).getRent1H() + "\nRent of 2 House: " + tiles.get(3).getRent2H() + "\nRent of 3 House: " + tiles.get(3).getRent3H() + "\nRent of 4 Houses: " + tiles.get(3).getRent4H() + "\nRent of Hotel: " + tiles.get(3).getHotelRent() + "\nCost of Buying a House: " + tiles.get(3).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(3).getHouseCost() + "\nMortgage Cost: " + tiles.get(3).getMortgage() + "\nUnmortgage Cost: " + tiles.get(3).getUnmortgage() + "\nOwned By Player: "+ tiles.get(3).getOwnedBy() + "\nNumber of Houses: " + tiles.get(3).getHouseNumber() + "\nHotel: " + tiles.get(3).getHotel());
	    break;
	case "4": display.setText("Name: Income Tax\nPay 200");
	    break;
	case "5": display.setText("Name: " + Name[5] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(5).getOwnedBy());
	    break;
	case "6": display.setText("Name: " + Name[6] + "\nCost: " + tiles.get(6).getCost() + "\nRent: " + tiles.get(6).getRent() + "\nRent of 1 House: " + tiles.get(6).getRent1H() + "\nRent of 2 House: " + tiles.get(6).getRent2H() + "\nRent of 3 House: " + tiles.get(6).getRent3H() + "\nRent of 4 Houses: " + tiles.get(6).getRent4H() + "\nRent of Hotel: " + tiles.get(6).getHotelRent() + "\nCost of Buying a House: " + tiles.get(6).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(6).getHouseCost() + "\nMortgage Cost: " + tiles.get(6).getMortgage() + "\nUnmortgage Cost: " + tiles.get(6).getUnmortgage()+ "\nOwned By Player: "+ tiles.get(6).getOwnedBy() + "\nNumber of Houses: " + tiles.get(6).getHouseNumber() + "\nHotel: " + tiles.get(6).getHotel());
	    break;
	case "7": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "8": display.setText("Name: " + Name[8] + "\nCost: " + tiles.get(8).getCost() + "\nRent: " + tiles.get(8).getRent() + "\nRent of 1 House:" + tiles.get(8).getRent1H() + "\nRent of 2 House: " + tiles.get(8).getRent2H() + "\nRent of 3 House: " + tiles.get(8).getRent3H() + "\nRent of 4 Houses: " + tiles.get(8).getRent4H() + "\nRent of Hotel: " + tiles.get(8).getHotelRent() + "\nCost of Buying a House: " + tiles.get(8).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(8).getHouseCost() + "\nMortgage Cost: " + tiles.get(8).getMortgage() + "\nUnmortgage Cost: " + tiles.get(8).getUnmortgage() + "\nOwned By Player: "+ tiles.get(8).getOwnedBy() + "\nNumber of Houses: " + tiles.get(8).getHouseNumber() + "\nHotel: " + tiles.get(8).getHotel());
	    break;
	case "9": display.setText("Name: " + Name[9] + "\nCost: " + tiles.get(9).getCost() + "\nRent: " + tiles.get(9).getRent() + "\nRent of 1 House: " + tiles.get(9).getRent1H() + "\nRent of 2 House: " + tiles.get(9).getRent2H() + "\nRent of 3 House: " + tiles.get(9).getRent3H() + "\nRent of 4 Houses: " + tiles.get(9).getRent4H() + "\nRent of Hotel: " + tiles.get(9).getHotelRent() + "\nCost of Buying a House: " + tiles.get(9).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(9).getHouseCost() + "\nMortgage Cost: " + tiles.get(9).getMortgage() + "\nUnmortgage Cost: " + tiles.get(9).getUnmortgage() + "\nOwned By Player: "+ tiles.get(9).getOwnedBy() + "\nNumber of Houses: " + tiles.get(9).getHouseNumber() + "\nHotel: " + tiles.get(9).getHotel());
	    break;
	case "10": display.setText("Jail \n[JUST VISITING JAIL IF YOU LAND ON IT]");
	    break;
	case "11": display.setText("Name: " + Name[11] + "\nCost: " + tiles.get(11).getCost() + "\nRent: " + tiles.get(11).getRent() + "\nRent of 1 House: " + tiles.get(11).getRent1H() + "\nRent of 2 House: " + tiles.get(11).getRent2H() + "\nRent of 3 House: " + tiles.get(11).getRent3H() + "\nRent of 4 Houses: " + tiles.get(11).getRent4H() + "\nRent of Hotel: " + tiles.get(11).getHotelRent() + "\nCost of Buying a House: " + tiles.get(11).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(11).getHouseCost() + "\nMortgage Cost: " + tiles.get(11).getMortgage() + "\nUnmortgage Cost: " + tiles.get(11).getUnmortgage() + "\nOwned By Player: "+ tiles.get(11).getOwnedBy() + "\nNumber of Houses: " + tiles.get(11).getHouseNumber() + "\nHotel: " + tiles.get(11).getHotel());
	    break;
	case "12": display.setText("Name: " + Name[12] + "\nCost: " + tiles.get(28).getCost() + "\nRent: 4 times the number rolled on the dice" + "\nRent with Monpoly: 10 times the number rolled on the dice" + "\nMortgage Cost: " + tiles.get(28).getMortgage() + "\nUnmortgage Cost: " + tiles.get(28).getUnmortgage() + "\nOwned By Player: "+ tiles.get(12).getOwnedBy());
	    break;
	case "13": display.setText("Name: " + Name[13] + "\nCost: " + tiles.get(13).getCost() + "\nRent: " + tiles.get(13).getRent() + "\nRent of 1 House:" + tiles.get(13).getRent1H() + "\nRent of 2 House: " + tiles.get(13).getRent2H() + "\nRent of 3 House: " + tiles.get(13).getRent3H() + "\nRent of 4 Houses: " + tiles.get(13).getRent4H() + "\nRent of Hotel: " + tiles.get(13).getHotelRent() + "\nCost of Buying a House: " + tiles.get(13).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(13).getHouseCost() + "\nMortgage Cost: " + tiles.get(13).getMortgage() + "\nUnmortgage Cost: " + tiles.get(13).getUnmortgage() + "\nOwned By Player: "+ tiles.get(13).getOwnedBy() + "\nNumber of Houses: " + tiles.get(13).getHouseNumber() + "\nHotel: " + tiles.get(13).getHotel());
	    break;
	case "14": display.setText("Name: " + Name[14] + "\nCost: " + tiles.get(14).getCost() + "\nRent: " + tiles.get(14).getRent() + "\nRent of 1 House: " + tiles.get(14).getRent1H() + "\nRent of 2 House: " + tiles.get(14).getRent2H() + "\nRent of 3 House: " + tiles.get(14).getRent3H() + "\nRent of 4 Houses: " + tiles.get(14).getRent4H() + "\nRent of Hotel: " + tiles.get(14).getHotelRent() + "\nCost of Buying a House: " + tiles.get(14).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(14).getHouseCost() + "\nMortgage Cost: " + tiles.get(14).getMortgage() + "\nUnmortgage Cost: " + tiles.get(14).getUnmortgage() + "\nOwned By Player: "+ tiles.get(14).getOwnedBy() + "\nNumber of Houses: " + tiles.get(14).getHouseNumber() + "\nHotel: " + tiles.get(14).getHotel());
	    break;
	case "15": display.setText("Name: " + Name[15] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(15).getOwnedBy());
	    break;
	case "16": display.setText("Name: " + Name[16] + "\nCost: " + tiles.get(16).getCost() + "\nRent: " + tiles.get(16).getRent() + "\nRent of 1 House: " + tiles.get(16).getRent1H() + "\nRent of 2 House: " + tiles.get(16).getRent2H() + "\nRent of 3 House: " + tiles.get(16).getRent3H() + "\nRent of 4 Houses: " + tiles.get(16).getRent4H() + "\nRent of Hotel: " + tiles.get(16).getHotelRent() + "\nCost of Buying a House: " + tiles.get(16).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(16).getHouseCost() + "\nMortgage Cost: " + tiles.get(16).getMortgage() + "\nUnmortgage Cost: " + tiles.get(16).getUnmortgage() + "\nOwned By Player: "+ tiles.get(16).getOwnedBy() + "\nNumber of Houses: " + tiles.get(16).getHouseNumber() + "\nHotel: " + tiles.get(16).getHotel());
	    break;
	case "17": display.setText("Name: Community Chest\nDraw a Community Chest Card");
	    break;
	case "18": display.setText("Name: " + Name[18] + "\nCost: " + tiles.get(18).getCost() + "\nRent: " + tiles.get(18).getRent() + "\nRent of 1 House: " + tiles.get(18).getRent1H() + "\nRent of 2 House: " + tiles.get(18).getRent2H() + "\nRent of 3 House: " + tiles.get(18).getRent3H() + "\nRent of 4 Houses: " + tiles.get(18).getRent4H() + "\nRent of Hotel: " + tiles.get(18).getHotelRent() + "\nCost of Buying a House: " + tiles.get(18).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(18).getHouseCost() + "\nMortgage Cost: " + tiles.get(18).getMortgage() + "\nUnmortgage Cost: " + tiles.get(18).getUnmortgage() + "\nOwned By Player: "+ tiles.get(18).getOwnedBy() + "\nNumber of Houses: " + tiles.get(18).getHouseNumber() + "\nHotel: " + tiles.get(18).getHotel());
	    break;
	case "19": display.setText("Name: " + Name[19] + "\nCost: " + tiles.get(19).getCost() + "\nRent: " + tiles.get(19).getRent() + "\nRent of 1 House: " + tiles.get(19).getRent1H() + "\nRent of 2 House: " + tiles.get(19).getRent2H() + "\nRent of 3 House: " + tiles.get(19).getRent3H() + "\nRent of 4 Houses: " + tiles.get(19).getRent4H() + "\nRent of Hotel: " + tiles.get(19).getHotelRent() + "\nCost of Buying a House: " + tiles.get(19).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(19).getHouseCost() + "\nMortgage Cost: " + tiles.get(19).getMortgage() + "\nUnmortgage Cost: " + tiles.get(19).getUnmortgage() + "\nOwned By Player: "+ tiles.get(19).getOwnedBy() + "\nNumber of Houses: " + tiles.get(19).getHouseNumber() + "\nHotel: " + tiles.get(19).getHotel());
	    break;
	case "20": display.setText("FREE PARKING\nNothing Happens!");
	    break;
	case "21": display.setText("Name: " + Name[21] + "\nCost: " + tiles.get(21).getCost() + "\nRent: " + tiles.get(21).getRent() + "\nRent of 1 House: " + tiles.get(21).getRent1H() + "\nRent of 2 House: " + tiles.get(21).getRent2H() + "\nRent of 3 House: " + tiles.get(21).getRent3H() + "\nRent of 4 Houses: " + tiles.get(21).getRent4H() + "\nRent of Hotel: " + tiles.get(21).getHotelRent() + "\nCost of Buying a House: " + tiles.get(21).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(21).getHouseCost() + "\nMortgage Cost: " + tiles.get(21).getMortgage() + "\nUnmortgage Cost: " + tiles.get(21).getUnmortgage() + "\nOwned By Player: "+ tiles.get(21).getOwnedBy() + "\nNumber of Houses: " + tiles.get(21).getHouseNumber() + "\nHotel: " + tiles.get(21).getHotel());
	    break;
	case "22": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "23": display.setText("Name: " + Name[23] + "\nCost: " + tiles.get(23).getCost() + "\nRent: " + tiles.get(23).getRent() + "\nRent of 1 House: " + tiles.get(23).getRent1H() + "\nRent of 2 House: " + tiles.get(23).getRent2H() + "\nRent of 3 House: " + tiles.get(23).getRent3H() + "\nRent of 4 Houses: " + tiles.get(23).getRent4H() + "\nRent of Hotel: " + tiles.get(23).getHotelRent() + "\nCost of Buying a House: " + tiles.get(23).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(23).getHouseCost() + "\nMortgage Cost: " + tiles.get(23).getMortgage() + "\nUnmortgage Cost: " + tiles.get(23).getUnmortgage() + "\nOwned By Player: "+ tiles.get(23).getOwnedBy() + "\nNumber of Houses: " + tiles.get(23).getHouseNumber() + "\nHotel: " + tiles.get(23).getHotel());
	    break;
	case "24": display.setText("Name: " + Name[24] + "\nCost: " + tiles.get(24).getCost() + "\nRent: " + tiles.get(24).getRent() + "\nRent of 1 House: " + tiles.get(24).getRent1H() + "\nRent of 2 House: " + tiles.get(24).getRent2H() + "\nRent of 3 House: " + tiles.get(24).getRent3H() + "\nRent of 4 Houses: " + tiles.get(24).getRent4H() + "\nRent of Hotel: " + tiles.get(24).getHotelRent() + "\nCost of Buying a House: " + tiles.get(24).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(24).getHouseCost() + "\nMortgage Cost: " + tiles.get(24).getMortgage() + "\nUnmortgage Cost: " + tiles.get(24).getUnmortgage() + "\nOwned By Player: "+ tiles.get(24).getOwnedBy() + "\nNumber of Houses: " + tiles.get(24).getHouseNumber() + "\nHotel: " + tiles.get(24).getHotel());
	    break;
	case "25": display.setText("Name: " + Name[25] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(25).getOwnedBy());
	    break;
	case "26": display.setText("Name: " + Name[26] + "\nCost: " + tiles.get(26).getCost() + "\nRent: " + tiles.get(26).getRent() + "\nRent of 1 House: " + tiles.get(26).getRent1H() + "\nRent of 2 House: " + tiles.get(26).getRent2H() + "\nRent of 3 House: " + tiles.get(26).getRent3H() + "\nRent of 4 Houses: " + tiles.get(26).getRent4H() + "\nRent of Hotel: " + tiles.get(26).getHotelRent() + "\nCost of Buying a House: " + tiles.get(26).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(26).getHouseCost() + "\nMortgage Cost: " + tiles.get(26).getMortgage() + "\nUnmortgage Cost: " + tiles.get(26).getUnmortgage() + "\nOwned By Player: "+ tiles.get(26).getOwnedBy()+"\nNumber of Houses: " + tiles.get(26).getHouseNumber() + "\nHotel: " + tiles.get(26).getHotel());
	    break;
	case "27": display.setText("Name: " + Name[27] + "\nCost: " + tiles.get(27).getCost() + "\nRent: " + tiles.get(27).getRent() + "\nRent of 1 House: " + tiles.get(27).getRent1H() + "\nRent of 2 House: " + tiles.get(27).getRent2H() + "\nRent of 3 House: " + tiles.get(27).getRent3H() + "\nRent of 4 Houses: " + tiles.get(27).getRent4H() + "\nRent of Hotel: " + tiles.get(27).getHotelRent() + "\nCost of Buying a House: " + tiles.get(27).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(27).getHouseCost() + "\nMortgage Cost: " + tiles.get(27).getMortgage() + "\nUnmortgage Cost: " + tiles.get(27).getUnmortgage() + "\nOwned By Player: "+ tiles.get(27).getOwnedBy() + "\nNumber of Houses: " + tiles.get(27).getHouseNumber() + "\nHotel: " + tiles.get(27).getHotel());
	    break;
	case "28": display.setText("Name: " + Name[28] + "\nCost: " + tiles.get(28).getCost() + "\nRent: 4 times the number rolled on the dice" + "\nRent with Monpoly: 10 times the number rolled on the dice" + "\nMortgage Cost: " + tiles.get(28).getMortgage() + "\nUnmortgage Cost: " + tiles.get(28).getUnmortgage() + "\nOwned By Player: "+ tiles.get(28).getOwnedBy() + "\nNumber of Houses: " + tiles.get(28).getHouseNumber() + "\nHotel: " + tiles.get(28).getHotel());
	    break;
	case "29": display.setText("Name: " + Name[29] + "\nCost: " + tiles.get(29).getCost() + "\nRent: " + tiles.get(29).getRent() + "\nRent of 1 House: " + tiles.get(29).getRent1H() + "\nRent of 2 House: " + tiles.get(29).getRent2H() + "\nRent of 3 House: " + tiles.get(29).getRent3H() + "\nRent of 4 Houses: " + tiles.get(29).getRent4H() + "\nRent of Hotel: " + tiles.get(29).getHotelRent() + "\nCost of Buying a House: " + tiles.get(29).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(29).getHouseCost() + "\nMortgage Cost: " + tiles.get(29).getMortgage() + "\nUnmortgage Cost: " + tiles.get(29).getUnmortgage() + "\nOwned By Player: "+ tiles.get(29).getOwnedBy() + "\nNumber of Houses: " + tiles.get(29).getHouseNumber() + "\nHotel: " + tiles.get(29).getHotel());
	    break;
	case "30": display.setText("GO TO JAIL");
	    break;
	case "31": display.setText("Name: " + Name[31] + "\nCost: " + tiles.get(31).getCost() + "\nRent: " + tiles.get(31).getRent() + "\nRent of 1 House:" + tiles.get(31).getRent1H() + "\nRent of 2 House: " + tiles.get(31).getRent2H() + "\nRent of 3 House: " + tiles.get(31).getRent3H() + "\nRent of 4 Houses: " + tiles.get(31).getRent4H() + "\nRent of Hotel: " + tiles.get(31).getHotelRent() + "\nCost of Buying a House: " + tiles.get(31).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(31).getHouseCost() + "\nMortgage Cost: " + tiles.get(31).getMortgage() + "\nUnmortgage Cost: " + tiles.get(31).getUnmortgage() + "\nOwned By Player: "+ tiles.get(31).getOwnedBy() + "\nNumber of Houses: " + tiles.get(31).getHouseNumber() + "\nHotel: " + tiles.get(31).getHotel());
	    break;
	case "32": display.setText("Name: " + Name[32] + "\nCost: " + tiles.get(32).getCost() + "\nRent: " + tiles.get(32).getRent() + "\nRent of 1 House: " + tiles.get(32).getRent1H() + "\nRent of 2 House: " + tiles.get(32).getRent2H() + "\nRent of 3 House: " + tiles.get(32).getRent3H() + "\nRent of 4 Houses: " + tiles.get(32).getRent4H() + "\nRent of Hotel: " + tiles.get(32).getHotelRent() + "\nCost of Buying a House: " + tiles.get(32).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(32).getHouseCost() + "\nMortgage Cost: " + tiles.get(32).getMortgage() + "\nUnmortgage Cost: " + tiles.get(32).getUnmortgage() + "\nOwned By Player: "+ tiles.get(32).getOwnedBy() + "\nNumber of Houses: " + tiles.get(32).getHouseNumber() + "\nHotel: " + tiles.get(32).getHotel());
	    break;
	case "33": display.setText("Name: Community Chest\n Draw a Community Chest Card");
	    break;
	case "34": display.setText("Name: " + Name[34] + "\nCost: " + tiles.get(34).getCost() + "\nRent: " + tiles.get(34).getRent() + "\nRent of 1 House: " + tiles.get(34).getRent1H() + "\nRent of 2 House: " + tiles.get(34).getRent2H() + "\nRent of 3 House: " + tiles.get(34).getRent3H() + "\nRent of 4 Houses: " + tiles.get(34).getRent4H() + "\nRent of Hotel: " + tiles.get(34).getHotelRent() + "\nCost of Buying a House: " + tiles.get(34).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(34).getHouseCost() + "\nMortgage Cost: " + tiles.get(34).getMortgage() + "\nUnmortgage Cost: " + tiles.get(34).getUnmortgage()  + "\nOwned By Player: "+ tiles.get(34).getOwnedBy() + "\nNumber of Houses: " + tiles.get(34).getHouseNumber() + "\nHotel: " + tiles.get(34).getHotel());
	    break;
	case "35": display.setText("Name: " + Name[35] + "\nCost: " + tiles.get(5).getCost() + "\nRent for 1 Railroad: 50\nRent for 2 Railroad: 100\nRent for 3 Railroad: 150\nRent for 4 Railroad: 200\nMortgage Cost: " + tiles.get(5).getMortgage() + "\nUnmortgage Cost: " + tiles.get(5).getUnmortgage() + "\nOwned By Player: "+ tiles.get(35).getOwnedBy());
	    break;
	case "36": display.setText("Name: Chance\nDraw a Chance Card");
	    break;
	case "37": display.setText("Name: " + Name[37] + "\nCost: " + tiles.get(37).getCost() + "\nRent: " + tiles.get(37).getRent() + "\nRent of 1 House: " + tiles.get(37).getRent1H() + "\nRent of 2 House: " + tiles.get(37).getRent2H() + "\nRent of 3 House: " + tiles.get(37).getRent3H() + "\nRent of 4 Houses: " + tiles.get(37).getRent4H() + "\nRent of Hotel: " + tiles.get(37).getHotelRent() + "\nCost of Buying a House: " + tiles.get(37).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(37).getHouseCost() + "\nMortgage Cost: " + tiles.get(37).getMortgage() + "\nUnmortgage Cost: " + tiles.get(37).getUnmortgage() + "\nOwned By Player: "+ tiles.get(37).getOwnedBy()+ "\nNumber of Houses: " + tiles.get(37).getHouseNumber() + "\nHotel: " + tiles.get(37).getHotel());
	    break;
	case "38": display.setText("Name: Super Tax\nPay 100");
	    break;
	case "39": display.setText("Name: " + Name[39] + "\nCost: " + tiles.get(39).getCost() + "\nRent: " + tiles.get(39).getRent() + "\nRent of 1 House: " + tiles.get(39).getRent1H() + "\nRent of 2 House: " + tiles.get(39).getRent2H() + "\nRent of 3 House: " + tiles.get(39).getRent3H() + "\nRent of 4 Houses: " + tiles.get(39).getRent4H() + "\nRent of Hotel: " + tiles.get(39).getHotelRent() + "\nCost of Buying a House: " + tiles.get(39).getHouseCost() + "\nCost of Buying a Hotel: " + tiles.get(39).getHouseCost() + "\nMortgage Cost: " + tiles.get(39).getMortgage() + "\nUnmortgage Cost: " + tiles.get(39).getUnmortgage() + "\nOwned By Player: "+ tiles.get(39).getOwnedBy() + "\nNumber of Houses: " + tiles.get(39).getHouseNumber() + "\nHotel: " + tiles.get(39).getHotel());
	    break;
	}
	}
	/*
	if (event.equals("Dice") && playerTurn.getRolls() == false && playerDead[rule.getTurn() + 1] == false && playerTurn.getJailCounter() == 0) {	    
		display.setText("It is not your turn to roll again.\nAfter conducting your moves, please end your turn.");
	    }
	*/
	if (event.equals("Dice") && !gameStart && !setNickname &&!setTurns && rule.getTurn() == 0) {
	    highestNumber = 0;
	    playerWithHighestNumber = 0;
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	    roll1 = randomNum + randomNum1;
	    highestNumber = roll1;
	    Log1.setText("" + playerName[rule.getTurn()] + " has rolled a " + randomNum + "," + randomNum1);
	    rule.setTurn();
	}
	if (event.equals("Dice") && !gameStart  && !setNickname && !setTurns && rule.getTurn() == 1 && (playerDead[3] || playerDead[2] || !playerDead[3])) {
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	    roll2 = randomNum + randomNum1;
	    if (roll2 > roll1) {
		highestNumber = roll2;
		playerWithHighestNumber = 1;
	    }
	    /*if (roll 2 == roll1) {
		
	    }
	    */
	    Log1.append("\n" + playerName[rule.getTurn()] + " has rolled a " + randomNum + "," + randomNum1);
	    rule.setTurn();
	    if (playerDead[2]) {
		Log1.append("\nThe highest roll is by " + playerName[playerWithHighestNumber] + "\n");
		rule.setTurn1(playerWithHighestNumber);
		setTurns = true;
	    }
	}
	if (event.equals("Dice") && !gameStart  && !setNickname && !setTurns && rule.getTurn() == 2 && (playerDead[3] || !playerDead[3])) {
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	    roll3 = randomNum + randomNum1;
	    if (roll3 > highestNumber) {
		highestNumber = roll3;
		playerWithHighestNumber = 2;
	    }
	    Log1.append("\n" + playerName[rule.getTurn()] + " has rolled a " + randomNum + "," + randomNum1);
	    rule.setTurn();
	    if (playerDead[3]) {
		Log1.append("\nThe highest roll is by " + playerName[playerWithHighestNumber] + "\n");
		rule.setTurn1(playerWithHighestNumber);
		setTurns = true;
	    }
	}
	if (event.equals("Dice") && !gameStart  && !setNickname && !setTurns && rule.getTurn() == 3 ) {
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	    roll4 = randomNum + randomNum1;
	    if (roll4 > highestNumber) {
		highestNumber = roll4;
		playerWithHighestNumber = 3;
	    }
	    Log1.append("\n" + playerName[rule.getTurn()] + " has rolled a " + randomNum + "," + randomNum1 + "\nThe highest roll is by " + playerName[playerWithHighestNumber] + "\n");
	    rule.setTurn1(playerWithHighestNumber);
	    setTurns = true;
	}
	Player playerTurn = PlayerNumber.get(rule.getTurn());
	if (event.equals("Dice") && playerTurn.getRolls() && !gameStart && !setNickname && setTurns && !trading){
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	    //randomNum = 0;
	    //randomNum1 = 1;
	    display.setText("Dice rolls are " + randomNum + "," + randomNum1);
	    tiles.get(12).setRent((randomNum + randomNum1) * 4);
	    tiles.get(12).setRentMonopoly((randomNum + randomNum1) * 10);
	    tiles.get(28).setRent((randomNum + randomNum1) * 4);
	    tiles.get(28).setRentMonopoly((randomNum + randomNum1) * 10);
	    /*
	    if (playerTurn.getJailCounter() == 1 && randomNum != randomNum1) {
		display.setText("You are in Jail for your " + playerTurn.getJailCounter() + "st turn. You can only get out if you roll a double and you did not get a double.\nAfter your third turn of not getting a double, you will be forced to pay 50 and get out anyways.\nYou can also opt to pay 50 now and get out.");
		playerTurn.setRolls(false);
		charged = false;
	    }
	    */
	    
	    ButtonsOnBoard[playerTurn.getPosition()].remove(Players[rule.getTurn()]);
	    int newPosition = (playerTurn.getPosition() + randomNum + randomNum1) % 40;
	    if ((playerTurn.getPosition() + randomNum + randomNum1) > 39) {
		playerTurn.addMoney(200);
		display.append("\n" + playerName[rule.getTurn()] + " has passed GO!\nCollect $200.");
	    }
	    ButtonsOnBoard[newPosition].add(Players[rule.getTurn()]);
	    playerTurn.setPosition(newPosition);
	    TurnDisplay.setText("It is now "  + playerName[rule.getTurn()]  + "'s Turn. " +  playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
	    if (playerTurn.getPosition() == 1 || playerTurn.getPosition() == 3){
		temp = 0;
	    }if (playerTurn.getPosition() == 6 || playerTurn.getPosition() == 8 || playerTurn.getPosition() == 8) {
		temp = 1;
	    }if (playerTurn.getPosition() == 11 || playerTurn.getPosition() == 13 || playerTurn.getPosition() == 14) {
		temp = 2;
	    }if (playerTurn.getPosition() == 16 || playerTurn.getPosition() == 18 || playerTurn.getPosition() == 19) {
		temp = 3;
	    }if (playerTurn.getPosition() == 21 || playerTurn.getPosition() == 23 || playerTurn.getPosition() == 24) {
		temp = 4;
	    }if (playerTurn.getPosition() == 26 || playerTurn.getPosition() == 27 || playerTurn.getPosition() == 29) {
		temp = 5;
	    }if (playerTurn.getPosition() == 31 || playerTurn.getPosition() == 32 || playerTurn.getPosition() == 34) {
		temp = 6;
	    }if (playerTurn.getPosition() == 37 || playerTurn.getPosition() == 39){
		temp = 7;
	    }if (playerTurn.getPosition() == 12 || playerTurn.getPosition() == 28){
		temp = 9;
	    }
	    if (playerTurn.getPosition() == 5 || playerTurn.getPosition() == 15|| playerTurn.getPosition() == 25 || playerTurn.getPosition() == 35){
		temp = 8;
	    }
	    
	    if (playerTurn.getPosition() == 4) {
		playerTurn.loseMoney(200);
		display.append("\n"  + playerName[rule.getTurn()] + " has to pay $200 Tax!");
	    }
	    if (playerTurn.getPosition() == 38) {
		playerTurn.loseMoney(100);
		display.append("\n" + playerName[rule.getTurn()] + " has to pay $100 Tax!");
	    }

	    if (newPosition == 7 || newPosition == 22 || newPosition == 36) {
	    cards.setChancePosition(1,playerTurn.getPosition());
	    cards.setChancePosition(2,playerTurn.getPosition() - 3);
	    cards.setChancePosition(5,playerTurn.getPosition());
	    cards.setChancePosition(11,playerTurn.getPosition());
	    cards.setChancePosition(14,playerTurn.getPosition());
	    cards.setChancePosition(15,playerTurn.getPosition());
	    if (playerTurn.getPosition() < 12 || playerTurn.getPosition() > 28) {
		if (tiles.get(12).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 28) {
			cards.setChanceMoney(3,200);
		    }
		    cards.setChancePosition(3,12);
		    
		}
		else if (tiles.get(28).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 28) {
			cards.setChanceMoney(3,200);
		    }
		    cards.setChancePosition(3,28);
		}
		else if (tiles.get(12).getOwnedBy() > 0){
		    cards.setChancePosition(3,12);
		    cards.setChanceMoney(3,-1 * 10 * (randomNum + randomNum1));
		}
	    }
	    if (playerTurn.getPosition() > 12 && playerTurn.getPosition() < 28) {
		if (tiles.get(28).getOwnedBy() == 0) {
		    cards.setChancePosition(3,28);
		}
		else if (tiles.get(12).getOwnedBy() == 0) {
		    cards.setChancePosition(3,12);
		}
		else if (tiles.get(28).getOwnedBy() > 0) {
		    cards.setChancePosition(3,28);
		    cards.setChanceMoney(3,-1 * 10 * (randomNum + randomNum1));
		}
	    }
	    if (playerTurn.getPosition() < 5 || playerTurn.getPosition() > 35) {
		if (tiles.get(5).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 5) {
			cards.setChanceMoney(7,200);
			cards.setChanceMoney(8,200);
		    }
		    cards.setChancePosition(7,5);
		    cards.setChancePosition(8,5);
		}
		else if (tiles.get(15).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 15) {
			cards.setChanceMoney(7,200);
			cards.setChanceMoney(8,200);
		    }
		    cards.setChancePosition(7,15);
		    cards.setChancePosition(8,15);
		}
		else if (tiles.get(25).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 35) {
			cards.setChanceMoney(7,200);
			cards.setChanceMoney(8,200);
		    }
		    cards.setChancePosition(7,25);
		    cards.setChancePosition(8,25);
		}
		else if (tiles.get(35).getOwnedBy() == 0) {
		    if (playerTurn.getPosition() > 35) {
			cards.setChanceMoney(7,200);
			cards.setChanceMoney(8,200);
		    }

		    cards.setChancePosition(7,35);
		    cards.setChancePosition(8,35);
		}
		else if (tiles.get(5).getOwnedBy() > 0){
		    cards.setChancePosition(7,5);
		    cards.setChancePosition(8,5);
		    cards.setChanceMoney(7,25);
		    cards.setChanceMoney(8,25);
		    // Edit laterif (PlayerNumber.get(tiles.get(5).getOwnedBy())
		    
		}
	    }
	    
	    if (playerTurn.getPosition() > 5 && playerTurn.getPosition() < 15) {
		if (tiles.get(15).getOwnedBy() == 0) {
		    cards.setChancePosition(7,15);
		    cards.setChancePosition(8,15);
		}
		else if (tiles.get(25).getOwnedBy() == 0) {
		    cards.setChancePosition(7,25);
		    cards.setChancePosition(8,25);
		}
		else if (tiles.get(35).getOwnedBy() == 0) {
		    cards.setChancePosition(7,35);
		    cards.setChancePosition(8,35);
		}
		else if (tiles.get(5).getOwnedBy() == 0) {
		    cards.setChanceMoney(7,200);
		    cards.setChanceMoney(8,200);
		    cards.setChancePosition(7,5);
		    cards.setChancePosition(8,5);
		}
		else if (tiles.get(15).getOwnedBy() > 15) {
		    cards.setChancePosition(7,15);
		    cards.setChancePosition(8,15);
		    cards.setChanceMoney(7,25);
		    cards.setChanceMoney(8,25);
		}
	    }

	    if (playerTurn.getPosition() > 15 && playerTurn.getPosition() < 25) {
		 if (tiles.get(25).getOwnedBy() == 0) {
		    cards.setChancePosition(7,25);
		    cards.setChancePosition(8,25);
		}
		else if (tiles.get(35).getOwnedBy() == 0) {
		    cards.setChancePosition(7,35);
		    cards.setChancePosition(8,35);
		}
		else if (tiles.get(5).getOwnedBy() == 0) {
		    cards.setChanceMoney(7,200);
		    cards.setChanceMoney(8,200);
		    cards.setChancePosition(7,5);
		    cards.setChancePosition(8,5);
		}
		else if (tiles.get(15).getOwnedBy() == 0) {
		    cards.setChanceMoney(7,200);
		    cards.setChanceMoney(8,200);
		    cards.setChancePosition(7,15);
		    cards.setChancePosition(8,15);
		}
		else if (tiles.get(25).getOwnedBy() > 0) {
		    cards.setChancePosition(7,25);
		    cards.setChancePosition(8,25);
		    cards.setChanceMoney(7,25);
		    cards.setChanceMoney(8,25);
		}
	    }
	    
	    if (playerTurn.getPosition() > 11) {
		cards.setChanceMoney(6,200);
	    }
	    if (playerTurn.getPosition() > 5) {
		cards.setChanceMoney(9,200);
	    }
	    if (playerTurn.getPosition() > 24) {
		cards.setChanceMoney(12,200);
	    }
	    cards.setChanceMoney(14,((playerTurn.getHouseCount()) * 25 + (playerTurn.getHotelCount() * 100)));

		String CC = cards.getRandomizedChanceCard();
		display.append("\nYou have landed on Chance!\n" + CC);
		if (CC.equals("You Have Been Elected Chairman Of the Board. Pay Each Player $50.")) {
		    for (int i = 0; i < 4; i++) {
			if ((rule.getTurn() + 1) != i) {
			    PlayerNumber.get(i).addMoney(50);
			}
		    }
		}
		if (CC.equals("This Card May Be Kept Until Needed or Sold. GET OUT OF JAIL FREE.")) {
		     playerTurn.setJailCard(1);
		 }
		if (CC.equals("Go DIRECTLY To Jail. Do Not Pass Go, Do Not Collect $200.")) {
		    playerTurn.setPosition(10);
		    playerTurn.setJailCounter();
		 }
		if (cards.getChancePosition(CC) >= 0) {
		    playerTurn.setPosition(cards.getChancePosition(CC));
		    playerTurn.addMoney(cards.getChanceMoney(CC));
		    ButtonsOnBoard[playerTurn.getPosition()].remove(Players[rule.getTurn()]);
		    ButtonsOnBoard[cards.getChancePosition(CC)].add(Players[rule.getTurn()]);
		    TurnDisplay.setText("" + playerName[rule.getTurn()]  + "'s Turn." +  playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
		}
		 
		if (cards.ChanceEmpty()){
		    cards.createRandomizedChance();
		}
		    
	    }

	    if(newPosition == 2 || newPosition == 17 || newPosition == 33) {

		for (int i = 0; i < 15; i++) {
		    if (i != 6) {
			cards.setCommunityPosition(i,playerTurn.getPosition());		    }
		}
		cards.setCommunityMoney(10,(playerTurn.getHouseCount() * 40 + playerTurn.getHotelCount() * 115));
		
	    String CCC = cards.getRandomizedCommunityChestCard();
	    display.append("\nYou have landed on Community Chest!\n" + CCC);
	    if (CCC.equals("It Is Your Birthday. Collect $10 From Every Player.")){
		for (int i = 0; i < 4; i++) {
		    if ((rule.getTurn() + 1 )!= i) {
			PlayerNumber.get(i).loseMoney(-10); //edit for # of players
		    }
	      }
	    }
	    if (CCC.equals("Get Out of Jail Free Card.")) {
		playerTurn.setJailCard(1);
	    }
	    if (CCC.equals("Go To Jail. Go Directly to Jail. Do Not Pass Go. Do Not collect $200.")) {
		playerTurn.setJailCounter();
	    }
	    if (cards.getCommunityPosition(CCC) > 0) {
		playerTurn.addMoney(cards.getCommunityMoney(CCC));
		playerTurn.setPosition(cards.getCommunityPosition(CCC));		ButtonsOnBoard[playerTurn.getPosition()].remove(Players[rule.getTurn()]);
		ButtonsOnBoard[cards.getCommunityPosition(CCC)].add(Players[rule.getTurn()]);
		    TurnDisplay.setText("" + playerName[rule.getTurn()]  + "'s Turn." + playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
		}
	
		if (cards.CommunityChestEmpty()){
		    cards.createRandomizedCommunityChest();
		}
	    }
	    charged = false;
	    if(((tiles.get(playerTurn.getPosition()).getOwnedBy()) > 0) && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) >= 0) && charged == false && (tiles.get(playerTurn.getPosition()).getHouseNumber() > 0) && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) != rule.getTurn()) && tiles.get(playerTurn.getPosition()).getMortgaged() == false) {
		playerTurn.loseMoney(tiles.get(playerTurn.getPosition()).getHouseRent(tiles.get(playerTurn.getPosition()).getHouseNumber()));
		PlayerNumber.get(tiles.get(playerTurn.getPosition()).getOwnedBy() - 1).addMoney(tiles.get(playerTurn.getPosition()).getHouseRent(tiles.get(playerTurn.getPosition()).getHouseNumber()));
		display.append("\n" + Name[playerTurn.getPosition()] + " has already been bought by " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1] + "\n" + playerName[rule.getTurn()] + " has paid $" +  tiles.get(playerTurn.getPosition()).getHouseRent(tiles.get(playerTurn.getPosition()).getHouseNumber())+ " to " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1] + " because he or she has " + tiles.get(playerTurn.getPosition()).getHouseNumber() + " house(s).");
		charged = true;
	    }
	    
	    if(((tiles.get(playerTurn.getPosition()).getOwnedBy()) > 0) && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) >= 0) && charged == false && (PlayerNumber.get(tiles.get(playerTurn.getPosition()).getOwnedBy() - 1).getHasMonopoly1(temp)) && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) != rule.getTurn()) && tiles.get(playerTurn.getPosition()).getMortgaged() == false) {
		playerTurn.loseMoney(tiles.get(playerTurn.getPosition()).getRentMonopoly());
		PlayerNumber.get(tiles.get(playerTurn.getPosition()).getOwnedBy() - 1).addMoney(tiles.get(playerTurn.getPosition()).getRentMonopoly());
		display.append("\n" + Name[playerTurn.getPosition()] + " has already been bought by " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1] + "\n" + playerName[rule.getTurn()] + " has paid $" + tiles.get(playerTurn.getPosition()).getRentMonopoly()+ " to " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1] + " because he or she has a monopoly over the property");
		charged = true;
	    }
	    if (((tiles.get(playerTurn.getPosition()).getOwnedBy()) > 0) && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) >= 0) && charged == false && ((tiles.get(playerTurn.getPosition()).getOwnedBy() - 1) != rule.getTurn()) && tiles.get(playerTurn.getPosition()).getMortgaged() == false) {
	        playerTurn.loseMoney(tiles.get(playerTurn.getPosition()).getRent());
		PlayerNumber.get(tiles.get(playerTurn.getPosition()).getOwnedBy() - 1).addMoney(tiles.get(playerTurn.getPosition()).getRent());
		display.append("\n" + Name[playerTurn.getPosition()] + " has already been bought by " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1] + "\n" + playerName[rule.getTurn()] + " has paid $" +  tiles.get(playerTurn.getPosition()).getRent()+ " to " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1]);
		charged = true;
	}

	    if (randomNum == randomNum1){
	        playerTurn.setDoubleRolls(playerTurn.getDoubleRolls() + 1);
		display.append("\nYou rolled a double! Roll again.");
	    }
	    if (randomNum != randomNum1) {
	        playerTurn.setRolls(false);
	    }
	    //need to fix
	    if (playerTurn.getDoubleRolls() == 3) {
		display.append("\n" + playerName[rule.getTurn()] + " has rolled 3 doubles in a roll.\nTherefore, he or she has been sent to Jail!");
		ButtonsOnBoard[playerTurn.getPosition()].remove(Players[rule.getTurn()]);
		ButtonsOnBoard[10].add(Players[rule.getTurn()]);
		playerTurn.setPosition(10);
		TurnDisplay.setText("It is now " + playerName[rule.getTurn()]  + "'s Turn. " + playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
		playerTurn.setJailCounter();
	    }
	    if (playerTurn.getPosition() == 30) {
		display.append("\n" + playerName[rule.getTurn()]+ " has been sent to Jail!");
		ButtonsOnBoard[30].remove(Players[rule.getTurn()]);
		ButtonsOnBoard[10].add(Players[rule.getTurn()]);
		playerTurn.setPosition(10);
	        TurnDisplay.setText("It is now " + playerName[rule.getTurn() + 1] + "'s Turn. " + playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
		playerTurn.setJailCounter();
	    }
	    
    }
	
	if (event.equals("End")) {
	    if (rule.getPlayers() == 2) {
		a5.setText("" + playerName[0] + "'s Money: " + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
		b5.setText("" + playerName[1] + "'s Money: " + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
	    c5.setText("Player 3 is not playing.");
	    d5.setText("Player 4 is not playing.");
	    }
	    if (rule.getPlayers() == 3) {
		a5.setText("" + playerName[0] + "'s Money: " + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
	    b5.setText("" + playerName[1] + "'s Money: "  + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
		c5.setText("" + playerName[2] + "'s Money: "  + PlayerNumber.get(2).getMoney() + "\nProperties: " + PlayerNumber.get(2).getProperty());
		d5.setText("Player 4 is not playing.");

	    }
	    if (rule.getPlayers() == 4) {
		a5.setText("" + playerName[0] + "'s Money: "  + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
		b5.setText("" + playerName[1] + "'s Money: "  + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
		c5.setText("" + playerName[2] + "'s Money: " + PlayerNumber.get(2).getMoney() + "\nProperties: " + PlayerNumber.get(2).getProperty());
		d5.setText("" + playerName[3] + "'s Money: "  + PlayerNumber.get(3).getMoney() + "\nProperties: " + PlayerNumber.get(3).getProperty());

	    }
	    if (randomNum != randomNum1) {
	        playerTurn.setDoubleRolls(0);
		playerTurn.setRolls(true);
		TurnDisplay.setText("It is now " + playerName[rule.getTurn()] + "'s Turn. " + playerName[rule.getTurn()] + " is on " + Name[playerTurn.getPosition()]);
		rule.setTurn();
		charged = false;
	    }
	    display.setText("It is " + playerName[rule.getTurn()]+ "'s Turn!\nPlease roll the dice.");
	}

	if (event.equals("Property") && setTurns){
	    if (((playerTurn.getMoney() - tiles.get(playerTurn.getPosition()).getCost()) < 0 ) && ((tiles.get(playerTurn.getPosition()).getOwnedBy()) == rule.getTurn() + 1)) {
		display.append("\nSorry, you do not have enough money to buy this property.");
	    }
	    if ((playerTurn.getMoney() - tiles.get(playerTurn.getPosition()).getCost()) > 0 ){
		if ((tiles.get(playerTurn.getPosition()).getOwnedBy()) == -1) {
		display.append("\nSorry, you cannot buy this property.");
	    }
	    if ((tiles.get(playerTurn.getPosition()).getOwnedBy()) >= 1){
		if((tiles.get(playerTurn.getPosition()).getOwnedBy()) == rule.getTurn() + 1) {
		    display.append("\nYou own this property.");
		}
		else{
		    display.append("\nSorry, this property is owned by " + playerName[tiles.get(playerTurn.getPosition()).getOwnedBy() - 1]);
		}
	    }
	    if (((tiles.get(playerTurn.getPosition()).getOwnedBy()) == 0) || playerTurn.getPosition() == 39) {
		tiles.get(playerTurn.getPosition()).setOwnedBy(rule.getTurn() + 1);
	        playerTurn.addProperty(playerTurn.getPosition());
	        playerTurn.loseMoney(tiles.get(playerTurn.getPosition()).getCost());
		Log1.setCaretPosition(0);	
		//edit for mortgage
		if (playerTurn.getMoney() < 0) {
		    playerDead[rule.getTurn()] = true;
		}
		display.append("\n" + playerName[rule.getTurn()] + " has bought " + Name[playerTurn.getPosition()] + "!");
		Log1.append("" + playerName[rule.getTurn()] + " has bought " +  Name[playerTurn.getPosition()] + "!\n");
		if (rule.getPlayers() == 2) {
		a5.setText("" + playerName[0] + "'s Money: " + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
		b5.setText("" + playerName[1] + "'s Money: " + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
	    c5.setText("Player 3 is not playing.");
	    d5.setText("Player 4 is not playing.");
	    }
	    if (rule.getPlayers() == 3) {
		a5.setText("" + playerName[0] + "'s Money: " + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
	    b5.setText("" + playerName[1] + "'s Money: "  + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
		c5.setText("" + playerName[2] + "'s Money: "  + PlayerNumber.get(2).getMoney() + "\nProperties: " + PlayerNumber.get(2).getProperty());
		d5.setText("Player 4 is not playing.");

	    }
	    if (rule.getPlayers() == 4) {
		a5.setText("" + playerName[0] + "'s Money: "  + PlayerNumber.get(0).getMoney() + "\nProperties: " + PlayerNumber.get(0).getProperty());
		b5.setText("" + playerName[1] + "'s Money: "  + PlayerNumber.get(1).getMoney() + "\nProperties: " + PlayerNumber.get(1).getProperty());
		c5.setText("" + playerName[2] + "'s Money: " + PlayerNumber.get(2).getMoney() + "\nProperties: " + PlayerNumber.get(2).getProperty());
		d5.setText("" + playerName[3] + "'s Money: "  + PlayerNumber.get(3).getMoney() + "\nProperties: " + PlayerNumber.get(3).getProperty());

	    }
		if(tiles.get(1).getOwnedBy() ==  tiles.get(3).getOwnedBy() && tiles.get(3).getOwnedBy() == (rule.getTurn() + 1)) {
		    playerTurn.setMonopoly(0,rule.getTurn() + 1);
		}
		if (tiles.get(6).getOwnedBy() == tiles.get(8).getOwnedBy() && tiles.get(9).getOwnedBy() == tiles.get(6).getOwnedBy() && tiles.get(6).getOwnedBy() == rule.getTurn() + 1){
		    playerTurn.setMonopoly(1,rule.getTurn() + 1);
		}
		if (tiles.get(11).getOwnedBy() == tiles.get(13).getOwnedBy() && tiles.get(11).getOwnedBy() == tiles.get(14).getOwnedBy()&& tiles.get(11).getOwnedBy() == rule.getTurn() + 1) {
		playerTurn.setMonopoly(2,rule.getTurn() + 1);
	    }
		if(tiles.get(16).getOwnedBy() == tiles.get(18).getOwnedBy() &&tiles.get(19).getOwnedBy() == tiles.get(16).getOwnedBy() && tiles.get(18).getOwnedBy() == rule.getTurn() + 1 ) {
		playerTurn.setMonopoly(3,rule.getTurn() + 1);
		}
		if(tiles.get(21).getOwnedBy() == tiles.get(23).getOwnedBy() &&tiles.get(21).getOwnedBy() == tiles.get(24).getOwnedBy() && tiles.get(24).getOwnedBy() == rule.getTurn() + 1){
		playerTurn.setMonopoly(4,rule.getTurn() + 1);
		}
		if (tiles.get(26).getOwnedBy() == tiles.get(28).getOwnedBy() &&tiles.get(29).getOwnedBy() == tiles.get(26).getOwnedBy() && tiles.get(28).getOwnedBy() == rule.getTurn() + 1){
		    playerTurn.setMonopoly(5,rule.getTurn() + 1);
		}
		if(tiles.get(31).getOwnedBy() == tiles.get(32).getOwnedBy() &&tiles.get(32).getOwnedBy() == tiles.get(34).getOwnedBy() && tiles.get(34).getOwnedBy() == rule.getTurn() + 1) {
		    playerTurn.setMonopoly(6,rule.getTurn() + 1);
		}
		if(tiles.get(37).getOwnedBy() == tiles.get(39).getOwnedBy() && tiles.get(37).getOwnedBy() == rule.getTurn() + 1 ) {
		    playerTurn.setMonopoly(7,rule.getTurn() + 1);
		}
		/*
		if(tiles.get(5).getOwnedBy() == tiles.get(15).getOwnedBy() &&tiles.get(25).getOwnedBy() == tiles.get(35).getOwnedBy() && tiles.get(15).getOwnedBy() == rule.getTurn()) {
		    playerTurn.setMonopoly(8,rule.getTurn());
		}
		*/
		if (tiles.get(12).getOwnedBy() == tiles.get(28).getOwnedBy()&& tiles.get(12).getOwnedBy() == rule.getTurn()) {
		    playerTurn.setMonopoly(9,rule.getTurn());
		}
		playerTurn.setTurn(rule.getTurn() + 1);
	    }
	    }
	    //display.setText("Auctioning will begin.");
	}
	/*
	if(display.getText().equals("Auctioning will begin.")) {
	    rule.setOriginalAunctionTurn() = rule.getTurn();
	    display.append("\n" + playerName[rule.getTurn()] + " will have the option of aunctioning for the property since it was not bought.\nIf you do not want to buy it, put 0 in the textbox and press enter.\nIf you do, bid an amount that is higher than the last bidder.\nSimply add the money after the $ sign, for example, if you want to bid 100, the textbox should look like: $100.");
	    textField.setText("$");
	    if (textField.getText().charAt(0) == '$') {
		display.append("\n" + playerName[rule.getTurn()] + "'s turn to aunction.");
		if (!textField.getText().charAt(0) == '$') {
		    display.append("\nPlease enter in the correct format");
		}
		if (!textField.getText().equals("$0")) {
		    rule.setAunctionTurn();
		    textField.setText("$");
		    if (textField.getText().charAt(0) == '$') {
			
			display.append("\n" + playerName[rule.getAunctionTurn()] "'s turn to aunction."];
			if (!textField.getText().charAt(0) == 'S') {
			    display.append("\nPlease enter in the correct format");
			}				
	*/			
	if (event.equals("House") && playerTurn.getHasMonopoly1(temp) && setTurns && !trading){
	    if (tiles.get(playerTurn.getPosition()).getMortgaged()) {
		display.append("\nSorry. You cannot buy a house when the property is mortgaged.");
	    }
	    if (houseCount == 0){
		display.append("\nSorry. You cannot buy a house, because there are no more houses left.");
		return;
	     }
	     boolean canDo = true;
	     for (int i = playerTurn.getHouseArray1(temp) - 1; i > 0; i--) {
		 if ( playerTurn.getHouseArray(temp,i) != playerTurn.getHouseArray(temp,(i -1))) {
		     canDo = false;
		 }
	     }
	     if (canDo) {
	    display.append("\nYou have bought a house on " + Name[playerTurn.getPosition()] +"\nKeep in mind that you  must have at least 1 house on all tiles of that color before buying a second one.");
	    houseCount -= 1;
	    tiles.get(playerTurn.getPosition()).setHouseNumber();
	    playerTurn.setHouseArray(temp,tiles.get(playerTurn.getPosition()).getNumInMonopoly(),tiles.get(playerTurn.getPosition()).getHouseNumber());
	    playerTurn.loseMoney(tiles.get(playerTurn.getPosition()).getHouseCost());
	    display.append("\n" + playerName[rule.getTurn()] + " has bought 1 house on " + Name[playerTurn.getPosition()] +  "!");
	    Log1.append("" + playerName[rule.getTurn()] + " has bought 1 house on " + Name[playerTurn.getPosition()]+  "!");
	     }
	     if (!canDo) {
		 display.append("\nYou must have at least 1 house on all tiles of that color before buying a second one.");
	     }
	}

	if(event.equals("House") && !playerTurn.getHasMonopoly1(temp) && setTurns) {
	    if (tiles.get(playerTurn.getPosition()).getOwnedBy() == -1) {
		display.append("\nYou cannot buy this property meaning you cannot build houses on it.");
		}
	    else {
		display.append("\nSorry. You must have a monopoly over the property AND land on the tile to buy a house.");
	    }
	    }
       
	if (event.equals("Jail Card") && playerTurn.getJailCard() > 0 && playerTurn.getPosition() == 10 && setTurns) {
	    playerTurn.setJailCard(-1);
	    while (playerTurn.getJailCounter() < 3){
		playerTurn.setJailCounter();
	    }
	}
	if (event.equals("Mortgage") && ((tiles.get(playerTurn.getPosition()).getOwnedBy()) > 0) && (tiles.get(playerTurn.getPosition()).getOwnedBy() - 1 == rule.getTurn()) && !tiles.get(playerTurn.getPosition()).getMortgaged() && tiles.get(playerTurn.getPosition()).getHouseNumber() > 0 && setTurns && !trading) {
		textField.setText("");
		display.append("\nYou must mortgage your houses before you mortgage your property.\nEnter the amount of houses you would like to mortgage, and then press Enter.");
		mortgagingHouse = true;
	}
	if (mortgagingHouse) {
	    try {
	    if (textField.getText().equals("1")) {
		tiles.get(playerTurn.getPosition()).setHouseNumber1(-1);
		houseCount += 1;
		mortgagingHouse = false;
		playerTurn.addMoney1(.5 * (double)tiles.get(playerTurn.getPosition()).getHouseCost());
		display.append("\nYou have mortgaged " + Name[playerTurn.getPosition()] + " for " + (.5 * (double)tiles.get(playerTurn.getPosition()).getHouseCost()) + ".");
		Log1.append("" + playerName[rule.getTurn()] + " has mortgaged 1 house on " + Name[playerTurn.getPosition()]);
	    }
	    if (textField.getText().equals("2") && tiles.get(playerTurn.getPosition()).getHouseNumber() >= 2) {
		tiles.get(playerTurn.getPosition()).setHouseNumber1(-2);
		houseCount += 2;
		mortgagingHouse = false;
		playerTurn.addMoney(tiles.get(playerTurn.getPosition()).getHouseCost());
		display.append("\nYou have mortgaged " + Name[playerTurn.getPosition()] + " for " + (1 * tiles.get(playerTurn.getPosition()).getHouseCost()) + ".");
		Log1.append("\n" + playerName[rule.getTurn()] + " has mortgaged 2 houses on " + Name[playerTurn.getPosition()]);
	    }
	    if (textField.getText().equals("3") && tiles.get(playerTurn.getPosition()).getHouseNumber() >= 3) {
		tiles.get(playerTurn.getPosition()).setHouseNumber1(-2);
		houseCount += 3;
		mortgagingHouse = false;
		playerTurn.addMoney1(1.5 * (double)tiles.get(playerTurn.getPosition()).getHouseCost());
		display.append("\nYou have mortgaged " + Name[playerTurn.getPosition()] + " for " + (1.5 * (double)tiles.get(playerTurn.getPosition()).getHouseCost()) + ".");
		Log1.append("\n" + playerName[rule.getTurn()] + " has mortgaged 3 houses on " + Name[playerTurn.getPosition()]);
	    }
	    if (textField.getText().equals("4") && tiles.get(playerTurn.getPosition()).getHouseNumber() == 4) {
		tiles.get(playerTurn.getPosition()).setHouseNumber1(-2);
		houseCount += 4;
		mortgagingHouse = false;
		playerTurn.addMoney(2 * tiles.get(playerTurn.getPosition()).getHouseCost());
		display.append("\nYou have mortgaged " + Name[playerTurn.getPosition()] + " for " + (2 * tiles.get(playerTurn.getPosition()).getHouseCost()) + ".");
		Log1.append("\n" + playerName[rule.getTurn()] + " has mortgaged 4 houses on " + Name[playerTurn.getPosition()]);
	    }
	    }
	    catch (StringIndexOutOfBoundsException gt) {
	    }
	}
	
	if (event.equals("Mortgage") && ((tiles.get(playerTurn.getPosition()).getOwnedBy()) > 0) && (tiles.get(playerTurn.getPosition()).getOwnedBy() - 1 == rule.getTurn()) && tiles.get(playerTurn.getPosition()).getMortgaged() == false && tiles.get(playerTurn.getPosition()).getHouseNumber() == 0  && setTurns && !trading){
	    display.append("\n" + playerName[rule.getTurn()]+ " has mortgaged " +Name[ playerTurn.getPosition()] + ".\n" + playerName[rule.getTurn()] + " will receive " + tiles.get(playerTurn.getPosition()).getMortgage() + " for mortgaging the property.\nThe cost for unmortgaging will be $" + tiles.get(playerTurn.getPosition()).getUnmortgage() + "");
	    Log1.append("\n" + playerName[rule.getTurn()]  + " has mortgaged " +Name[ playerTurn.getPosition()] + ".");
	    tiles.get(playerTurn.getPosition()).setMortgaged(true);
	    tiles.get(playerTurn.getPosition()).setMortgageCounter();
	    playerTurn.addMoney(tiles.get(playerTurn.getPosition()).getMortgage());
	    
	    
	}
	//add the option for deciding who goes first
	if (event.equals("Enter") && gameStart && !textField.getText().equals("") ) {
	    try {
	    gameStart = false;
	    if (textField.getText().charAt(0) == '1') {
		display.setText("You must have more than one player. Please type in a number from 2 to 4.");
		gameStart = true;
	    }
	    if (textField.getText().charAt(0) == '2') {
		display.append("\nPlayer set.");
		display.append("\nEnter in Player 1's nickname followed by a comma and then Player 2's in the textbox and press enter.(Do this for as many Players as you have.) Remove the name part and leave no spaces in between.\nFor example, if it is 3 Players:\nAlan,John,Andy.");
		textField.setText("Names:");
		playerDead[2] = true;
		playerDead[3] = true;
		rule.setPlayers(2);
		ButtonsOnBoard[0].remove(Players[2]);
		ButtonsOnBoard[0].remove(Players[3]);
	    }
	    if (textField.getText().charAt(0) == '3') {
	        display.append("\nPlayer set.");
		display.append("\nEnter in Player 1's nickname followed by a comma and then Player 2's in the textbox and press enter.(Do this for as many Players as you have.) Remove the name part and leave no spaces in between.\nFor example, if it is 3 Players:\nAlan,John,Andy");
		textField.setText("Names:");
		playerDead[3] = true;
		rule.setPlayers(3);
		ButtonsOnBoard[0].remove(Players[3]);
	    }
	    if (textField.getText().charAt(0) == '4') {
	        display.append("\nPlayer set.");
		display.append("\nEnter in Player 1's nickname followed by a comma and then Player 2's in the textbox and press enter.(Do this for as many Players as you have.) Remove the name part and leave no spaces in between.\nFor example, if it is 3 Players:\nAlan,John,Andy");
		textField.setText("Names:");
	    }
	    if (!textField.getText().equals("Names:")){
		display.append("\nPlease input a valid number.");
		gameStart = true;
	    }
	    }
	    catch (StringIndexOutOfBoundsException a){
	    }
	}
	
	if (event.equals("Enter") && !gameStart && !setNickname){
	    try {
	    String t = textField.getText();
	    if (rule.getPlayers() == 2) {
		playerName[0] = t.substring(0,t.indexOf(','));
		playerName[1] = t.substring((t.indexOf(',') + 1),t.length());
		setNickname = false;
		display.setText("Nicknames set.");
	    }
	     if (rule.getPlayers() == 3) {
		playerName[0] = t.substring(0,t.indexOf(','));
	        playerName[1] = t.substring((t.indexOf(',') + 1),t.lastIndexOf(','));
	        playerName[2] = t.substring((t.lastIndexOf(',') + 1),t.length());
		setNickname = false;
		display.setText("Nicknames set.");
	    }
	      if (rule.getPlayers() == 4) {
		  String substring1 = t.substring((t.indexOf(',') + 1),t.lastIndexOf(',')); //"2nd,3rd"
		  playerName[0] = t.substring(0,t.indexOf(','));
		  playerName[1] = substring1.substring(0,(substring1.indexOf(',')));
		  playerName[2] = substring1.substring((substring1.indexOf(',') + 1),substring1.length());
		  playerName[3] = t.substring((t.lastIndexOf(',') + 1),t.length());
		setNickname = false;
		display.setText("Nicknames set.");
	    }
	    if (!setNickname) {
		display.append("\nRoll the dice to decide who's turn it is.");
	    }
	    }
	    catch (StringIndexOutOfBoundsException j) {
	    }
	}

	if (event.equals("Trade") && !trading) {
	    display.setText("Type in the player number of which you want to trade property with.");
	    textField.setText("");
	    trading = true;
	}

	if  (event.equals("Enter") && setTurns && !gameStart && !setNickname && (textField.getText().equals("1") || textField.getText().equals("2") || textField.getText().equals("3") || textField.getText().equals("4"))) {
	    try{
		trading1 = Integer.parseInt(textField.getText());
		trading3 = true;
		display.append("\nPlease type the name of the property you want.(The number corresponds with the position the property is on the board.)Leave the Property there.\nFor example, Property:37");
		textField.setText("Property:");
	    }
	    catch (Exception dd){
	    }
	}

	if(event.equals("Enter") && trading && setTurns && trading3 && !gameStart && !setNickname && textField.getText().length() > 9)  {
	    try {
		int temptemp1 = Integer.parseInt(textField.getText().substring(9,textField.getText().length()));	    
		if(tiles.get(temptemp1).getRent() == 0) {
		    display.append("\nCannot trade for this tile. Start over.");
		trading3 = false;
		trading = false;
		}
		tradedTile = temptemp1;
		display.append("\nTrading for " + Name[tradedTile] + ".");
	    }
	    catch (Exception j) {
	    }
	}

	if(trading1 > 0 && setTurns && trading && tradedTile > 0) {
	    display.append("\nPlease let " + playerName[trading1 - 1] + " type in one of the following options: \nYes,followed by amount of money demanded for the property.\nYes,followed by the exact name of the property tile that is to be exchanged.(You can press on the tile to see the exact name)\nFor example, either of these are fine: Yes,300 or Yes,Boardwalk");
	    trigger = true;
		    }
	
	if  (trigger && trading1 > 0 && tradedTile > 0 && setTurns && trading && event.equals("Enter") && textField.getText().substring(0,3).equals("Yes")) {
	    System.out.println("OK");
	    try {
		if(textField.getText().charAt(4) <= '9') {
		    int temptemp = Integer.parseInt(textField.getText().substring(3,textField.getText().length()));
		    if (temptemp > playerTurn.getMoney()) {
			display.setText("Sorry, you do not have enough money. You may restart the trade.");
			trading = false;
			trigger = false;
			trading1 = 0;
			tradedTile = 0;
		    }
		    PlayerNumber.get(trading1).addMoney(temptemp);
		    playerTurn.loseMoney(temptemp);
		    display.append("\nTrade done!");
		    trading = false;
		    trigger = false;
		    trading1 = 0;
		    tradedTile = 0;
		}
		    if(textField.getText().charAt(4) >= 'A' && textField.getText().charAt(4) <= 'Z') {
			
			
		    }
	    }
	    catch (Exception ll){
	    }
    	}							   
	
    
    }
    public static void main(String[] args) {
      Board g = new Board();
      g.setVisible(true);
    }
}
