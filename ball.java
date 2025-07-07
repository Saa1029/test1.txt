public class ball
{
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	public ball(float x,float y,int radius,float xDelta,float yDelta;)
	{
		this.x=x;
		this.y=y;
		this.radius = radius;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}
	
	public float getX()
	{
		return x;
	}
	public float getY()
	{
		return y;
	}
	public int getRadius()
	{
		return radius;
	}
	public float getxDelta
	{
		return xDelta;
	}
	public float getyDelta
	{
		return yDelta;
	}
	public void setX(float x)
	{
		this.x=x;
	}
	public void setY(float y)
	{
		this.y=y
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	public void setxDelta(float xDelta)
	{
		this.xDelta = xDelta;
	}
	public void setyDelat(float yDelta)
	{
		this.yDelta = yDelta;
	}
	
	public void move()
	{
		this.x = x + xDelta;
		this.y = y + yDelta;
	}
	public void reflecorHorizontal()
	{
		this.xDelta = -xDelta;
		
	}
	public void reflecorVertical()
	{
		this.yDelta = -yDelta;
	}
	public String toString()
	{
		return ""
	}
}