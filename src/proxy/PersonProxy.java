package proxy;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PersonProxy extends Person {

	private BufferedImage image;
	private int securityAccess;
	private Person person;

	private PersonProxy() {}
	
	public PersonProxy(Person person, int securityAccess) {
		this.person = person; 
		this.securityAccess = securityAccess;
	}
	
	public String getIdNumber() {
		if (securityAccess == 1) {
			return person.getIdNumber();
		}
		return person.getIdNumber().replaceAll("[0-9]", "x") + " - You do not have permission!";
	}

	public BufferedImage getImage() throws IOException {
		if (image == null) {
			image = person.getImage();
		}
		return image;
	}
	
	@Override
	public String getImagePath() {
		return person.getImagePath();
	}
	
	@Override
	public String getName() {
		return person.getName();
	}
	
}
