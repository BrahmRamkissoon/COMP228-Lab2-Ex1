package ramkissoon.brahm.com;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	// Private instance variables
	private ArrayList<Question> _questions;
	private int _attempts;
	
	// Constructor
	public Test(ArrayList<Question> _questions, int _attempts) {
		this._questions = _questions;
		this._attempts = _attempts;
		simulateQuestions();
	}

	// Simulate Questions
	public void simulateQuestions(){
		// Questions 
		String question[] = {	"In Java, the % refers to:",														// Question 1
								"A variable is given a value through:",												// Question 2
								"Which of these is not true for the main() method:",								// Question 3
								"Which action is not performed in this statement: Employee e = new Employee()",		// Question 4
								"Overloaded methods cannot have the same:"};										// Question 5
		// Choices
		String choices[] = {	"\n 1. percentages" + 																// Choices for Question 1
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
		int answerList[] = {1, 2, 2, 4, 4};
		
		// Instantiate Questions
		for (int i = 0; i < question.length; i++) {
			this._questions.add(new Question(question[i], choices[i], answerList[i]));			
		}
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


	// method to interact with the user
	public void inputAnswer(){
			
	}
}


