package pool;

public class Cuboid extends Rectangle {
	private double heigth;
	
	
	public Cuboid(double width, double length, double heigth) {
		super(width, length);
		setHeigth(heigth);
		
		
	}
		
	public double getHeight() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		if (heigth < 0) {
			heigth = 0;
		} 
			this.heigth = heigth;
		
	}
	public double getVolume() {
		return getArea() * heigth;
	}
}
