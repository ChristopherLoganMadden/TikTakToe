package TikTakToe;

import java.awt.*;

public class TikTakToe {
	public static void main(String [] arg) {
		
		// create new frame
		EventQueue.invokeLater(() -> {
			
			GameFrame frame = new GameFrame();
			
			frame.setTitle("TikTakToe");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setSize(250, 250);
			frame.setVisible(true);
		});
	}

}
