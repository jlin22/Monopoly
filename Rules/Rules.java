public class Rules {
    private int turn;
    private int playerGoing;
    private int players;
    private boolean rolledDice;
    
    public Rules(){
	turn = 0;
	playerGoing = 1;
	players = 4;
	rolledDice = false;
    }
    public int getTurn(){
	return turn;
    }
    
    public int getPlayerGoing(){
	return (turn % 4) + 1;
    }
    
    public int getPlayers(){
	return players;
    }
    
    public boolean getRolledDice(){
	return rolledDice;
    }
    
    public void rollDice(){
	if (!rolledDice){
	    int randomNum,randomNum1 = 0;
	    randomNum = 1 + (int)(Math.random() * 6);
	    randomNum1 = 1 + (int)(Math.random() * 6);
	} 
    }
    public static void main(String[]a){
    }
	
}
