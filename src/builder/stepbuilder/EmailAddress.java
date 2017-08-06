package builder.stepbuilder;

public class EmailAddress {
	private String emailAddress;
	
	private EmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public static EmailAddress of(String emailAddress) {
		return new EmailAddress(emailAddress);
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	@Override
	public String toString() {
		return emailAddress;
	}
	
}
