package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String prompt = "do you know how to write code";
		String code = JOptionPane.showInputDialog(prompt);
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you will rule the world");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		else {
			JOptionPane.showMessageDialog(null, "sign up at the league now or else I will take 15 robucks away from you");
		}
			
	}
}

