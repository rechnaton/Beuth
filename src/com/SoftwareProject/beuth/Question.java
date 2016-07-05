package com.SoftwareProject.beuth;

public class Question {
	private String questionText;
	private String QuestionTypeTitle;
	private String questionTheme;
	private String[] answers;
	private Boolean[] isCorrect;
	
	public Question (String Theme, String Text, String sType, String[] answersArray, Boolean[] isCorrectArray){
		questionText = Text;
		questionTheme = Theme;
		QuestionTypeTitle = sType;
		answers = answersArray;
		isCorrect = isCorrectArray;
	}
	
	/**
	 * Nur so lange die Datenbank um das Attribut "Thema" erweitert ist
	 */
	public Question (String Text, String sType, String[] answersArray, Boolean[] isCorrectArray){
		questionText = Text;
		questionTheme = "Test";
		QuestionTypeTitle = sType;
		answers = answersArray;
		isCorrect = isCorrectArray;
	}
	
	public String getQuestionText(){
		return questionText;
	}
	
	public String getQuestionTypeTitle(){
		return QuestionTypeTitle;
	}
	
	public String[] getAnswers(){
		return answers;
	}
	
	public void putQuestionText(String text) {
		questionText = text;
	}
	
	public Boolean[] getIsCorrectAnswers(){
		return isCorrect;
	}
	
	public String getQuestionTheme(){
		return questionTheme;
	}
}