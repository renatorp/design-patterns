package templateMethod;

import java.util.Random;

public class Dados extends Game {
	 
	private Integer totalp1;
	private Integer totalp2;
	
    /* Implementation of necessary concrete methods */
    protected void initializeGame() {
        totalp1 = 0;
        totalp2 = 0;
    }

    protected void makePlay(int player) {
        if (player == 1) {
        	totalp1 += jogarDado();
        } else {
        	totalp2 += jogarDado();
        }
    }
    
    private Integer jogarDado() {
		Random r = new Random();
		return r.nextInt(5) + 1;
	}
	
    protected boolean endOfGame() {
        return isWinner(totalp1) || isWinner(totalp2);
    }
	
    private boolean isWinner(int totalp) {
		return totalp >= 100;
	}
    
    protected void printWinner() {
        if (isWinner(totalp1)) {
        	System.out.println("Player 1 wins");
        } else if(isWinner(totalp2)){
        	System.out.println("Player 2 wins");
        } else {
        	System.out.println("No winner. Sth went wrong.. :(");
        }
    }
}