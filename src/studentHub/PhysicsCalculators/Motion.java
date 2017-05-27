package studentHub.PhysicsCalculators;

public class Motion {
public String momentum(double velocity, double mass) {
	double momentum = velocity * mass;
	String label = "kg*m/s/s";
	String mFinal = momentum + label;
	return mFinal;
}
public String newton2LawMass(double force, double acceleration) {
	double mass = force/acceleration;
	String label = "kg";
	String answer = mass + label;
	return answer;
}
public String newton2LawAcceleration(double mass, double force) {
	double acceleration = force/mass;
	String label = "m/s/s";
	String answer = acceleration + label;
	return answer;
}
public String newton2LawForce(double mass, double acceleration) {
	double force = mass * acceleration;
	String label = "kg * m/s/s";
	String answer = force + label;
	return answer;
}
public String work(double force, double distance) {
	double work = force * distance;
	String label = "N * m (Joules)";
	String answer = work + label;
	return answer;
}
public String power(double work, double time) {
	double power = work/time;
	String label = "Watts";
	String answer = power + label;
	return answer;
}
public String KE(double mass, double velocity) {
	double kE = .5 * mass * (Math.pow(velocity, 2));
	String label = "joules (J)";
	String answer = kE + label;
	return answer;
}
public String PE(double mass, double height){
	double pE = mass * 9.8 * height;
	String label = "joules (J)";
	String answer = pE + label;
	return answer;
}
public String effeciency(double wOut, double wIn){
	double ef = wOut/wIn;
	double efP = ef*100;
	String label = "%";
	String answer = efP + label;
	return answer;
}
public String MA(double pe, double ke){
	double ma  = pe + ke;
	String label = "Joules (J)";
	String answer = ma + label;
	return answer;
}


}
