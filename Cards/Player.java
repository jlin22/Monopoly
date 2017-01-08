import java.util.*;
public class Player{
    private int money,position,getOutOfJailCards;
    private int[] propertiesOwned;

    public Player() {
	money = 1500;
	position = 0;
	propertiesOwned = new int[40];
	getOutOfJailCards = 0;
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
	for (int i = 0; i < 40; i++) {
	    if (propertiesOwned[i] == 0) {
		propertiesOwned[i] = x;
	    }
	    else{
	    }
	}
    }
   
    public void addGetOutOfJailCard(){
	getOutOfJailCards += 1;
    }
}
