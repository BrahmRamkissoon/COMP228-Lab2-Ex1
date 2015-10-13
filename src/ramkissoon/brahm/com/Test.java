package ramkissoon.brahm.com;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

// Test Class simulates questions, checks answers, acts as a GUI
public class Test { 
	// Private instance variables
	private ArrayList<Question> _questions;
	private int _score;
	
	
	// Constructor
	public Test() {
		this._questions = new ArrayList<Question>();
		this._score = 0;
		
		// Initialize Questions		
		String[] question = {	"In Java, the % refers to:",														// Question 1
								"A variable is given a value through:",												// Question 2
								"Which of these is not true for the main() method:",								// Question 3
								"Which action is not performed in this statement: Employee e = new Employee()",		// Question 4
								"Overloaded methods cannot have the same:"};										// Question 5
		
		// Initialize Choices
		String[] choices = {	"\n 1. Percentages" + 																// Choices for Question 1
								"\n 2. Modulus operator" + 															
								"\n 3. Division" + 																	
								"\n 4. String format", 	
						
								"\n 1. Import statement" +															// Choices for Question 2
								"\n 2. Class declaration" + 
								"\n 3. Assignment statement" + 
								"\n 4. Equality operator",
								
								"\n 1. It accepts an array of elements of type String" +							// Choices for Question 3
								"\n 2. Is the starting point of execution in java applications" + 
								"\n 3. Contains 4 modifiers in its method signature" + 
								"\n 4. Doesn't return a value",
								
								"\n 1. Declaration" +																// Choices for Question 4
								"\n 2. Instantiation" + 
								"\n 3. Initialization" +
								"\n 4. Execution",
								
								"\n 1. Name" +																		// Choices for Question 5
								"\n 2. Implementation" + 
								"\n 3. Argument types" + 
								"\n 4. Signature with different return type"								
							};
		
		// Initialize Answers
		int[] answerList = {2, 3, 3, 4, 4};
		
		// Setup Questions
		for (int i = 0; i < question.length; i++) {
			this._questions.add(new Question(question[i], choices[i], answerList[i]));						
		}		
	}
	
	// Getters
	public int getScore() {
		return this._score;
	}
	
		
	// Method to Simulate Questions
	public Question simulateQuestion(int printOut){
		return this._questions.remove(0);
	}

	// Method to Simulate a random message to the user
	public String simulateMessage(boolean correctAnswer){
		Random rand = new Random();
		int randInt = rand.nextInt(4);
		
		// random responses for correct answers
		if (correctAnswer) {
			switch (randInt){
			case 0:
				return "Excellent!";
			case 1:
				return "Good!";
			case 2:
				return "Keep up the good work!";
			case 3: 
				return "Nice work!";
			default:
				return "Error";
			} 
		}else {
			switch (randInt){
			case 0:
				return "No. Please try again";
			case 1:
				return "Wrong. Try once more";
			case 2:
				return "Don't give up!";
			case 3: 
				return "No. Keep trying..";
			default:
				return "Error";
			}		
		}
	}
	
	// Method to Check answers
	public boolean checkAnswer(Question q, int ans) {
		int input = ans;

	 if (input == q.getAnswer()) {
		 this._score++;
		 
		 return true;
	 } else {
		 
		 return false;
	 }
}


	// Method to interact with the user
	public void inputAnswer(){
		Question q;
		int userAnswer;
		String input;
		boolean isCorrect = false;
				
		
		for (int i = 0; i < 5; i++) {
			q = simulateQuestion(i);	
			input = JOptionPane.showInputDialog(q.toString());
			userAnswer = Integer.parseInt(input);
			
			// Check answer and respond with appropriate message
			isCorrect = checkAnswer(q, userAnswer);
			if (isCorrect) {
				JOptionPane.showMessageDialog(null, simulateMessage(isCorrect));
			}
			else {
				JOptionPane.showMessageDialog(null, simulateMessage(isCorrect) +  
													"\nThe correct answer was #" + q.getAnswer());				
			}						
		}
		// Display Score
		JOptionPane.showMessageDialog(null, "You scored " +  getScore() + "/5, "
											+ getScore()*100/5 + "%");			
	}
}


