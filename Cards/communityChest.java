//CommunityChests
/*
"Collect $50 From Every Player."
"Receive $25 For Services."
"Advance To Go (Collect $200)."
"Pay Hospital Fees. Pay $100."
"Doctor's Fee. Pay $50."
"Get Out of Jail, Free."
"From Sale of Stock, You Get $45."
"You Inherit $100."
"Go To Jail. Go Directly to Jail. Do Not Pass Go. Do Not collect $200."
"Life Insurance Matures. Collect $100."
"You Have Won Second Prize In A Beauty Contest. Collect $10"
"Xmas Fund Matures. Collect $100."
"You Are Assessed For Street Repairs. $40 Per House. $115 Per Hotel."
"Bank Error In Your Favor. Collect $200."
"Income Tax Refund. Collect $20."
*/

public class communityChest {
    private int position;
    private int getMoney;
    private int sentPosition;
    private int cardNumber;
    private int loseMoney;

    public communityChest (int a, int b, int c, int d, int e) {
	a = position;
	b = getMoney;
	c = sentPosition;
	d = cardNumber;
	e = loseMoney;
    }
    public int getPosition(){
	return position;
    }

    public int getGetMoney() {
	return getMoney;
    }

    public int getSentPosition() {
	return sentPosition;
    }

     public int getCardNumber() {
	 return cardNumber;
    }

    public int getLoseMoney(){
	return loseMoney;
    }

    public String toString() {
	return "" + position + "," + getMoney + "," + sentPosition + "," + cardNumber + "," + loseMoney;
    }
    
}
