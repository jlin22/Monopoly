//"Mediterranean Ave.", "Baltic Ave.", "Reading Railroad.","Oriental Ave.","Vermont Ave.","Connecticut Ave.","St. Charles Place.","Electric Company.","States Ave.","Virginia Ave.","Pennsylvania Railroad.","St. James Place","Tennessee Avenue","New York Avenue","Kentucky Avenue","Indiana Avenue","Illinois Avenue","B&O Railroad.","Atlantic Avenue","Ventnor Avenue","Water Work.","Marvin Gardens","Pacific Avenue","North Carolina Avenue","Pennsylvania Avenue","Short Line.","Park Place","Boardwalk",

public class Deeds {
    private int position; //a 1
    private int rent; //c 2
    private int rentMonopoly; //d 3 
    private int rent1H; //e 4
    private int rent2H; //f 5
    private int rent3H; //g 6
    private int rent4H; //h  7 
    private int hotel; //i 8
    private int houseCost; //j 9 
    private int mortgage; //k 10
    private int unmortgage; //l 11
    private int cost; //m 12
    //chance & community chest stuff
    private int cardNumber; //n 13
    private int sentPosition; //o 14
    private int getMoney; //q 15

    public Deeds(int a, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l,int m,int n, int o,int q) {
	position = a;
	rent = c;
	rentMonopoly = d;
	rent1H = e;
	rent2H = f;
	rent3H = g;
	rent4H = h;
	hotel = i;
	houseCost = j;
	mortgage = k;
	unmortgage = l;
	cost = m;
	cardNumber = n;
	sentPosition = o;
	getMoney = q;
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

    public int getCardNumber() {
	return cardNumber;
    }

    public int getSentPosition(){
	return sentPosition;
    }

    public int getGetMoney() {
	return getMoney;
    }

    public String toString() {
	return "" + position + "," + rent + "," + rentMonopoly + "," + rent1H + "," + rent2H + "," + rent3H + "," + rent4H + "," + hotel +  ","  + houseCost + "," + mortgage + "," + unmortgage + "," + cost + "," + cardNumber + "," + sentPosition + "," + getMoney + "";
    }

    public int[] convert(String s) {
	int [] answer = new int[s.length()];
	for(int n = 0; n < s.length(); n++) {
	    answer[n] = (int)(s.indexOf(n));
	}
	return answer;
    }

    
}
