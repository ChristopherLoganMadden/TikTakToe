package TikTakToe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Game extends JComponent{
	
	private static JButton[][]  btn;
	private GridLayout 		 	layout;
	private int				 	boxes;
	private int 			 	clicked;
	private int 		        player;
	private boolean 			gameOver;
	public JLabel overLabel;
	
	public Game(){
		player = 1;
		boxes = 3;
		clicked = 9;
		gameOver = false;
		layout = new GridLayout(3,3);
		btn = new JButton[boxes][boxes];
		
		setLayout(layout);
		

		for(int i = 0; i < boxes; i++) {
			for(int j = 0; j < boxes; j++) {
				btn[i][j] = new JButton("  ");
				add(btn[i][j]);
				btn[i][j].addMouseListener(new clicked(btn[i][j]));
			}
			
		}
		
	}
	
	private class clicked extends MouseAdapter {
		
		JButton 		btn;
		Font 			font;		
		
		public clicked(JButton btn) {
			font = new Font("monospaced", Font.BOLD, 30 );
			this.btn = btn;
			btn.setFont(font);
		}
		
		
		public void mouseClicked(MouseEvent e) {
			if(e.getButton() == e.BUTTON1) {
				if(btn.isEnabled() == false) {
					return;
				}
				if(player == 1) {
					btn.setText("X");
					player = 2;
					btn.setEnabled(false);
					clicked --;
					System.out.println(clicked);
					if(checkXWin()) {
						disable();
					}
					return;
				}
				if(player == 2) {
					btn.setText("O");
					player = 1;
					btn.setEnabled(false);
					clicked --;
					if(checkOWin()) {
						disable();
					}
					return;
				}
			
			}
		}
	}
	
	public static boolean checkXWin() {
		
		if((btn[0][0].getText() == "X")
				&&(btn[1][0].getText() == "X") 
				&& (btn[2][0].getText() == "X")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[1][0].setBackground(Color.GREEN);
			btn[2][0].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][0].getText() == "X")
				&&(btn[1][1].getText() == "X") 
				&& (btn[2][2].getText() == "X")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][0].getText() == "X")
				&&(btn[0][1].getText() == "X") 
				&& (btn[0][2].getText() == "X")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[0][1].setBackground(Color.GREEN);
			btn[0][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[1][0].getText() == "X")
				&&(btn[1][1].getText() == "X") 
				&& (btn[1][2].getText() == "X")) {
			btn[1][0].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[1][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[2][0].getText() == "X")
				&&(btn[2][1].getText() == "X") 
				&& (btn[2][2].getText() == "X")) {
			btn[2][0].setBackground(Color.GREEN);
			btn[2][1].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][1].getText() == "X")
				&&(btn[1][1].getText() == "X") 
				&& (btn[2][1].getText() == "X")) {
			btn[0][1].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][1].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][2].getText() == "X")
				&&(btn[1][2].getText() == "X") 
				&& (btn[2][2].getText() == "X")) {
			btn[0][2].setBackground(Color.GREEN);
			btn[1][2].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][2].getText() == "X")
				&&(btn[1][1].getText() == "X") 
				&& (btn[2][0].getText() == "X")) {
			btn[0][2].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][3].setBackground(Color.GREEN);
			return true;
		}
		return false;
	}
	public static boolean checkOWin() {
		
		if((btn[0][0].getText() == "O")
				&&(btn[1][0].getText() == "O") 
				&& (btn[2][0].getText() == "O")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[1][0].setBackground(Color.GREEN);
			btn[2][0].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][0].getText() == "O")
				&&(btn[1][1].getText() == "O") 
				&& (btn[2][2].getText() == "O")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][0].getText() == "O")
				&&(btn[0][1].getText() == "O") 
				&& (btn[0][2].getText() == "O")) {
			btn[0][0].setBackground(Color.GREEN);
			btn[0][1].setBackground(Color.GREEN);
			btn[0][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[1][0].getText() == "O")
				&&(btn[1][1].getText() == "O") 
				&& (btn[1][2].getText() == "O")) {
			btn[1][0].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[1][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[2][0].getText() == "O")
				&&(btn[2][1].getText() == "O") 
				&& (btn[2][2].getText() == "O")) {
			btn[2][0].setBackground(Color.GREEN);
			btn[2][1].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][1].getText() == "O")
				&&(btn[1][1].getText() == "O") 
				&& (btn[2][1].getText() == "O")) {
			btn[0][1].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][1].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][2].getText() == "O")
				&&(btn[1][2].getText() == "O") 
				&& (btn[2][2].getText() == "O")) {
			btn[0][2].setBackground(Color.GREEN);
			btn[1][2].setBackground(Color.GREEN);
			btn[2][2].setBackground(Color.GREEN);
			return true;
		}else if((btn[0][2].getText() == "O")
				&&(btn[1][1].getText() == "O") 
				&& (btn[2][0].getText() == "O")) {
			btn[0][2].setBackground(Color.GREEN);
			btn[1][1].setBackground(Color.GREEN);
			btn[2][3].setBackground(Color.GREEN);
			return true;
		}
		return false;
	}
	public void disable() {
		for(int i = 0; i < boxes; i++) {
			for(int j = 0; j < boxes; j++) {
				btn[i][j].setEnabled(false);
			}
			
		}
	}
}
