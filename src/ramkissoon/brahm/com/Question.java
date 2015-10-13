package ramkissoon.brahm.com;

public class Question {
	private String _question;
	private String _choices;
	private int _answer;
	
	// Constructor
	Question(String question, String answers, int correctAnswer){
		this._question = question;
		this._choices = answers;
		this._answer = correctAnswer;
	}

	// Getters
	public String getQuestion(){
		return this._question;
	}
	
	public String getAnswers(){
		return this._choices;
	}

	public int getCorrectAnswer(){
		return this._answer;
	}

}
