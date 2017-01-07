import java.util.*;
public class Player{
    private int money,position,numberRolled,getOutOfJailCards;
    private ArrayList<int> propertiesOwned;

    public Player(){
	money = 1500;
	position = 0;
	numberRolled = 0;
	propertiesOwned = new ArrayList<int>();
	getOutOfJailCards = 0;
    }
    
    public void addMoney(int x){
	money += x;
    }
    
    public void loseMoney(int x){
	money -= x;
    }
    
    public void goToPosition(int x){
	position x;
    }
    
    public void setNumberRolled(int x){
	numberRolled = x;
    }
    
    public void addProperty(int x){
	propertiesOwned.add(Deed.get(x).getProperty());
    }
    
    public void addGetOutOfJailCard(){
	getOutOfJailCards += 1;
    }
}
