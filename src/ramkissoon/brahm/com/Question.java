package ramkissoon.brahm.com;

public class Question {
	private String _question;
	private String[] _answers;
	private int _correctAnswer;
	
	// Constructor
	Question(String question, String[] answers, int correctAnswer){
		this._question = question;
		this._answers = answers;
		this._correctAnswer = correctAnswer;
	}

	// Getters
	public String getQuestion(){
		return this._question;
	}
	
	public String[] getAnswers(){
		return this._answers;
	}

	public int getCorrectAnswer(){
		return this._correctAnswer;
	}

}
