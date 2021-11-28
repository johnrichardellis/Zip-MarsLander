public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {

//        int burn = (status.getVelocity() * status.getVelocity())/(2 * status.getAltitude());


        int burn = 0;
        int altitude = status.getAltitude();
        int velocity = status.getVelocity();
        int desiredVelocity = velocity / 10;


//        while (altitude > 1000 && velocity >) { burn = 200; }
//        while (altitude > 200 && altitude <= 1000 && velocity > ) { burn = }


        if (altitude > 10000) { burn = 100; } // should be fine to keep

        if (altitude < 10000 && altitude >= 5000) { burn = 150; }

        if (altitude < 5000 && altitude >= 1000) {
            if (velocity > 200) { burn = 200; }
            else { burn = 100; } }

        if (altitude < 1000 && altitude >= 200) {
            if (velocity > 200) { burn = 200; }
            else { burn = 100; } }

        if (altitude < 200 && altitude >= 1) {
            if (velocity > 1000) { burn = 200; }
            if (velocity > 200 && velocity <= 1000) { burn = 200; }
            if (velocity > 50 && velocity <= 200) { burn = ((velocity - 50) + 100); }
            if (velocity > 10 && velocity <= 50) { burn = ((velocity - 10) + 100); }
            if (velocity > 0 && velocity <= 10) { burn = ((velocity - 1) + 100); } }








        System.out.println(burn); /*hack!*/
        return burn;


    }
}


