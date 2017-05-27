package studentHub.PhysicsCalculators;

public class Temperature {
public double CTOF(double celsius) {
	double farenheit = (9/5 * celsius) + 32;
	return farenheit;
}
public double FTOC(double farenheit) {
	double celsius = (farenheit - 32) * (5/9);
	return celsius;
}
public double sHeat(double specificHeat, double mass, double tempChange){
	double sHeat = specificHeat * mass * tempChange;
	return sHeat;
}
public double pressure(double force, double area) {
	double pressure = force/area;
	return pressure;
}
public double density(double mass, double volume) {
	double density = mass/volume;
	return density;
}
}
