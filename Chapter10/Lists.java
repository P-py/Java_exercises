package chapter10;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lists{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pedro"); //Add new elements on the last position
		list.add("Paulo");
		list.add("Joao");
		list.add("Carlos");
		list.add(0, "Test"); //Add new elements with specified position
		System.out.println(list.size()); // Get list size
		for (String stringElement : list) {
			System.out.println(stringElement);
		}
		System.out.println("-----");
		list.remove("Carlos"); //Removes an element based on value of itself
		list.remove(1); //Removes elements based on its position
		list.removeIf(x -> x.charAt(0)=='P'); //Removes elements based on a lambda function
		System.out.println(list.size());
		for (String stringElement : list) {
			System.out.println(stringElement);
		}
		System.out.println("-----");
		System.out.println("Index of Joao: " + list.indexOf("Joao")); //Gets a element index based on its value
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //Returns -1 if it doesnt exist
		list.add(0, "Test");
		//Filters a list based on a lambda function
		System.out.println("-----");
		List<String> resultList = list.stream().filter(x -> x.charAt(0)=='T').collect(Collectors.toList());
		for (String stringElement : resultList) {
			System.out.println(stringElement);
		}
		//Finds first element occurrence based on a lambda function
		String name = list.stream().filter(x -> x.charAt(0)=='T').findFirst().orElse(null);
		System.out.println(name);
	} 
}