package x;

public class KelToFah implements Temperature{

	private double Fahrenheit;

	@Override
	public double conversion(double x) {
		// TODO Auto-generated method stub
		return  Fahrenheit = (x -  273.15) * 9/5 + 32 ;
	}

}
