package BigExercise1;


/**
 * @author Huynh Tan Hoa
 * Version 1.0
 * Date 6/9/2016
 */
public class MarkSession {

	private double markAttendence;
	private double markActive;
	private double markExercise;

	public MarkSession(){

	}

	public MarkSession(double markAttendence, double markActive, double markExercise) {
		super();
		this.markAttendence = markAttendence;
		this.markActive = markActive;
		this.markExercise = markExercise;
	}

	public double getMarkAttendence() {
		return markAttendence;
	}

	public void setMarkAttendence(double markAttendence) {
		this.markAttendence = markAttendence;
	}

	public double getMarkActive() {
		return markActive;
	}

	public void setMarkActive(double markActive) {
		this.markActive = markActive;
	}

	public double getMarkExercise() {
		return markExercise;
	}

	public void setMarkExercise(double markExercise) {
		this.markExercise = markExercise;
	}

	/**
	 * Update mark of attendance
	 * @param status
	 * Return result as a double type
	 */
	/*
	 * Calculate session grade 
	 * Return result as a double type
	 */
	public double calSessionGrade(){
		return getMarkAttendence() * 0.3 + getMarkActive() * 0.1 + getMarkExercise() * 0.6;
	}

}