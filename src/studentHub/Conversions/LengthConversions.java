package studentHub.Conversions;

public class LengthConversions {
	// within English system
	public double FeetToInches(double Feet) {
		double Inches = Feet * 12;
		return Inches;
	}// DID IT

	public double InchesToFeet(double Inches) {
		double Feet = Inches / 12;
		return Feet;
	}// DID IT

	public double FeetToYards(double Feet) {
		double Yards = Feet / 3;
		return Yards;
	}// DID IT

	public double YardsToFeet(double Yards) {
		double Feet = Yards * 3;
		return Feet;
	}// DID IT

	public double YardsToInches(double Yards) {
		double Inches = Yards * 36;
		return Inches;
	}// DID IT

	public double InchesToYards(double Inches) {
		double Yards = Inches / 36;
		return Yards;
	}// DID IT

	public double MileToFeet(double Mile) {
		double Feet = Mile * 5280;
		return Feet;
	}// DID IT

	public double MileToInches(double Mile) {
		double Inches = Mile * 5280 * 12;
		return Inches;
	}// DID IT

	public double MileToYards(double Mile) {
		double Yards = Mile * 1760;
		return Yards;
	}// DID IT

	public double YardsToMile(double Yards) {
		double Mile = Yards / 1760;
		return Mile;
	}// DID IT

	public double FeetToMile(double Feet) {
		double Mile = Feet / 5280;
		return Mile;
	}// DID IT

	public double InchesToMile(double Inches) {
		double Mile = Inches / (5280 * 12);
		return Mile;
	}// DID IT

	public double FurlongToInches(double Furlong) {
		double Inches = Furlong * 660 * 12;
		return Inches;
	}// DID IT

	public double FurlongToFeet(double Furlong) {
		double Feet = Furlong * 66;
		return Feet;
	}// DID IT

	public double FurlongToYards(double Furlong) {
		double Yards = Furlong * 200;
		return Yards;
	}// DID IT

	public double InchesToFurlong(double Inches) {
		double Furlong = Inches / (660 * 12);
		return Furlong;
	}// DID IT

	public double FeetToFurlong(double Feet) {
		double Furlong = Feet / 660;
		return Furlong;
	}// DID IT

	public double YardsToFurlong(double Yards) {
		double Furlong = Yards / 220;
		return Furlong;
	}// DID IT
		// within SI system
		// Meter to anything

	public double MeterToCentimeter(double Meter) {
		double centiMeter = Meter * 100;
		return centiMeter;
	}

	public double MeterToDecimeter(double Meter) {
		double deciMeter = Meter * 10;
		return deciMeter;
	}

	public double MeterToMillimeter(double Meter) {
		double milli = Meter * 1000;
		return milli;
	}

	public double MeterToDecameter(double Meter) {
		double Decameter = Meter / 10;
		return Decameter;
	}

	public double MeterToHectameter(double Meter) {
		double Hectameter = Meter / 100;
		return Hectameter;
	}

	public double MeterToKilometer(double Meter) {
		double Kilometer = Meter / 1000;
		return Kilometer;
	}

	// DID IT
	// deciMeter to anything
	public double DecimeterToMeter(double deciMeter) {
		double Meter = deciMeter / 10;
		return Meter;
	}

	public double DecimeterToDecameter(double deciMeter) {
		double Decameter = deciMeter / 100;
		return Decameter;
	}

	public double DecimeterToHectameter(double deciMeter) {
		double Hectameter = deciMeter / 1000;
		return Hectameter;
	}

	public double DecimeterToKilometer(double deciMeter) {
		double Kilometer = deciMeter / 10000;
		return Kilometer;
	}

	public double DecimeterToCentimeter(double deciMeter) {
		double centi = deciMeter * 10;
		return centi;
	}

	public double DecimeterToMillimeter(double deciMeter) {
		double milli = deciMeter * 100;
		return milli;
	}

	// DID IT
	// centimeter to anything
	public double CentimeterToMeter(double centiMeter) {
		double Meter = centiMeter / 100;
		return Meter;
	}

	public double CentimeterToDecimeter(double centiMeter) {
		double deciMeter = centiMeter / 10;
		return deciMeter;
	}

	public double CentimeterToDecameter(double centiMeter) {
		double Decameter = centiMeter / 1000;
		return Decameter;
	}

	public double CentimeterToHectameter(double centiMeter) {
		double Hectameter = centiMeter / 10000;
		return Hectameter;
	}

	public double CentimeterToKilometer(double centiMeter) {
		double Kilometer = centiMeter / 100000;
		return Kilometer;
	}

	public double CentimeterToMillimeter(double centiMeter) {
		double milli = centiMeter * 10;
		return milli;
	}

	// DID IT
	// milliMeter to anything
	public double MillimeterToCentimeter(double milliMeter) {
		double centi = milliMeter / 10;
		return centi;
	}

	public double MillimeterToDecimeter(double milliMeter) {
		double deci = milliMeter / 100;
		return deci;
	}

	public double MillimeterToMeter(double milliMeter) {
		double Meter = milliMeter / 1000;
		return Meter;
	}

	public double MillimeterToDecameter(double milliMeter) {
		double Decameter = milliMeter / 10000;
		return Decameter;
	}

	public double MillimeterToHectameter(double milliMeter) {
		double Hectameter = milliMeter / 100000;
		return Hectameter;
	}

	public double MillimeterToKilometer(double milliMeter) {
		double Kilometer = milliMeter / 1000000;
		return Kilometer;
	}

	// DID IT
	// Decametermeter to anything
	public double DecameterToMillimeter(double DecameterMeter) {
		double milli = DecameterMeter * 10000;
		return milli;
	}

	public double DecameterToCentimeter(double DecameterMeter) {
		double centi = DecameterMeter * 1000;
		return centi;
	}

	public double DecameterToDecimeter(double DecameterMeter) {
		double deci = DecameterMeter * 100;
		return deci;
	}

	public double DecameterToMeter(double DecameterMeter) {
		double Meter = DecameterMeter * 10;
		return Meter;
	}

	public double DecameterToHectameter(double DecameterMeter) {
		double Hectameter = DecameterMeter / 10;
		return Hectameter;
	}

	public double DecameterToKilometer(double DecameterMeter) {
		double Kilometer = DecameterMeter / 100;
		return Kilometer;
	}

	// DID IT
	// hecaMeter to anything
	public double HectameterToMillimeter(double HectameterMeter) {
		double milli = HectameterMeter * 100000;
		return milli;
	}

	public double HectameterToCentimeter(double HectameterMeter) {
		double centi = HectameterMeter * 10000;
		return centi;
	}

	public double HectameterToDecimeter(double HectameterMeter) {
		double deci = HectameterMeter * 1000;
		return deci;
	}

	public double HectameterToMeter(double HectameterMeter) {
		double Meter = HectameterMeter * 100;
		return Meter;
	}

	public double HectameterToDecameter(double HectameterMeter) {
		double Decameter = HectameterMeter * 10;
		return Decameter;
	}

	public double HectameterToKilometer(double HectameterMeter) {
		double Kilometer = HectameterMeter / 10;
		return Kilometer;
	}

	// DID IT
	// KilometerMeter to anything
	public double KilometerToMillimeter(double KilometerMeter) {
		double milli = KilometerMeter / 1000000;
		return milli;
	}

	public double KilometerToCentimeter(double KilometerMeter) {
		double centi = KilometerMeter / 100000;
		return centi;
	}

	public double KilometerToDecimeter(double KilometerMeter) {
		double deci = KilometerMeter / 10000;
		return deci;
	}

	public double KilometerToMeter(double KilometerMeter) {
		double Meter = KilometerMeter / 1000;
		return Meter;
	}

	public double KilometerToDecameter(double KilometerMeter) {
		double Decameter = KilometerMeter / 100;
		return Decameter;
	}

	public double KilometerToHectameter(double KilometerMeter) {
		double Hectameter = KilometerMeter / 10;
		return Hectameter;
	}

	// DID IT
	// SI to English system
	public double KilometerToFeet(double KilometerMeter) {
		double Feet = KilometerMeter * 3280.84;
		return Feet;
	}// DID IT

	public double KilometerToInches(double KilometerMeter) {
		double Inches = 39370.1 * KilometerMeter;
		return Inches;
	}// DID IT

	public double KilometerToYards(double KilometerMeter) {
		double Yards = 1093.613888889 * KilometerMeter;
		return Yards;
	}// DID IT

	public double KilometerToFurlong(double KilometerMeter) {
		double Furlong = 4.97096 * KilometerMeter;
		return Furlong;
	}// DID IT

	public double HectameterToFeet(double HectameterMeter) {
		double Feet = HectameterMeter * 328.084;
		return Feet;
	}// DID IT

	public double HectameterToInches(double HectameterMeter) {
		double Inches = HectameterMeter * 3937.01;
		return Inches;
	}// DID IT

	public double HectameterToYards(double HectameterMeter) {
		double Yards = 109.36138888889 * HectameterMeter;
		return Yards;
	}// DID IT

	public double HectameterToFurlong(double HectameterMeter) {
		double Furlong = .497096 * HectameterMeter;
		return Furlong;
	}// DID IT

	public double DecameterToFeet(double DecameterMeter) {
		double Feet = 32.8084 * DecameterMeter;
		return Feet;
	}// DID IT

	public double DecameterToInches(double DecameterMeter) {
		double Inches = 393.701 * DecameterMeter;
		return Inches;
	}// DID IT

	public double DecameterToYards(double DecameterMeter) {
		double Yards = 10.936138888889 * DecameterMeter;
		return Yards;
	}// DID IT

	public double DecameterToFurlong(double DecameterMeter) {
		double Furlong = .0497096 * DecameterMeter;
		return Furlong;
	}// DID IT

	public double MeterToFeet(double Meter) {
		double Feet = 3.28084 * Meter;
		return Feet;
	}// DID IT

	public double MeterToInches(double Meter) {
		double Inches = 39.3701 * Meter;
		return Inches;
	}// DID IT

	public double MeterToYards(double Meter) {
		double Yards = 1.09361138889 * Meter;
		return Yards;
	}// DID IT

	public double MeterToFurlong(double Meter) {
		double Furlong = .00497096 * Meter;
		return Furlong;
	}// DID IT

	public double DecimeterToFeet(double deci) {
		double Feet = .328084 * deci;
		return Feet;
	}// DID IT

	public double DecimeterToInches(double deci) {
		double Inches = 3.93701 * deci;
		return Inches;
	}// DID IT

	public double DecimeterToYards(double deci) {
		double Yards = .1093611388889 * deci;
		return Yards;
	}// DID IT

	public double DecimeterToFurlong(double deci) {
		double Furlong = .000497096 * deci;
		return Furlong;
	}// DID IT

	public double CentimeterToFeet(double centi) {
		double Feet = .0328084 * centi;
		return Feet;
	}// DID IT

	public double CentimeterToInches(double centi) {
		double Inches = .39371 * centi;
		return Inches;
	}// DID IT

	public double CentimeterToYards(double centi) {
		double Yards = .01093611388889 * centi;
		return Yards;
	}// DID IT

	public double CentimeterToFurlong(double centi) {
		double Furlong = .0000497096 * centi;
		return Furlong;
	}// DID IT

	public double MillimeterToFeet(double milli) {
		double Feet = .003328084 * milli;
		return Feet;
	}// DID IT

	public double MillimeterToInches(double milli) {
		double Inches = .039371 * milli;
		return Inches;
	}// DID IT

	public double MillimeterToYards(double milli) {
		double Yards = .0010936113889 * milli;
		return Yards;
	}// DID IT

	public double MillimeterToFurlong(double milli) {
		double Furlong = .00000497096 * milli;
		return Furlong;
	}// DID IT

	// SI to Mile
	public double KilometerToMile(double Kilometer) {
		double Mile = 0.621371 * Kilometer;
		return Mile;
	}

	public double HectameterToMile(double Hectameter) {
		double Mile = .00621371 * Hectameter;
		return Mile;
	}

	public double DecameterToMile(double Decameter) {
		double Mile = .000621371 * Decameter;
		return Mile;
	}

	public double MeterToMile(double meter) {
		double Mile = .0000621371 * meter;
		return Mile;
	}

	public double DecimeterToMile(double deci) {
		double Mile = .00000621371 * deci;
		return Mile;
	}

	public double CentimeterToMile(double centi) {
		double Mile = .000000621371 * centi;
		return Mile;
	}

	public double MillimeterToMile(double milli) {
		double Mile = .0000000621371 * milli;
		return Mile;
	}

	public double InchesToMillimeter(double inch) {
		double mm = inch * 25.4;
		return mm;
	}

	public double InchesToCentimeter(double inch) {
		double cm = inch * 2.54;
		return cm;
	}

	public double InchesToDecimeter(double inch) {
		double dm = inch * .254;
		return dm;
	}

	public double InchesToMeter(double inch) {
		double m = inch * .0254;
		return m;
	}

	public double InchesToDecameter(double inch) {
		double dm = inch * 0.00254;
		return dm;
	}

	public double InchesToHectameter(double inch) {
		double hm = inch * 0.000254;
		return hm;
	}

	public double InchesToKilometer(double inch) {
		double km = inch * .0000254;
		return km;
	}

	public double FeetToMillimeter(double inch) {
		double mm = inch * 304.8;
		return mm;
	}

	public double FeetToCentimeter(double inch) {
		double cm = inch * 30.48;
		return cm;
	}

	public double FeetToDecimeter(double inch) {
		double dm = inch * 3.048;
		return dm;
	}

	public double FeetToMeter(double inch) {
		double m = inch * .3048;
		return m;
	}

	public double FeetToDecameter(double inch) {
		double dm = inch * .03048;
		return dm;
	}

	public double FeetToHectameter(double inch) {
		double hm = inch * .003048;
		return hm;
	}

	public double FeetToKilometer(double inch) {
		double km = inch * .0003048;
		return km;
	}

	public double YardToMillimeter(double inch) {
		double mm = inch * 914.4;
		return mm;
	}

	public double YardToCentimeter(double inch) {
		double cm = inch * 91.44;
		return cm;
	}

	public double YardToDecimeter(double inch) {
		double dm = inch * 9.144;
		return dm;
	}

	public double YardToMeter(double inch) {
		double m = inch * .9144;
		return m;
	}

	public double YardToDecameter(double inch) {
		double dm = inch * .09144;
		return dm;
	}

	public double YardToHectameter(double inch) {
		double hm = inch * .009144;
		return hm;
	}

	public double YardToKilometer(double inch) {
		double km = inch * .0009144;
		return km;
	}

	public double FurlongToMillimeter(double inch) {
		double mm = inch * 201168;
		return mm;
	}

	public double FurlongToCentimeter(double inch) {
		double cm = inch * 20116.8;
		return cm;
	}

	public double FurlongToDecimeter(double inch) {
		double dm = inch * 2011.68;
		return dm;
	}

	public double FurlongToMeter(double inch) {
		double m = inch * 201.168;
		return m;
	}

	public double FurlongToDecameter(double inch) {
		double dm = inch * 20.1168;
		return dm;
	}

	public double FurlongToHectameter(double inch) {
		double hm = inch * 2.01168;
		return hm;
	}

	public double FurlongToKilometer(double inch) {
		double km = inch * .201168;
		return km;
	}

	public double MileToMillimeter(double inch) {
		double mm = inch * 1609340.8006241;
		return mm;
	}

	public double MileToCentimeter(double inch) {
		double cm = inch * 160934.08006241;
		return cm;
	}

	public double MileToDecimeter(double inch) {
		double dm = inch * 16093.408006241;
		return dm;
	}

	public double MileToMeter(double inch) {
		double m = inch * 1609.3408006241;
		return m;
	}

	public double MileToDecameter(double inch) {
		double dm = inch * 160.93408006241;
		return dm;
	}

	public double MileToHectameter(double inch) {
		double hm = inch * 16.093408006241;
		return hm;
	}

	public double MileToKilometer(double inch) {
		double km = inch * 1.6093408006241;
		return km;
	}
}
