package model;

public abstract class Property {
	private double area;
	
	public Property(double area) {
		this.setArea(area);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
