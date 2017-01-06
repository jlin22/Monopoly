public class emptyTile {
    private int position;
    private int getMoney;
    private int sentPosition;

    public emptyTile(int a, int b,int c) {
	a = position;
	b = getMoney;
	c = sentPosition;
    }

    public int getPosition() {
	return position;
    }

    public int getGetMoney() {
	return getMoney;
    }

    public int getSentPosition() {
	return sentPosition;
    }

    public String toString() {
	return "" + position + "," + getMoney + "," + sentPosition;
    }
}
