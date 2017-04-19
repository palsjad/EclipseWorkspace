package com.wbl.basics.oops.AbstractAndInterface;

public class HondaCar extends AbstractCar implements  ICarSmartFeatures {
	
	public HondaCar() {
		super("Honda");
		
		System.out.println("\n");
		
	}


	@Override
	public void fuelEconomy() {
		 System.out.println("ICarAdvanceFeatures : The milage is 20 miles per gallon in Honda \n ");

		
	}

	@Override
	public void blindSpotMonitoring() {
		 System.out.println("ICarAdvanceFeatures : Blind Spot Monitoring enabled only in high end models in Honda \n ");
		
	}

	@Override
	public void emergencyAutoBrakes() {
		 System.out.println("ICarAdvanceFeatures : Emergency auto braking enabled in Honda \n ");
		
	}


	@Override
	public void maintenanceSchedule() {
	      System.out.println("Abstract : This is Honda's Maintenance Schedule \n");		
		
	}


	@Override
	public void autoTempControl() {
	      System.out.println("Abstract : This is Honda's Auto Temperature Control feature \n");		
		
	}


	@Override
	public void tyrePressureMonitoring() {
	      System.out.println("Abstract : This is Honda's tyre pressure monitoring feature \n");		
	}


	@Override
	public void autoAudioControl() {
      System.out.println("Abstract : Honda has automatic noise cancellation feature in it's audio system \n");		
	}


	// the next three methods are the ICarSmartFeatures 
	
		@Override
		public void selfParking() {
	       System.out.println("ICarSmartFeatures : Honda will introduce the self-parking feature in 2017 only in it's new high-end models \n");		
		}



		@Override
		public void autoDriving() {
		       System.out.println("ICarSmartFeatures : Honda does not have the Auto Driving capabilites yet \n");		
			
		}



		@Override
		public void autoCollisionReporting() {
		       System.out.println("ICarSmartFeatures : Honda will soon introduce the Automatic dialing of 911 after Collision \n ");		
			
		}


		
}
