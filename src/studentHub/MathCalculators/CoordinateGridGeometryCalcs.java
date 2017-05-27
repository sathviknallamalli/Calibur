package studentHub.MathCalculators;

public class CoordinateGridGeometryCalcs {
	public double midpointX(String x1, String x2) {
		double onex = Double.parseDouble(x1);
		double twox = Double.parseDouble(x2);
		double midX = (onex + twox) / 2;
		return midX;
	}

	public double midpointY(String y1, String y2) {
		double midY = ((Double.parseDouble(y1)) + (Double.parseDouble(y2))) / 2;
		return midY;
	}

	public double distance(double x1, double y1, double x2, double y2) {
		double xChange = x2 - x1;
		double yChange = y2 - y1;
		double xSquare = Math.pow(xChange, 2);
		double ySquare = Math.pow(yChange, 2);
		double distance = Math.sqrt(xSquare + ySquare);
		return distance;
	}

	public double slopeCalc(double x1, double y1, double x2, double y2) {
		double changeY = y1 - y2;
		double changeX = x1 - x2;
		double slope = changeY / changeX;
		return slope;
	}

	public String slopeFromTwoPoints(double x1, double y1, double x2, double y2) {
		double slope = slopeCalc(x1, y1, x2, y2);
		double b = (y1) - (slope * x1);
		String equation = "";
		if (b < 0) {
			equation = "y = " + slope + "x " + b;
		}
		if (b > 0) {
			equation = "y = " + slope + "x" + " + " + b;
		}
		return equation;
	}

	public String slopeAndOnePoint(double x1, double y1, double s) {
		double b = (y1) - (s * x1);

		String equation = "";
		if (b < 0) {
			equation = "y = " + s + "x " + b;
		} else {
			equation = "y = " + s + "x" + " + " + b;
		}
		return equation;
	}

	public String slopeToStandard(double coeffecient, double m, double b) {
		String equation = "";
		if (m < 0) {
			equation = m + "x" + " + " + "(" + coeffecient + ")" + "y = " + b;
		} else if (m > 0) {
			equation = m + "x" + " + " + coeffecient + "y = " + b;
		}
		return equation;
	}

}
