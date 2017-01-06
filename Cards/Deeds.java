//"Mediterranean Ave.", "Baltic Ave.", "Reading Railroad.","Oriental Ave.","Vermont Ave.","Connecticut Ave.","St. Charles Place.","Electric Company.","States Ave.","Virginia Ave.","Pennsylvania Railroad.","St. James Place","Tennessee Avenue","New York Avenue","Kentucky Avenue","Indiana Avenue","Illinois Avenue","B&O Railroad.","Atlantic Avenue","Ventnor Avenue","Water Work.","Marvin Gardens","Pacific Avenue","North Carolina Avenue","Pennsylvania Avenue","Short Line.","Park Place","Boardwalk",

public class Deeds {
    private int position; //a 
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

	public Deeds(int a, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l,int m) {
	position = a;
	
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

    public int getCost() {
	return cost;
    }

    public String toString() {
	return "" + position + "," + rent + "," + rentMonopoly + "," + rent1H + "," + rent2H + "," + rent3H + "," + rent4H + "," + hotel +  ","  + houseCost + "," + mortgage + "," + unmortgage + "," + cost + "";
    }

    public int[] convert(String s) {
	int [] answer = new int[s.length()];
	for(int n = 0; n < s.length(); n++) {
	    answer[n] = (int)(s.indexOf(n));
	}
	return answer;
    }

    
}
