package test.parking;

import java.util.List;


public class Parking implements ParkingInt {
    private List<ParkingSpace> mSpaces;

    public void setSpaces(List<ParkingSpace> spaces) {
        mSpaces = spaces;
    }

    @Override
    public void outOfParking(Car car) {
        ParkingSpace out = new ParkingSpace();
        switch (car.getCarType()) {
            case Constants.CarType.PASSANGER: {
                out.setType(Constants.CarType.PASSANGER);
                break;
            }
            case Constants.CarType.CARGO: {
                out.setType(Constants.CarType.CARGO);
                break;
            }

        }
        out.setNumber(car.getParkingNumb());
        mSpaces.add(out);
    }

    @Override
    public void enterToParking(Car car) {
        if (!mSpaces.isEmpty()) {
            for (ParkingSpace parkingSpace : mSpaces) {
                switch (parkingSpace.getType()) {
                    case Constants.CarType.CARGO: {
                        car.setParkingNumb(parkingSpace.getNumber());
                        mSpaces.remove(parkingSpace);
                        break;
                    }
                    case Constants.CarType.PASSANGER: {
                        if (car instanceof Passanger) {
                            car.setParkingNumb(parkingSpace.getNumber());
                            mSpaces.remove(parkingSpace);
                            break;
                        }
                    }
                }
            }
        }
    }
}
