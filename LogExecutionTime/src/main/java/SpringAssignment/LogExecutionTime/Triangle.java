package SpringAssignment.LogExecutionTime;


public class Triangle {
	
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle() {
		super();
	}
	
	public int perimeter() {
		return side1+side2+side3;
	}
	
}
