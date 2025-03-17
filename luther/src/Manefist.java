
public class Manefist {
	
	 private double manefist, vision, will, percentage;
	
	public double getManefist() {
		return manefist;
	}
	
	public  void setManefist(double manefist) {
		this.manefist = manefist;
	}
	public double getVision() {
		return vision;
	}
	public void setVision( double vision) {
		this.vision = vision;
	}
	public double getWill() {
		return will;
	}
	public void setWill(double will ) {
		this.will = will;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage ) {
		this.percentage = percentage;
	}
	
	
public void myCalculation() {
	setManefist(getVision()/getWill());
	setPercentage( Math.min(100,(getManefist() * 100)));
	
}

    
	public Manefist (double vision, double will){
		
		this.vision = vision;
		this.will = will;
 }


}	


	
	
