import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int rooob = 90000;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "How many of each species did Moses take on the ark with him?" + 
		"\n");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equals("None, Moses wasn't on the ark Noah was.\n" + 
		"")){
    System.out.println("correct");
		// 5. Otherwise, say "wrong" and tell them the answer
	if(input.equals("")){
        System.out.println("correct");
		// 6. Add some more riddles
        String by = JOptionPane.showInputDialog(null, "What gets broken without being held?\n"); 
       
		// 2. Make a pop up to show the score.
		
	}
}

