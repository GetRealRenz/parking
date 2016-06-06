package test.parking;

/**
 * Created by Антон on 06.06.2016.
 */
public class ParkingSpace {
    private boolean forCargo;
    private int mNumber;

    public boolean isForCargo() {
        return forCargo;
    }

    public void setForCargo(boolean forCargo) {
        this.forCargo = forCargo;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }
}
