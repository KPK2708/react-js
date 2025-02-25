package com.wipro.java.microservices.l;

class Square extends Rectangle {
	public Square() {}
	
	public void square(int size) {
		width = height = size;
	}
	
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
		
	}
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
}