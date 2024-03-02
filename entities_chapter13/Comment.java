package entities_chapter13;

public class Comment {
	private String text;
	
	public Comment() {
	}
	public Comment(String inputText) {
		this.text = inputText;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String inputText) {
		this.text = inputText;
	}
}
