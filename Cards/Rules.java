public class Rules {
    private int turn;
    private int playerGoing;
    private int players;
    private boolean rolledDice;
    private int aunctionTurn, originalAunctionTurn;
    public Rules(){
	turn = 0;
	playerGoing = 1;
	players = 4;
	rolledDice = false;
    }

    public void setOriginalAunctionTurn(int x) {
	originalAunctionTurn = x;
    }
    
    public void setAunctionTurn() {
	originalAunctionTurn += 1;
	originalAunctionTurn = (originalAunctionTurn % players);
    }

    public int getAunctionTurn() {
	return originalAunctionTurn;
    }


    public void setTurn(){
	turn += 1;
	
    }
    
    public int getTurn(){
	return (turn % players);
    }
    
    public int getPlayers(){
	return players;
    }

    public void setPlayers(int x) {
	players = x;
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
