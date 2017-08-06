package builder.stepbuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Email {
	
	private EmailAddress from;
	private List<EmailAddress> to;
    private List<EmailAddress> cc;
    private List<EmailAddress> bcc;
    private Subject subject;
    private Content content;

    
	public Email(EmailBuilder builder) {
		this.from = builder.from;
		this.to = builder.to;
		this.cc  = builder.cc;
		this.bcc = builder.bcc;
		this.subject = builder.subject;
		this.content = builder.content;
	}
    
	public static FromStep stepBuilder() {
		return new EmailBuilder();
	}
	
    public interface FromStep {
    	ToStep from(EmailAddress from);
    }
    
    public interface ToStep {
    	SubjectStep to(EmailAddress... to);
    }
    
    public interface SubjectStep {
    	ContentStep subject(Subject subject);
    }
    
    public interface ContentStep {
    	Build content(Content content);
    }
    
    public interface Build {
    	Build cc (EmailAddress... cc);
    	Build bcc (EmailAddress... bcc);
    	Email build();
    }
    
    public static class EmailBuilder implements Build, ContentStep, SubjectStep, ToStep, FromStep {

    	private EmailAddress from;
    	private List<EmailAddress> to;
        private List<EmailAddress> cc;
        private List<EmailAddress> bcc;
        private Subject subject;
        private Content content;

        private EmailBuilder() {
		}
        
		@Override
		public ToStep from(EmailAddress from) {
			Objects.requireNonNull(from);
			this.from = from;
			return this;
		}

		@Override
		public SubjectStep to(EmailAddress... to) {
			Objects.requireNonNull(to);
			this.to = Arrays.asList(to);
			return this;
		}

		@Override
		public ContentStep subject(Subject subject) {
			Objects.requireNonNull(subject);
			this.subject = subject;
			return this;
		}

		@Override
		public Build content(Content content) {
			Objects.requireNonNull(content);
			this.content = content;
			return this;
		}

		@Override
		public Build cc(EmailAddress... cc) {
			Objects.requireNonNull(cc);
			this.cc = Arrays.asList(cc);
			return this;
		}

		@Override
		public Build bcc(EmailAddress... bcc) {
			Objects.requireNonNull(bcc);
			this.bcc = Arrays.asList(bcc);
			return this;
		}

		@Override
		public Email build() {
			return new Email(this);
		}
    	
    }
    
	public EmailAddress getFrom() {
		return from;
	}
	public void setFrom(EmailAddress from) {
		this.from = from;
	}
	
	public List<EmailAddress> getCc() {
		return cc;
	}
	public void setCc(List<EmailAddress> cc) {
		this.cc = cc;
	}
	
	public List<EmailAddress> getBcc() {
		return bcc;
	}
	public void setBcc(List<EmailAddress> bcc) {
		this.bcc = bcc;
	}
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	
	public List<EmailAddress> getTo() {
		return to;
	}
	public void setTo(List<EmailAddress> to) {
		this.to = to;
	}

}
