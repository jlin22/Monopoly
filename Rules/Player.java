import java.util.*;
public class Player{
    private int money;
    private int position;
    private int numberRolled;
    private ArrayList<int> propertiesOwned;
    private int getOutOfJailCards;
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
    public void goForward(int x){
	position += x;
	position = position % 40;
    }
    public void setNumberRolled(int x){
	numberRolled = x;
    }
    public void addProperty(int x){
	propertiesOwned.add(x);
    }
    public void addGetOutOfJailCard(){
	getOutOfJailCards += 1;
    }
}
