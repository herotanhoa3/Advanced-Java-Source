package BigExercise1;


/**
 * @author Huynh Tan Hoa 
 * @Version 1.0 
 * @Date: 6/9/2016
 */
public class MarkExam {

	private double markMultiChoice;
	private double markPractice;

	public MarkExam(){

	}

	public MarkExam(double markMultiChoice, double markPractice) {
		super();
		this.markMultiChoice = markMultiChoice;
		this.markPractice = markPractice;
	}

	public double getMarkMultiChoice() {
		return markMultiChoice;
	}

	public void setMarkMultiChoice(double markMultiChoice) {
		this.markMultiChoice = markMultiChoice;
	}

	public double getMarkPractice() {
		return markPractice;
	}

	public void setMarkPractice(double markPractice) {
		this.markPractice = markPractice;
	}
	
}