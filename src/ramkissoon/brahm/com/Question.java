package ramkissoon.brahm.com;

// Question class is defined by question, choices and answer
public class Question {
	private String _question;
	private String _choices;
	private int _answer;
	
	// Constructor
	Question(String question, String choices, int answer){
		this._question = question;
		this._choices = choices;
		this._answer = answer;
	}

	// Getters
	public String getQuestion(){
		return this._question;
	}
	
	public String getChoices(){
		return this._choices;
	}

	public int getAnswer(){
		return this._answer;
	}

	@Override
	public String toString() {
		return _question + _choices;
	}
	
	

}
