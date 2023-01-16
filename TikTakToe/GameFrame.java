package TikTakToe;

import javax.swing.*;

public class GameFrame extends JFrame {
	
	public GameFrame() {
		
		// add the game field
		Game game = new Game();
		
		add(game);
		
		pack();
	}
}
