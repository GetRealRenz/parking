package test.parking;

import java.util.List;

/**
 * Created by Антон on 06.06.2016.
 */
public class Parking {
    private List<ParkingSpace> mSpaces;

    public void setSpaces(List<ParkingSpace> spaces) {
        mSpaces = spaces;
    }
    public void outOfParking(Car car) {
        ParkingSpace out = new ParkingSpace();
        out.setForCargo(car.isCargo());
        out.setNumber(car.getParkingNumb());
        mSpaces.add(out);
    }

    public void enterToParking(Car car) {
        if (!mSpaces.isEmpty() && car.isCargo()) {
            for (ParkingSpace parkingSpace : mSpaces) {
                if (parkingSpace.isForCargo()) {
                    car.setParkingNumb(parkingSpace.getNumber());
                    mSpaces.remove(parkingSpace);
                }
            }
        } else if (!mSpaces.isEmpty()) {
            car.setParkingNumb(mSpaces.get(0).getNumber());
            mSpaces.remove(0);
        }
    }
}
