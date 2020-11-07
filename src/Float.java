
public class Float {

	private double vol, sArea, outDensity, inDensity, loadMass;
	
	public Float (double volume, double surfaceArea, double outerDensity, double innerDensity) {
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
	
	public String canFloat(double load) {
		loadMass = load;
		String text = "can not float a load of" + loadMass;
		if(vol*(1-inDensity) + sArea*outDensity + load < 0)
			text = "can float a load of" + load;
			
		return text;
	}
	
}
