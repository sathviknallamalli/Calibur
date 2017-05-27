package studentHub.MathCalculators;

public class CalcsTest {

	public static void main(String[] args) {
		CoordinateGridGeometryCalcs cm = new CoordinateGridGeometryCalcs();
		String thing = cm.slopeFromTwoPoints(2, 3, 5, 6);
		System.out.println(thing);
	
	System.out.println(cm.slopeAndOnePoint(2, 3, 5));

	}

}
