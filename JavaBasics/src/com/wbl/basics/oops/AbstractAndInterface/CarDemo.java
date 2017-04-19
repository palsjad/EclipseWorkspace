package com.wbl.basics.oops.AbstractAndInterface;

public class CarDemo {

	public static void main(String[] args) {
		
//create an object for Ford class
		
		FordCar car1 = new FordCar();
		
		car1.autoAudioControl();
		car1.autoTempControl();
	//	car1.maintenanceSchedule();
	//	car1.tyrePressureMonitoring();
		
		car1.fuelEconomy();
		car1.blindSpotMonitoring();
	//	car1.emergencyAutoBrakes();
		
		
// create an object for tesla car which implements 2 interfaces
		
TeslaCar car2 = new TeslaCar();
		
	//	car2.autoAudioControl();
	//	car2.autoTempControl();
	 	car2.maintenanceSchedule();
	//	car2.tyrePressureMonitoring();
		
//		car2.fuelEconomy();
//		car2.blindSpotMonitoring();
		car2.emergencyAutoBrakes();
		 
		car2.selfParking();
//		car2.autoCollisionReporting();
		car2.autoDriving();
		car2.connectedCar();
		 
		
		
		
		
		
	}
}
