package ramkissoon.brahm.com;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Test {
	// Private instance variables
	private ArrayList<Question> _questions;
	private int _score;
	
	
	
	// Constructor
	public Test() {
		this._questions = new ArrayList<Question>();
		this._score = 0;
				
		String[] question = {	"In Java, the % refers to:",														// Question 1
								"A variable is given a value through:",												// Question 2
								"Which of these is not true for the main() method:",								// Question 3
								"Which action is not performed in this statement: Employee e = new Employee()",		// Question 4
								"Overloaded methods cannot have the same:"};										// Question 5
		
		// Choices
		String[] choices = {	"\n 1. percentages" + 																// Choices for Question 1
								"\n 2. modulus operator" + 															
								"\n 3. division" + 																	
								"\n 4. string format", 	
						
								"\n 1.import statement" +															// Choices for Question 2
								"\n 2.class declaration" + 
								"\n 3.assignment statement" + 
								"\n 4.equality operator",
								
								"\n 1.it accepts an array of elements of type String" +								// Choices for Question 3
								"\n 2.is the starting point of execution in java applications" + 
								"\n 3.contains 4 modifiers in its method signature" + 
								"\n 4.doesn't return a value",
								
								"\n 1.declaration" +																// Choices for Question 4
								"\n 2.Instantiation" + 
								"\n 3.Initialization" +
								"\n 4.Execution",
								
								"\n 1.name" +																		// Choices for Question 5
								"\n 2.implementation" + 
								"\n 3.argument types" + 
								"\n 4.signature with different return type"								
							};
		
		// Answers
		int[] answerList = {2, 3, 3, 4, 4};
		
		// Setup Questions
		for (int i = 0; i < question.length; i++) {
			this._questions.add(new Question(question[i], choices[i], answerList[i]));		
					
		}		
	}
	
	// Getter for score
		public int getScore() {
			return this._score;
		}
	

	
	// Simulate Questions
	public Question simulateQuestion(int printOut){
		return this._questions.remove(0);
	}

	// simulate a random message to the user
	public String simulateMessage(boolean correctAnswer){
		Random rand = new Random();
		int randInt = rand.nextInt(4);
		
		// random responses for correct answers
		if (correctAnswer) {
			switch (randInt){
			case 0:
				return " Excellent!";
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
	
	public boolean checkAnswer(Question q, int ans) {
		Question question = q;
		int input = ans;
		boolean isCorrect;

	 if (input == (q.getAnswer())) {
		 return isCorrect = true;
	 } else {
		 return isCorrect = false;
	 }
}


	// method to interact with the user
	public void inputAnswer(){
		Question q;
		int userAnswer;
		String input;
		boolean isCorrect;
		
		
		for (int i = 0; i < 5; i++) {
			q=simulateQuestion(i);	
			input = JOptionPane.showInputDialog(q.toString());
			userAnswer = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, simulateMessage(checkAnswer(q, userAnswer)));			
		}
			
	}
}


