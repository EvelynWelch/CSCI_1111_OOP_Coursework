// Author: Evie Welch
// date: 25/01/23

import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled = true;
	private Date dateCreated = new Date();
	
	protected GeometricObject() {}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		String s = String.format("created on: %s, %n color: %s,%n filled: %b,%n", getDateCreated(), getColor(), isFilled());
		return s;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
