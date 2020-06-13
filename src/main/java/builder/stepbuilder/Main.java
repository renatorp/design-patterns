package builder.stepbuilder;

/**
 * https://goo.gl/1ud5W6
 */
public class Main {

	public static void main(String[] args) {
		
		Email email1 = Email.stepBuilder()
		.from(EmailAddress.of("joao@gmail.com"))
		.to(EmailAddress.of("maria@gmail.com"), EmailAddress.of("felipe@gmail.com"))
		.subject(Subject.of("Faturas Atrasadas"))
		.content(Content.of("Favor desconsiderar email anterior"))
		.build();
		
		printEmail(email1);
		
		
		Email email2 = Email.stepBuilder()
		.from(EmailAddress.of("joao@gmail.com"))
		.to(EmailAddress.of("maria@gmail.com"))
		.subject(Subject.of("Feliz Aniversário"))
		.content(Content.of("Parabéns!! Muitos anos de vida!!! :) "))
		.cc(EmailAddress.of("felipe@gmail.com"))
		.bcc(EmailAddress.of("matheus@gmail.com"), EmailAddress.of("antonio@gmail.com"))
		.build();
		
		printEmail(email2);
	}
	
	private static void printEmail(Email email) {
		System.out.println();
		System.out.println("from: " + email.getFrom());
		
		System.out.print("to: ");
		for (EmailAddress to : email.getTo()) {
			System.out.print(to + " ");
		}
		System.out.println();
		
		if (email.getCc() != null) {
			System.out.print("cc: ");
			for (EmailAddress cc : email.getCc()) {
				System.out.print(cc + " ");
			}
			System.out.println();
		} 
		
		if (email.getBcc() != null) {
			System.out.print("bcc: ");
			for (EmailAddress bcc : email.getBcc()) {
				System.out.print(bcc + " ");
			}
			System.out.println();
		}
		
		System.out.println("subject: " + email.getSubject());
		System.out.println("content: " + email.getContent());
		
		System.out.println();
		
	}
}
