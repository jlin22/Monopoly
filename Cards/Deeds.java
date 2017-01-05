public class Deeds {
    private int position; //a 
    private String name; //b 
    private int rent; //c 
    private int rentMonopoly; //d 
    private int rent1H; //e 
    private int rent2H; //f
    private int rent3H; //g
    private int rent4H; //h 
    private int hotel; //i 
    private int houseCost; //j 
    private int mortgage; //k
    private int unmortgage; //l
    private int cost; //m

	public Deeds(int a, String b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l,int m) {
	position = a;
	name = b;
	rent = c;
	rentMonopoly = d;
	rent1H = e;
	rent2H = f;
	rent3H = g;
	rent4H = h;
	hotel = i;
	houseCost = j;
	k = k * -1;
	mortgage = k;
	unmortgage = l;
	m = -1 * m;
	cost = m;
    }

 
    public int getPosition() {
	return position;
    }

    public String getName() {
	return name;
    }

    public int getRent() {
	return rent;
    }

    public int getRentMonopoly() {
	return rentMonopoly;
    }

    public int getRent1H() {
	return rent1H;
    }

    public int getRent2H() {
	return rent2H;
    }

    public int getRent3H() {
	return rent3H;
    }

    public int getRent4H() {
	return rent4H;
    }

    public int getHotel() {
	return hotel;
    }

    public int getHouseCost() {
	return houseCost;
    }

    public int getMortgage() {
	return mortgage;
    }
    
    public int getUnmortgage() {
	return unmortgage;
    }   
}
