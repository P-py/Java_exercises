package entities_chapter13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> commentsList = new ArrayList<>();
	
	private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Post() {	
	}
	public Post(LocalDateTime inputMoment, String inputTitle, String inputContent, int inputLikes) {
		this.moment = inputMoment;
		this.title = inputTitle;
		this.content = inputContent;
		this.likes = inputLikes;
	}
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comment> getCommentsList() {
		return commentsList;
	}
	public void addComments(Comment inputComment) {
		commentsList.add(inputComment);
	}
	public void removeComments(Comment inputComment) {
		commentsList.remove(inputComment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(moment.format(formatter1)+"\n");
		sb.append("Comments:\n");
		for (Comment comment : commentsList) {
			sb.append(comment.getText()+"\n");
		}
		return sb.toString();
	}
}