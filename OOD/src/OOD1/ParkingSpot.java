package OOD1;

public class ParkingSpot {
	private final VehicleSize size;
	private Vehicle currentVehicle;
	ParkingSpot(VehicleSize size){
		this.size = size;
	}
	boolean fit(Vehicle v){
		if (currentVehicle == null) {
			return size.ordinal() >= v.getSize().ordinal();
		}
		return false;
	}
	void park(Vehicle v){
		currentVehicle = v;
	}
	void leave() {
		currentVehicle = null;
	}
	Vehicle getVehicle() {
		return currentVehicle;
	}
}
