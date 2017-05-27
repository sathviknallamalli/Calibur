package studentHub.PhysicsCalculators;

public class SimpleMachines {
public double mechanicalAdv(double outputF, double inputF) {
	double MA = outputF/inputF;
	return MA;
}
public double idealMA(double inputD, double outputD) {
	double IMA = inputD/outputD;
	return IMA;
}
public static double work(double force, double dist) {
	double work = force * dist;
	return work;
}
public double power(double work, double time){
	double power = work/time;
	return power;
}
public double effeciency(double outputW, double inputW) {
	double effeciency = outputW/inputW * 100;
	return effeciency;
}

}
