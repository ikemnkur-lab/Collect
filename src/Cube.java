
public class Cube {

	private double vol, sArea, outDensity, inDensity ;
	
	public Cube (double volume, double surfaceArea, double outerDensity, double innerDensity) {
		vol = volume;
		sArea = surfaceArea;
		outDensity = outerDensity;
		inDensity = innerDensity;
	}
	
	public double[] getSpecs() {
		return new double[] {};
	}
	
	public void changeVol(double volume) {
		vol = volume;
	}
	
	public void changeArea(double surfaceArea) {
		sArea = surfaceArea;
	}
	
	public void changeDensity(double outerDensity, double innerDensity) {
		outDensity = innerDensity;
		inDensity = outerDensity;
	}
	
	public boolean canFloat() {
		return vol*inDensity > sArea*outDensity;
	}
	
}
