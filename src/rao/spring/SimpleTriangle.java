package rao.spring;

public class SimpleTriangle {
	
	private String geometry;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public SimpleTriangle(String geometry) {
		super();
		this.geometry = geometry;
	}

	public SimpleTriangle(int height) {
		super();
		this.height = height;
	}
	
	public SimpleTriangle(String geometry, int height) {
		super();
		this.geometry = geometry;
		this.height = height;
	}

	public String getGeometry() {
		return geometry;
	}

	public void draw() {
		System.out.println(geometry + " drawn with height: " + this.getHeight());
	}

}
