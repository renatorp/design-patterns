package proxy;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Person {

	private String name;
	private String idNumber;
	private String imagePath;
	
	public Person() {
	}
	
	public Person(String name, String idNumber, String imageLocation) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.imagePath = imageLocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public BufferedImage getImage() throws IOException {
		BufferedImage image = ImageIO.read(new File(imagePath));
		System.out.println("Image loaded from file system!!");
		return image;
	}
}
