package com.wbl.basics.oops.AbstractAndInterface;

public class TeslaCar extends AbstractCar implements  ICarSmartFeatures, IConnectedCar {
	
	public TeslaCar() {
		super("Tesla");
		
		System.out.println("\n");
		
	}

	

	@Override
	public void fuelEconomy() {
		 System.out.println("ICarAdvanceFeatures : No fuel Usage as Tesla is an electric car \n \n ");
		
	}

	@Override
	public void blindSpotMonitoring() {
		 System.out.println("ICarAdvanceFeatures : Blind Spot Monitoring enabled in Tesla \n \n ");
		
	}

	@Override
	public void emergencyAutoBrakes() {
		 System.out.println("ICarAdvanceFeatures : Emergency auto braking enabled in Tesla \n \n ");
		
	}



	@Override
	public void maintenanceSchedule() {
	      System.out.println("Abstract : This is Tesla's Maintenance Schedule \n");		
		
	}


	@Override
	public void autoTempControl() {
	      System.out.println("Abstract : This is Tesla's Auto Temperature Control feature \n");		
		
	}


	@Override
	public void tyrePressureMonitoring() {
	      System.out.println("Abstract : This is Tesla's tyre pressure monitoring feature \n");		
	}


	@Override
	public void autoAudioControl() {
      System.out.println("Abstract : Tesla has automatic noise cancellation feature in it's audio system \n");		
	}



// the next three methods are the ICarSmartFeatures 
	
	@Override
	public void selfParking() {
       System.out.println("ICarSmartFeatures : Tesla has introduced the self-parking feature \n");		
	}



	@Override
	public void autoDriving() {
	       System.out.println("ICarSmartFeatures : Tesla is testing out it's Auto Driving feature \n");		
		
	}



	@Override
	public void autoCollisionReporting() {
	       System.out.println("ICarSmartFeatures : Tesla has introduced the Automatic dialing of 911 after a Collision \n ");		
		
	}

// this is the connected car interface method 

	@Override
	public void connectedCar() {
       System.out.println("IConnectedCar :  Tesla is soon coming out with a connected car \n");		
	}

}
