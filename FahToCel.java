package x;

public class FahToCel implements Temperature {

	private double Celsius;

	@Override
	public double conversion(double x) {
		// TODO Auto-generated method stub
		return Celsius = (x - 32) * 5/9 ;
	}

}
