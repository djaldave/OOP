package x;

public class FahToKel implements Temperature{

	private double Kelvin;

	@Override
	public double conversion(double x) {
		// TODO Auto-generated method stub
		return  Kelvin = (x -  32) * 5/9 + 273.15 ;
	}

}
