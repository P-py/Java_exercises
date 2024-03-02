package chapter13;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDateTime;
import entities_chapter13.Post;
import entities_chapter13.Comment;

public class StringBuilderDemo{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Comment comment1 = new Comment("Wish u an amazing trip!");
		Comment comment2 = new Comment("Thats awesome!");
		Post post1 = new Post(LocalDateTime.parse("29/02/2024 21:54:31", formatter1), "Going to visit Brazil!", 
				"Travelling to this amazing country next week!", 30);
		post1.addComments(comment1);
		post1.addComments(comment2);
		System.out.println(post1);
	}
}