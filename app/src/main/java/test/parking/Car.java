package test.parking;

/**
 * Created by Антон on 06.06.2016.
 */
public class Car {

    private boolean isCargo;
    private int mParkingNumb;

    public int getParkingNumb() {
        return mParkingNumb;
    }

    public void setParkingNumb(int parkingNumb) {
        mParkingNumb = parkingNumb;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean cargo) {
        isCargo = cargo;
    }
}
