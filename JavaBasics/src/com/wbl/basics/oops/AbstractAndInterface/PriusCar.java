package com.wbl.basics.oops.AbstractAndInterface;

public class PriusCar extends AbstractCar   {
	
	public PriusCar() {
		super("Prius");
		
		System.out.println("\n");
		
	}

	@Override
	public void fuelEconomy() {
		 System.out.println("ICarAdvanceFeatures : The milage is 45 miles per gallon in Toyota Prius \n ");
		
	}

	@Override
	public void blindSpotMonitoring() {
		 System.out.println("ICarAdvanceFeatures : Blind Spot Monitoring enabled in Toyota Prius \n ");
		
	}

	@Override
	public void emergencyAutoBrakes() {
		 System.out.println("ICarAdvanceFeatures : Emergency auto braking enabled in Toyota Prius \n ");
		
	}

	// these are the abstract methods from the abstract class 
	@Override
	public void maintenanceSchedule() {
	      System.out.println("Abstract : This is Toyota Prius's Maintenance Schedule \n");		
		
	}


	@Override
	public void autoTempControl() {
	      System.out.println("Abstract : This is Toyota Prius's Auto Temperature Control feature \n");		
		
	}


	@Override
	public void tyrePressureMonitoring() {
	      System.out.println("Abstract : This is Toyota Prius's tyre pressure monitoring feature \n");		
	}


	@Override
	public void autoAudioControl() {
      System.out.println("Abstract : Toyota Prius has automatic noise cancellation feature in it's audio system \n");		
	}

}
