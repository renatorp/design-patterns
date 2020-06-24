package builder.stepbuilder;

public class Content {

	private String content;
	
	private Content(String content) {
		this.content = content;
	}
	
	public static Content of(String content) {
		return new Content(content);
	}

	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return content;
	}
}
