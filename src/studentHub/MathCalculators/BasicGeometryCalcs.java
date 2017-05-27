package studentHub.MathCalculators;

public class BasicGeometryCalcs {
public double hypotneuse(double a, double b) {
	double leg = Math.pow(a, 2);
	double base = Math.pow(b, 2);
	double hyp = Math.sqrt(base+leg);			
	return hyp;
}
public double triArea(double a, double b){
	// a is the height, b is the base
	double area = a*b*0.5;
	return area;
}
public double circArea(double r){
	double area = Math.pow(r, 2)*Math.PI;
	return area;
}
public double rectArea(double a, double b){
	double area = a*b;
	return area;
}
public double squareArea(double s){
	double area = Math.pow(s, 2);
	return area;
}
public double pArea(double l, double h) {
	double area = l * h;
	return area;
}
public double trapezoid(double b1, double b2, double h){
	double numerator = (b1 + b2) * h;
	double area = numerator / 2;
	return area;
}
public double prisimVol(double a, double b, double c) {
	double pVol = a*b*c;
	return pVol;
}
public double sphereVol(double r){
	double cube = Math.pow(r, 3);
	final double MULT = 4/3;
	double sVol = MULT * cube * Math.PI;
	return sVol;
}
public double cylVol(double r, double h){
	double cVol = Math.PI * (Math.pow(r, 2) * h);
	return cVol;
}
public double coneVol(double r, double h) {
	double square = Math.pow(r, 2);
	final double  MULT = 1/3;
	double coneVol = square * Math.PI * MULT;
	return coneVol;
}
public double cubeVol(double s){
	double vol = Math.pow(s, 3);
	return vol;
}
public double sqaurePyramid(double a, double h){
	double vol = (Math.pow(a, 2)) * (h/3);
	return vol;
}
public double tetrahedron(double a){
	double cube = Math.pow(a, 3);
	final double DENOMINATOR = 6 * Math.sqrt(2);
	double vol = cube/DENOMINATOR;
	return vol;
}
public double surfaceSphere(double r) {
	double SA = 4 * Math.PI * (Math.pow(r, 2));
	return SA;
}
public double surfacePrisim(double l, double w, double h) {
	double tops = 2 * l * w;
	double sides = 2 * l * h;
	double fronts = 2 * w * h;
	double SA = fronts + tops + sides;
	return SA;
}
public double surfaceCube(double s){
	double SA = Math.pow(s, 2) * 6;
	return SA;
}
public double surfaceCylinder(double r, double h) {
	double circ = 2 * Math.PI * r * h;
	double area = 2 * Math.PI * Math.pow(r, 2);
	double SA = circ + area;
	return SA;
}
public double surfaceCone(double r, double h) {
	double area = Math.PI * Math.pow(r, 2);
	final double MULT = 1/3;
	double circ = MULT * Math.PI * r * h;
	double SA = circ + area;
	return SA;
}


}
