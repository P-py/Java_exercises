package chapter10;

public class ForEach{
	public static void main(String[] args) {
		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//Both structures below have the same effect/work in the same way
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}