import java.util.*;
public class Player{
    private int money;
    private int position;
    private int numberRolled;
    private ArrayList<String> propertiesOwned;
    public Player(){
	money = 1500;
	position = 0;
	numberRolled = 0;
	propertiesOwned = new ArrayList<String>();
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
}
