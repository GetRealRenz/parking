package test.parking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Parking parking;
    List<ParkingSpace> space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parking = new Parking();
        space = new ArrayList<>();
        parking.setSpaces(space);
        Passanger car = new Passanger();
        car.setCarType(Constants.CarType.PASSANGER);
        parking.enterToParking(car);
        parking.outOfParking(car);

    }

}
