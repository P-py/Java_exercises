package entities_chapter08;

public class Student{
	public double grade1;
	public double grade2;
	public double grade3;
	public String name;
	public String result;
	
	public double finalGrade(){
		return (grade1+grade2+grade3);
	}
	public String approve() {
		if (this.finalGrade()<60.00) {
			result = "\nFAILED"+"\nMISSING "+(90-this.finalGrade())+" POINTS";
		}
		else if (this.finalGrade()>=60.00) {
			result = "\nPASS";
		}
		return result;
	}
}