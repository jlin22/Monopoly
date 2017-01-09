import java.util.*;
public class Player{
    private int money,position,getOutOfJailCards,count,doubleRolls,turn, jailCounter;
    private int[] propertiesOwned;
    private boolean rolls,brownMonopoly,cyanMonopoly,magentaMonopoly,orangeMonopoly,redMonopoly,yellowMonopoly,greenMonopoly,blueMonopoly,railroadMonopoly,utilityMonopoly,hasMonopoly;
    private boolean[]monopoly;
    public Player() {
	money = 1500;
	position = 0;
	propertiesOwned = new int[40];
	getOutOfJailCards = 0;
	rolls = true;
	doubleRolls = 0;
	turn = 1;
	brownMonopoly = false;
	cyanMonopoly = false;
	magentaMonopoly = false;
	orangeMonopoly = false;
	redMonopoly = false;
	yellowMonopoly = false;
	greenMonopoly = false;
	blueMonopoly = false;
	railroadMonopoly = false;
	utilityMonopoly = false;
	hasMonopoly = false;
	monopoly = new boolean[10];
	jailCounter = 0;
    }

    public int getJailCounter() {
	return jailCounter;
    }

    public void setJailCounter(int x ) {
	jailCounter = x; 
    }

    public boolean[] getMonopoly() {
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

    public void setMonopoly(int x) {
	monopoly[x] = true;
    }

    public boolean getHasMonopoly() {
	for (int i = 0; i < 10; i++) {
	    if (monopoly[i] == true) {
		return true;
	    }
	}
	return false;
    }

    public int getHasMonopolyNum() {
	for (int i = 0; i < 10; i ++ ) {
	    if (monopoly[i] == true) {
		return i;
	    }
	}
	return 11;
    }

    public boolean getMonopoly1(int x) {
	return monopoly[x];
    }

    public void setMonopoly1(int x,boolean y) {
	monopoly[x] = y;
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
   
    public void addGetOutOfJailCard(){
	getOutOfJailCards += 1;
    }
}
