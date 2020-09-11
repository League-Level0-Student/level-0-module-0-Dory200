package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String beans = JOptionPane.showInputDialog("how are beans grown");
				// 3.  Use an if statement to check if their answer is correct
					if (beans.equals("beans") ) {
						
					
						JOptionPane.showMessageDialog(null, "you got it right" );
				// 4.  if the user's answer was correct, add one to their score 
					 score += 1;
					
					}
					
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
					String pc = JOptionPane.showInputDialog("what are the best lights");
						if (pc.equals("rgb")) {
							
						
							
							JOptionPane.showMessageDialog(null, "you're doing really well");
						score += 1;
						}
					String brand = JOptionPane.showInputDialog("what is the best fast food restaurant");
						if (brand.equals("wendy's ")) {
							
							 JOptionPane.showMessageDialog(null, "i mean you're kinda right");
						}
						
						
		// After all the questions have been asked, tell the user their final score 
						JOptionPane.showMessageDialog(null, score);
	}
}
