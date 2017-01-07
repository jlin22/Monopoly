import java.util.*;
public class Player{
    private int money,position,numberRolled,getOutOfJailCards,player;
    private ArrayList<int> propertiesOwned;

    public Player(int a){
	player = a;
	money = 1500;
	position = 0;
	numberRolled = 0;
	propertiesOwned = new ArrayList<int>();
	getOutOfJailCards = 0;
    }

    public int getMoney(int x) {
	return money;
    }
    
    public int addMoney(int x){
	money += x;

    }
    
    public int loseMoney(int x){
	money -= x;
    }

    public int getPosition() {
	return position;
    }
    
    public void setPosition(int x){
	position = x;
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
