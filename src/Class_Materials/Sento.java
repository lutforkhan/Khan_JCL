package Class_Materials;

import Class_Materials.Outer_Demo.Inner_Demo;

public class Sento {
	
	
	
	public int getData()
	{
		
		 // int a=80;
		return a;
	}
	
	
	public void  setData(int x)
	{
		this.a=x;
	}
	
	public void sun()
	{
		
		//int a=90, b=20, z;
		z=a+b;
		
		System.out.println("The value of sum is "+z);
		
	}
	 private int a=90, b=20,z;
	public void sun(int y)
	{
		
		//int a=90, b=20, z;
		b=y;
		z=a+b;
		
		System.out.println("The value of sum is "+z);
		
	}
	
	void objTest()
	{
		Sento testobj=new Sento();
		testobj.sun();
		
		
		
	}

	

	

	public static void main(String[] args) {
		
		
		
		Sento m= new Sento();
	//	System.out.println(" Hi Khan value of a is= " +m.a);
		m.setData(200);
		System.out.println("Hi Khan value of a is= " +m.getData());
		//m.sun();
		m.sun(10);
		//m.sun(30);
		//m.sum1(400, 60);
		

	}

}
