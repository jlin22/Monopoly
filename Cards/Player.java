import java.util.*;
public class Player{
    private int money,position,numberRolled,getOutOfJailCards;
    private ArrayList<Integer> propertiesOwned;

    public Player() {
	money = 1500;
	position = 0;
	numberRolled = 0;
	propertiesOwned = new ArrayList<Integer>();
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
    
    public void setNumberRolled(int x){
	numberRolled = x;
    }
    
    /* public void addProperty(int x){
	propertiesOwned = x;
    }
    */
    public void addGetOutOfJailCard(){
	getOutOfJailCards += 1;
    }
}
