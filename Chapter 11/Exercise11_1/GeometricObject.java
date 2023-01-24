// author: Evie Welch
// date 23/01/23

import java.util.Date;

class GeometricObject {
	private Date dateCreated = new Date();
	private String color = "white";
	private boolean filled = true;
	GeometricObject(){
		super();
	}
	GeometricObject(String color){
		this.color = color;
	}
	GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public void setFileld(boolean filled){
		this.filled = filled;
	}
	public boolean getFilled(){
		return this.filled;
	}
	public Date getDateCreated(){
		return this.dateCreated;
	}
}
