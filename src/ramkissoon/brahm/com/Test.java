package ramkissoon.brahm.com;

import java.util.Random;

public class Test {

		// simulate Questions
	public void simulateQuestions(){
		// questions 
		String question1 = "In Java, the % refers to:" +
				 			"/n a) percentages" +
							"/n b) modulus operator" +
							"/n c) division" +
							"/n d) string format";
	
		String question2 = "A variable is given a value through:" +
							"/n a) import statement" +
							"/n b) class declaration" +
							"/n c) assignemnt statement" +
							"/n d) equality operator";
		
		String question3 = "Which of these is not true for the main() method:" +
				 			"/n a) it accepts an array of elements of type String" +
							"/n b) is the starting point of execution in java applications" +
							"/n c) contains 4 modifiers in its method signature" +
							"/n d) doesn't return a value";
		
		String question4 = "Which action is not performed by [ Employee e = new Employee() ]:" +
				 			"/n a) declaration" +
							"/n b) Instantiation" +
							"/n c) Initialization" +
							"/n d) Execution";
		
		String question5 = "Overloaded methods cannot have the same:" +
				 			"/n a) name" +
							"/n b) implementation" +
							"/n c) argument types" +
							"/n d) signature with different return type";
		
		String questionList[] ={question1, question2, question3, question4, question5};
		String answerList[] = {"b", "c", "c", "d", "d"};	
			
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


