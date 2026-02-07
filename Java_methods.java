package operations;

public class Main {

	public static void main(String[]args) {
		    
		   int value = calculateHighScorePosition(1500);
		   displayHighScorePosition("Rainan",value);
		   
		   int value1 = calculateHighScorePosition(1000);
		   displayHighScorePosition("Rainan",value1);
		   
		   int value2 = calculateHighScorePosition(500);
		   displayHighScorePosition("Rainan",value2);
		   
		   int value3 = calculateHighScorePosition(100);
		   displayHighScorePosition("Rainan",value3);
		   
		   int value4 = calculateHighScorePosition(25);
		   displayHighScorePosition("Rainan",value4);
	
	}
		   		
	public static void displayHighScorePosition(String player_name, int player_position) {
		System.out.println(player_name+" managed to get into the "+player_position+"° position on the high score list");
	
	
	}    
	public static int calculateHighScorePosition(int score_position) {
		if ((score_position) >= 100 && (score_position) < 500){
			int player_position = 3;
			return player_position;
		}
		else if ((score_position) >= 500 && (score_position) < 1000){
			int player_position = 2;
			return player_position;
		}
		else if ((score_position) >= 1000) {
			int player_positon = 1;
			return player_positon;
		}
		else {
			int player_position = 4;
			return player_position;
		}
		
	}	
	
}
