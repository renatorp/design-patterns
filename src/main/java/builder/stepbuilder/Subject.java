package builder.stepbuilder;

public class Subject {

	private String subject;
	
	private Subject(String subject) {
		this.subject = subject;
	}
	
	public static Subject of(String subject) {
		return new Subject(subject);
	}

	public String getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return subject;
	}
	
}
