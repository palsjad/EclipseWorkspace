package com.wbl.basics.oops.AbstractAndInterface;

public class FordCar extends AbstractCar{

	public FordCar() {
		 super("Ford");
		
		System.out.println("in ford construcotr\n");
		
	}

	
	@Override
	public void fuelEconomy() {
		 System.out.println("ICarAdvanceFeatures : The milage is 15 miles per gallon in Ford \n ");
		
	}

	@Override
	public void blindSpotMonitoring() {
		 System.out.println("ICarAdvanceFeatures : Blind Spot Monitoring not yet installed in Ford \n  ");
		
	}

	@Override
	public void emergencyAutoBrakes() {
		 System.out.println("ICarAdvanceFeatures : Emergency auto braking not yet installed in Ford \n  ");
		
	}


	@Override
	public void maintenanceSchedule() {
	      System.out.println("Abstract : This is Ford's Maintenance Schedule \n");		
		
	}


	@Override
	public void autoTempControl() {
	      System.out.println("Abstract : This is Ford's Auto Temperature Control feature \n");		
		
	}


	@Override
	public void tyrePressureMonitoring() {
	      System.out.println("Abstract : This is Ford's tyre pressure monitoring feature \n");		
	}


	@Override
	public void autoAudioControl() {
      System.out.println("Abstract : Ford has automatic noise cancellation feature in it's audio system \n");		
	}

}
