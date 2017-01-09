import java.util.*;
public class CardArray{
    private ArrayList<String> communityChestList;
    private ArrayList<String> ChanceList;
    private ArrayList<String> randomizedCommunityChest;
    private ArrayList<String> randomizedChanceList;
    private int[] communityListPosition, chanceListPosition, communityListMoney, chanceListMoney;
    
    public CardArray(){
	communityChestList= new ArrayList<String>();
	ChanceList= new ArrayList<String>();
	randomizedCommunityChest = new ArrayList<String>();
	randomizedChanceList = new ArrayList<String>();
	communityChestList.add("It Is Your Birthday. Collect $10 From Every Player."); //0
	communityChestList.add("You Inherit $100."); //1
	communityChestList.add("Receive $25 For Consultancy Fee."); //2
	communityChestList.add("Pay Hospital Fees. Pay $100."); //3
	communityChestList.add("Doctor's Fee. Pay $50.");//4
	communityChestList.add("From Sale of Stock. You Get $50."); //5
	communityChestList.add("Go To Jail. Go Directly to Jail. Do Not Pass Go. Do Not collect $200."); //6
	communityChestList.add("Life Insurance Matures. Collect $100.");//7
	communityChestList.add("You Have Won Second Prize In A Beauty Contest. Collect $10"); //8
	communityChestList.add("Holiday Fund Matures. Collect $100."); //9	
	communityChestList.add("You Are Assessed For Street Repairs. $40 Per House. $115 Per Hotel."); //10
	communityChestList.add("Bank Error In Your Favor. Collect $200."); //11
	communityChestList.add("Income Tax Refund. Collect $20.");//12
	communityChestList.add("Get Out of Jail Free Card."); //13
	communityChestList.add("Pay School Fees of $50."); //14
	communityChestList.add("Advance To Go. (Collect $200)"); //15
	ChanceList.add("Advance To Go. (Collect $200)"); //0
	ChanceList.add("Bank Pays You Dividend of $50."); //1
	ChanceList.add("Go Back 3 Spaces.");//2
	ChanceList.add("Advance Token to Nearest Utility. If Unowned You May Buy It From Bank. If Owned, Throw Dice and Pay Owner a Total Ten Times the Amount Thrown."); //3
	ChanceList.add("Go DIRECTLY To Jail. Do Not Pass Go, Do Not Collect $200.");//4
	ChanceList.add("Speeding Fine $15."); //5
	ChanceList.add("Advance to St. Charle's Place. If You Pass Go, Collect $200.");//6
	ChanceList.add("Advance Token to the Nearest Railroad and Pay Owner Twice the Rental to Which He is Otherwise Entitled. If Railroad is Unowned, You May Buy it From the Bank."); //7
	ChanceList.add("Advance Token to the Nearest Railroad and Pay Owner Twice the Rental to Which He is Otherwise Entitled. If Railroad is Unowned, You May Buy it From the Bank."); //8
	ChanceList.add("Take A Trip To the Reading Railroad. If You Pass Go, Collect $200."); //9
	ChanceList.add("Advance to Boardwalk."); //10
	ChanceList.add("Your Building and Loan Matures. Collect $150."); //11
	ChanceList.add("Advance to Illinois Ave. (If You Pass 'GO' Collect $200.)"); //12
	ChanceList.add("This Card May Be Kept Until Needed or Sold. GET OUT OF JAIL FREE."); //13
	ChanceList.add("Make General Repairs On All Your Property. For Each House Pay $25. For Each Hotel $100."); //14
	ChanceList.add("You Have Been Elected Chairman Of the Board. Pay Each Player $50.");
	createRandomizedCommunityChest();
	createRandomizedChance();
	chanceListPosition = new int[16];
	chanceListMoney = new int[16];
	communityListMoney = new int[16];
	communityListPosition = new int[16];
    //100 is var
    chanceListPosition[0] = 0;
    chanceListPosition[1] = -1;
    chanceListPosition[2] = 1;
    chanceListPosition[3] = 1;
    chanceListPosition[4] = 10;
    chanceListPosition[5] = -1;
    chanceListPosition[6] = 11;
    chanceListPosition[7] = 1;
    chanceListPosition[8] = 1;
    chanceListPosition[9] = 5;
    chanceListPosition[10] = 39;
    chanceListPosition[11] = -1; 
    chanceListPosition[12] = 24;
    chanceListPosition[13] = -1; //fix this its get out of jail free
    chanceListPosition[14] = -1;
    chanceListPosition[15] = -1;

    //1000 is var
    chanceListMoney[0] = 200;
    chanceListMoney[1] = 50;
    chanceListMoney[2] = 0;
    chanceListMoney[3] = 0;
    chanceListMoney[4] = 0;
    chanceListMoney[5] = -15;
    chanceListMoney[6] = 0;
    chanceListMoney[7] = 0;
    chanceListMoney[8] = 0;
    chanceListMoney[9] = 0;
    chanceListMoney[10] = 0;
    chanceListMoney[11] = 150; 
    chanceListMoney[12] = 0;
    chanceListMoney[13] = 1000; // fix this too
    chanceListMoney[14] = 1000; // fix this later
    chanceListMoney[15] = -200;

    communityListPosition[0] = -1;
    communityListPosition[1] = -1;
    communityListPosition[2] = -1;
    communityListPosition[3] = -1;
    communityListPosition[4] = -1;
    communityListPosition[5] = -1;
    communityListPosition[6] = 10;
    communityListPosition[7] = -1;
    communityListPosition[8] = -1;
    communityListPosition[9] = -1;
    communityListPosition[10] = -1;
    communityListPosition[11] = -1;
    communityListPosition[12] = -1;
    communityListPosition[13] = -1;
    communityListPosition[14] = -1;
    communityListPosition[15] = 0;

    communityListMoney[0] = 10;
    communityListMoney[1] = 100;
    communityListMoney[2] = 25;
    communityListMoney[3] = -100;
    communityListMoney[4] = -50;
    communityListMoney[5] = 50;
    communityListMoney[6] = 0;
    communityListMoney[7] = 100;
    communityListMoney[8] = 10;
    communityListMoney[9] = 100;
    communityListMoney[10] = 1000;//edit
    communityListMoney[11] = 200;
    communityListMoney[12] = 20;
    communityListMoney[13] = 1000;//edit
    communityListMoney[14] = -50;
    communityListMoney[15] = 200;

    }

	
    public int getChancePosition(String x) {
	for (int i = 0; i < 15; i ++ ) {
	    if (x.equals(ChanceList.get(i))){
		    return chanceListPosition[i];
		}
	}
	return 0;
    }
    
    public int getCommunityPosition(String x) {
	for (int i = 0; i < 15; i ++ ) {
	    if (x.equals(communityChestList.get(i))){
		return communityListPosition[i];
	    }
	}
	return 0;
    }
    
    public int getChanceMoney(String x) {
	for (int i = 0; i < 15; i ++ ) {
	    if (x.equals(ChanceList.get(i))){
		    return chanceListMoney[i];
		}
	}
	return 0;
    }
    
    public int getCommunityMoney(String x) {
	for (int i = 0; i < 15; i ++ ) {
	    if (x.equals(communityChestList.get(i))){
		return communityListMoney[i];
	    }
	}
	return 0;
    }
    
    public void setChancePosition(String cardNumber,int x) {
	for (int i = 0; i < 15; i++ ) {
	    if(cardNumber.equals(ChanceList.get(i))) {
		chanceListPosition[i] = x;
	    }
	}
    }

    public void setChancePosition(int y,int x) {
	chanceListPosition[y] = x; 
    }

    public void setCommunityPosition(String cardNumber,int x) {
	for (int i = 0; i < 15; i++ ) {
	    if(cardNumber.equals(communityChestList.get(i))) {
		communityListPosition[i] = x;
	    }
	}
    }
    
    public void setCommunityPosition(int y,int x) {
	communityListPosition[y] = x; 
    }

    public void setCommunityMoney(String cardNumber,int x) {
	for (int i = 0; i < 15; i++ ) {
	    if(cardNumber.equals(communityChestList.get(i))) {
		communityListMoney[i] = x;
	    }
	}
    }

    public void setCommunityMoney(int y,int x) {
	communityListMoney[y] = x; 
    }


    public void setChanceMoney(String cardNumber,int x) {
	for (int i = 0; i < 15; i++ ) {
	    if(cardNumber.equals(ChanceList.get(i))) {
		chanceListMoney[i] = x;
	    }
	}
    }

    public void setChanceMoney(int y,int x) {
	chanceListMoney[y] = x; 
    }
    

    public void createRandomizedCommunityChest(){
	ArrayList<String> x = new ArrayList<String>();
	for (int i = 0; i < communityChestList.size(); i++){
	    x.add(communityChestList.get(i));
	}
	    for (int r = 0; r < communityChestList.size(); r++){
	    int y = (int)(Math.random()*(x.size()));
	    randomizedCommunityChest.add(x.get(y));
	    x.remove(x.get(y));
	}	    
    }
    public void createRandomizedChance(){
	ArrayList<String> x1 = new ArrayList<String>();
	for (int i1 = 0; i1 < ChanceList.size(); i1++){
	    x1.add(ChanceList.get(i1));
	}
	    for (int r1 = 0; r1 < ChanceList.size(); r1++){
	    int y1 = (int)(Math.random()*(x1.size()));
	    randomizedChanceList.add(x1.get(y1));
	    x1.remove(x1.get(y1));
	}	    
    }
    public ArrayList<String> getRandomizedCommunityChest(){
	return randomizedCommunityChest;
    }
    public ArrayList<String> getRandomizedChance(){
	return randomizedChanceList;
    }
    public boolean ChanceEmpty(){
	return randomizedChanceList.size() == 0;
    }
    public boolean CommunityChestEmpty(){
	return randomizedCommunityChest.size() == 0;
    }
    //use these only to print text
    public String getRandomizedChanceCard(){
	int y = (int)(Math.random()*(randomizedChanceList.size()));
	String z = randomizedChanceList.get(y);
	randomizedChanceList.remove(y);
	return z;
    }
    public String getRandomizedCommunityChestCard(){
	int y = (int)(Math.random()*(randomizedCommunityChest.size()));
	String z = randomizedCommunityChest.get(y);
	randomizedCommunityChest.remove(y);
	return z;
    }

    public ArrayList<String> getChanceList() {
	return ChanceList;
    }

    public ArrayList<String> getCommunityChestList() {
	return communityChestList;
    }
    public static void main(String[]a){
	CardArray x = new CardArray();
	System.out.println(x.getRandomizedChance());
	System.out.println(x.getRandomizedCommunityChest());
	System.out.println(x.getRandomizedCommunityChestCard());
	System.out.println(x.getRandomizedChanceCard());
    }

}
