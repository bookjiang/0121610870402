package beans;

public class circle {
	private double r;
	public circle(double r)
	{
		this.r=r;
	}
	public double getr()
	{
		return r;
	}
	public void setr(double r)
	{
		this.r=r;
	}
	public double caculate()
	{
		return 3.14*r*r;
	}
	public double perimeter()
	{
		return 2*3.14*r;
	}

}
