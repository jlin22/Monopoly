//Chance Cards
/*
"Advance To Go. (Collect $200)"
"Bank Pays You Dividend of $50."
"Go Back 3 Spaces."
"Advance Token to Nearest Utility. If Unowned You May Buy It From Bank. If Owned, Throw Dice and Pay Owner a Total Ten Times the Amount Thrown."
"Go DIRECTLY To Jail. Do Not Pass Go, Do Not Collect $200."
"Pay Poor Tax of $15."
"Advance to St. Charle's Place. If You Pass Go, Collect $200."
"You Have Been Elected Chairman of The Board. Pay Each Player $50."
"Advance Token to the Nearest Railroad and Pay Owner Twice the Rental to Which He is Otherwise Entitled. If Railroad is Unowned, You May Buy it From the Bank."
"Take A Ride On the Reading Railroad. If You Pass Go, Collect $200."
"Take a Walk on The Boardwalk. Advance Token to Boardwalk."
"Your Building and Loan Matures. Collect $150."
"Advance to Illinois Ave."
"This Card May Be Kept Until Needed or Sold. GET OUT OF JAIL FREE."
"Make General Repairs On All Your Property. For Each House Pay $25. For Each Hotel $100."
*/

public class Chance {
    private int position;
    private String message;

    public Chance (int a, String b) {
	a = position;
	b = message;
    }
    public int getPosition(){
	return position;
    }
    public String message(){
	return message;
    }
}
