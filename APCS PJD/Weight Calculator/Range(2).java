/*
*  This class represents a rectangular geographic range.
*  @author Mrs. Adams.
*/

public class Range
{
	private double maxlatitude;
	private double minLatitude;
	private double maxLongitude;
	private double minLongitude;
	
	public double getMaxLatitude()
	{
		return maxlatitude;
	}
	
	public double getMinLatitude()
	{
		return minLatitude;
	}
	
	public double getMaxLongitude()
	{
		return maxLongitude;
	}
	
	public double getminLongitude()
	{
		return minLongitude;
	}
	
	public void setMaxLatitude(double latitude)
	{
		if(latitude > maxLatitude)
		{
			maxLatitude = latitude;
		}
	}
	
	public void setMinLatitude(int latitude)
	{
		if(latitude < minLatitude)
		{
			minLatitude = latitude;
		}
	}
	
	public void setMaxLongitude(double longitude)
	{
		if(longitude > maxLongitude)
		{
			maxLongitude = longitude;
		}
	}
	
	public void setMinLongitude(double longitude)
	{
		if(longitude < minLongitude)
		{
			minLongitude = longitude;
		}
	}
}