package com.wbl.basics.oops.AbstractAndInterface;


public abstract class AbstractCar implements ICarAdvancedFeatures {

	
	
	/*constructor to  print out the name of the car. 
	The constructor is passed the parameter by the child class when wecreate theobject for the child class  
	*/
	
	public AbstractCar(String car){
	
	System.out.println("\n\n The following are the details for : " + car);
}
	
//public abstract void fuelEconomy() ;
//	
//public abstract void blindSpotMonitoring();
//
//public abstract void emergencyAutoBrakes();


	
public abstract void maintenanceSchedule() ;

public abstract void autoTempControl () ; 

public abstract void tyrePressureMonitoring () ;

public abstract void autoAudioControl (); 

	
}
