public class Player{
    private int money;
    private int position;
    public Player(){
	money = 1500;
	position = 0;
    }
    public addMoney(int x){
	money += x;
    }
    public loseMoney(int x){
	money -= x;
    }
    public goForward(int x){
	position += x;
    }
}
