package OOD1;

public class ParkingLot {
	private final Level[] levels;
	public ParkingLot(int numLevels, int numSpotsPerLevel) {
		levels = new Level[numLevels];
		for (int i = 0; i < numLevels; i++) {
			levels[i] = new Level(numSpotsPerLevel);
		}
	}
	public boolean hasSpots(Vehicle v) {
		for (Level l: levels) {
			if(l.hasSpot(v)){
				return true;
			}
		}
		return false;
	}
}
