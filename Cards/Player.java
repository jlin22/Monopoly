import java.util.*;
public class Player{
    private int money,position,getOutOfJailCards,count,doubleRolls,turn, jailCounter,brownMonopoly,cyanMonopoly,magentaMonopoly,orangeMonopoly,redMonopoly,yellowMonopoly,greenMonopoly,blueMonopoly,railroadMonopoly,utilityMonopoly,hasMonopoly,houseCount,hotelCount;
    private int[] propertiesOwned;
    private int[] houses;
    private boolean rolls,stillIn;
    private int[]monopoly;
    private int[] brownMonopolyH,cyanMonopolyH,magentaMonopolyH,orangeMonopolyH,redMonopolyH,yellowMonopolyH,greenMonopolyH,blueMonopolyH;
    private int[][]houseArray;
    public Player() {
	money = 1500;
	position = 0;
	propertiesOwned = new int[40];
	houses = new int[40];
	getOutOfJailCards = 0;
	rolls = true;
	doubleRolls = 0;
	turn = 1;
	brownMonopoly = 0;
	cyanMonopoly = 0;
	magentaMonopoly = 0;
	orangeMonopoly = 0;
	redMonopoly = 0;
	yellowMonopoly = 0;
	greenMonopoly = 0;
	blueMonopoly = 0;
	railroadMonopoly = 0;
	utilityMonopoly = 0;
	hasMonopoly = 0;
	monopoly = new int[10];
	monopoly[0] = brownMonopoly;
	monopoly[1] = cyanMonopoly;
	monopoly[2] = magentaMonopoly;
	monopoly[3] = orangeMonopoly;
	monopoly[4] = redMonopoly;
	monopoly[5] = yellowMonopoly;
	monopoly[6] = greenMonopoly;
	monopoly[7] = blueMonopoly;
	monopoly[8] = railroadMonopoly;
	monopoly[9] = utilityMonopoly;
	jailCounter = 0;
	brownMonopolyH = new int[2];
	cyanMonopolyH = new int [3];
	magentaMonopolyH = new int [3];
	orangeMonopolyH = new int[3];
	redMonopolyH = new int [3];
	yellowMonopolyH = new int[3];
	greenMonopolyH = new int[3];
	blueMonopolyH = new int[2];
	houseArray = new int[8][3];
	houseArray[0][0] = brownMonopolyH[0];
	houseArray[0][1] = brownMonopolyH[1];
	houseArray[1][0] = cyanMonopolyH[0];
	houseArray[1][1] = cyanMonopolyH[1];
	houseArray[1][2] = cyanMonopolyH[2];
	houseArray[2][0] = magentaMonopolyH[0];
	houseArray[2][1] = magentaMonopolyH[1];
	houseArray[2][2] = magentaMonopolyH[2];
	houseArray[3][0] = orangeMonopolyH[0];
	houseArray[3][1] = orangeMonopolyH[1];
	houseArray[3][2] = orangeMonopolyH[2];
	houseArray[4][0] = redMonopolyH[0];
	houseArray[4][1] = redMonopolyH[1];
	houseArray[4][2] = redMonopolyH[2];
	houseArray[5][0] = yellowMonopolyH[0];
	houseArray[5][1] = yellowMonopolyH[1];
	houseArray[5][2] = yellowMonopolyH[2];
	houseArray[6][0] = greenMonopolyH[0];
	houseArray[6][1] = greenMonopolyH[1];
	houseArray[6][2] = greenMonopolyH[2];
	houseArray[7][0] = blueMonopolyH[0];
	houseArray[7][1] = blueMonopolyH[1];
	stillIn = true;
    }

    public void setStillIn() {
	stillIn = false;
    }

    public boolean getStillIn() {
	return stillIn;
    }

    public int getHouseArray1(int whichArray) {
	return houseArray[whichArray].length;
    }
    
    public int getHouseArray(int whichArray,int whichPosition) {
	return houseArray[whichArray][whichPosition];
    }

    public void setHouseArray(int whichArray, int whichTile,int newNum) {
	houseArray[whichArray][whichTile]  = newNum; 
    }
    
    public int getHouseCount() {
	return houseCount;
    }

    public int getHotelCount() {
	return hotelCount;
    }

    public void setHouseCount(int x) {
	houseCount += x;
    }

    public void setHotelCount(int x ) {
	hotelCount += x;
    }

    public int getJailCounter() {
	return jailCounter;
    }

    public void setJailCounter() {
	jailCounter += 1 ; 
    }
    public void loseJailCounter(){
	jailCounter -= 1;
    }

    public int[] getMonopoly() {
	 monopoly[0] = brownMonopoly;
	 monopoly[1] = cyanMonopoly;
	 monopoly[2] = magentaMonopoly;
	 monopoly[3] = orangeMonopoly;
	 monopoly[4] = redMonopoly;
	 monopoly[5] = yellowMonopoly;
	 monopoly[6] = greenMonopoly;
	 monopoly[7] = blueMonopoly;
	 monopoly[8] = railroadMonopoly;
	 monopoly[9] = utilityMonopoly;
	return monopoly;
    }

    public void setMonopoly(int x,int y) {
	monopoly[x] = y;
    }

    public boolean getHasMonopoly1(int x) {
	return (monopoly[x] > 0);
    }

    public boolean getAnyMonopoly() {
	for (int i = 0; i < 10; i ++) {
	    if (monopoly[i] > 0) {
		return true;
	    }
	}
	return false;
    }

    public int getHasMonopoly(int x) {
	for (int i = 0; i < 10; i++) {
	    if (monopoly[i] == x) {
		return i;
	    }
	}
	return 5;
    }


    /*
    public boolean getRailroadMonopoly() {
	return railroadMonopoly;
    }

    public void setRailroadMonopoly(boolean x) {
	railroadMonopoly = x;
    }
    
    public boolean getUtilityMonopoly() {
	return utilityMonopoly;
    }

    public void setUtilityMonopoly(boolean x) {
	utilityMonopoly = x;
    }
    
    public boolean getBrownMonopoly() {
	return brownMonopoly;
    }

    public void setBrownMonopoly(boolean x) {
	brownMonopoly = x;
    }

    public boolean getCyanMonopoly() {
	return cyanMonopoly;
    }

    public void setCyanMonopoly(boolean x) {
	cyanMonopoly = x;
    }
    
    public boolean getMagentaMonopoly() {
	return magentaMonopoly;
    }

    public void setMagentaMonopoly(boolean x) {
	magentaMonopoly = x;
    }
    public boolean getOrangeMonopoly() {
	return orangeMonopoly;
    }

    public void setOrangeMonopoly(boolean x) {
	orangeMonopoly = x;
    }

    public boolean getRedMonopoly() {
	return redMonopoly;
    }

    public void setRedMonopoly(boolean x) {
	redMonopoly = x;
    }

    public boolean getYellowMonopoly() {
	return yellowMonopoly;
    }

    public void setYellowMonopoly(boolean x) {
	yellowMonopoly = x;
    }

    public boolean getGreenMonopoly() {
	return greenMonopoly;
    }

    public void setGreenMonopoly(boolean x) {
	greenMonopoly = x;
    }

    public boolean getBlueMonopoly() {
	return blueMonopoly;
    }

    public void setBlueMonopoly(boolean x) {
	blueMonopoly = x;
    }
    */
    public String toString() {
	return "" + turn;
    }

    public int getTurn() {
	return turn;
    }

    public void setTurn(int  x) {
	turn = x;
    }
    
    public boolean getRolls() {
	return rolls;
    }

    public void setRolls(boolean x) {
	rolls = x;
    }

    public int getDoubleRolls() {
	return doubleRolls;
    }

    public void setDoubleRolls(int x) {
	doubleRolls = x;
    }

    public int getMoney(){
	return money;
    }
    
    public void addMoney(int x){
	money += x;
    }

    public void addMoney1(double x){
	money += (int)x;
    }
    
    public void loseMoney(int x){
	money -= x;
    }

    public int getPosition() {
	return position;
    }
    
    public void setPosition(int x){
	position = (x % 39);
    }
    
    public void addProperty(int x){
	for (int i = 0; i < 40 ; i++) {
	    if (propertiesOwned[i] == 0) {
		propertiesOwned[i] = x;
		houses[i] = 1;
		count = i;
		return;
	    }
	    else{
	    }
	}
    }

    public String getProperty() {
	String answer = "";
	for (int i = 0; i < count + 1; i ++) {
	    answer += propertiesOwned[i] + ",";
	}
	return answer;
    }

    public String getProperty1(int i) {
	return propertiesOwned[i] + "";
    }
    
    public int getJailCard(){
	return getOutOfJailCards;
    }
    public void setJailCard(int x ){
	getOutOfJailCards = x;
    }
}
