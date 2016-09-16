package monstar.model;

public class MarshmallowMonstar 
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonstar()
	{
		this.name = "no name";
		this.antennaCount = -346217896423789.34;
	    this.eyeCount = -723478;
	    this.legCount = -43674;
	    this.noseCount = -34;
	    this.hasBellyButton = false;
	}
	
	public MarshmallowMonstar(String name, Double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}
	
	public String toString()
	{
		String description = "Monstar says: Name is " + name;
		
		return description;
		
	}
	
	public String getName()
	
	{
		return name;
	}

	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int  getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
		
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	 public void setHasBellyButton(boolean hasBellyButton)
	 {
		 this.hasBellyButton = hasBellyButton; 
	 }
	 
	 public void setLegCount (int legCount)
	 {
		 this.legCount = legCount;
	 }
	 
	 public void setEyeCount (int eyeCount)
	 {
		 this.eyeCount = eyeCount;
	 }
	 
	 public void setAntennaCount(double antennaCount)
	 {
		 this.antennaCount = antennaCount;
	 }
	 
	 public void setNoseCount(int noseCount)
	 
	 {
		 this.noseCount = noseCount;
	 }
	 
	 
	 
}








