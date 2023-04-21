package com.Interfaces;

public class Circle implements Shapes
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
	}

	@Override
	public void drawShape() {
		
		System.out.println("draw circle");
	}

	@Override
	public void colorShape() {
		
		System.out.println("Colour Red");
	}

	@Override
	public void moveShape() {
		
		System.out.println("Move Circle");
	}

}
