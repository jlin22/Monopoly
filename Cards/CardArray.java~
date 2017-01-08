import java.util.*;
public class CardArray{
    private ArrayList<String> communityChestList;
    private ArrayList<String> ChanceList;
    private ArrayList<String> randomizedCommunityChest;
    private ArrayList<String> randomizedChanceList;
    public CardArray(){
	communityChestList= new ArrayList<String>();
	ChanceList= new ArrayList<String>();
	randomizedCommunityChest = new ArrayList<String>();
	randomizedChanceList = new ArrayList<String>();
	communityChestList.add("It Is Your Birthday. Collect $10 From Every Player."); //
	communityChestList.add("You Inherit $100."); 
	communityChestList.add("Receive $25 For Consultancy Fee."); //
	communityChestList.add("Pay Hospital Fees. Pay $100."); //
	communityChestList.add("Doctor's Fee. Pay $50.");//
	communityChestList.add("From Sale of Stock. You Get $50."); //
	communityChestList.add("Go To Jail. Go Directly to Jail. Do Not Pass Go. Do Not collect $200."); //
	communityChestList.add("Life Insurance Matures. Collect $100.");//
	communityChestList.add("You Have Won Second Prize In A Beauty Contest. Collect $10"); //
	communityChestList.add("Holiday Fund Matures. Collect $100."); //	
	communityChestList.add("You Are Assessed For Street Repairs. $40 Per House. $115 Per Hotel."); //
	communityChestList.add("Bank Error In Your Favor. Collect $200."); //
	communityChestList.add("Income Tax Refund. Collect $20.");//
	communityChestList.add("Get Out of Jail Free Card."); //
	communityChestList.add("Pay School Fees of $50."); //
	communityChestList.add("Advance To Go. (Collect $200)"); //
	ChanceList.add("Advance To Go. (Collect $200)"); //
	ChanceList.add("Bank Pays You Dividend of $50."); //
	ChanceList.add("Go Back 3 Spaces.");//
	ChanceList.add("Advance Token to Nearest Utility. If Unowned You May Buy It From Bank. If Owned, Throw Dice and Pay Owner a Total Ten Times the Amount Thrown."); //
	ChanceList.add("Go DIRECTLY To Jail. Do Not Pass Go, Do Not Collect $200.");//
	ChanceList.add("Speeding Fine $15."); //
	ChanceList.add("Advance to St. Charle's Place. If You Pass Go, Collect $200.");//
	ChanceList.add("Advance Token to the Nearest Railroad and Pay Owner Twice the Rental to Which He is Otherwise Entitled. If Railroad is Unowned, You May Buy it From the Bank."); //
	ChanceList.add("Advance Token to the Nearest Railroad and Pay Owner Twice the Rental to Which He is Otherwise Entitled. If Railroad is Unowned, You May Buy it From the Bank."); //
	ChanceList.add("Take A Trip To the Reading Railroad. If You Pass Go, Collect $200."); //
	ChanceList.add("Advance to Boardwalk."); //
	ChanceList.add("Your Building and Loan Matures. Collect $150."); //
	ChanceList.add("Advance to Illinois Ave. (If You Pass 'GO' Collect $200.)"); //
	ChanceList.add("This Card May Be Kept Until Needed or Sold. GET OUT OF JAIL FREE."); //
	ChanceList.add("Make General Repairs On All Your Property. For Each House Pay $25. For Each Hotel $100."); //
	createRandomizedCommunityChest();
	createRandomizedChance();
	
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
    //use these only to print text
    public String getRandomizedChanceCard(){
	int y = (int)(Math.random()*(randomizedChanceList.size()));
	return randomizedChanceList.get(y);
    }
    public String getRandomizedCommunityChest(){
	int y = (int)(Math.random()*(randomizedCommunityChest.size()));
	return randomizedCommunityChest.get(y);
    }
    public static void main(String[]a){
	CardArray x = new CardArray();
	System.out.println(x.getRandomizedChance());
	System.out.println(x.getRandomizedCommunityChest());
    }
}
