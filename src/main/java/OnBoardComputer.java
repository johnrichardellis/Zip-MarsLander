public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {


        int burn = 0;
        int altitude = status.getAltitude();
        int velocity = status.getVelocity();

        if (altitude > 10000) { burn = 130; } // should be fine to keep

        if (altitude < 10000 && altitude >= 5000) { burn = 150; }

        if (altitude < 5000 && altitude >= 1000) { burn = 170; }
//            if (velocity > 1000) { burn = 200; }
//            if (velocity > 200 && velocity <= 1000) { burn = 200; }
//            if (velocity > 50 && velocity <= 200) { burn = ((velocity - 50) + 100); }
//            if (velocity > 10 && velocity <= 50) { burn = ((velocity - 10) + 100); }
//            if (velocity > 0 && velocity <= 10) { burn = ((velocity - 1) + 100); } }

        if (altitude < 1000 && altitude >= 200) { burn = 190; }
//            if (velocity > 1000) { burn = 200; }
//            if (velocity > 200 && velocity <= 1000) { burn = 200; }
//            if (velocity > 50 && velocity <= 200) { burn = ((velocity - 50) + 100); }
//            if (velocity > 10 && velocity <= 50) { burn = ((velocity - 10) + 100); }
//            if (velocity > 0 && velocity <= 10) { burn = ((velocity - 1) + 100); } }

        if (altitude < 200 && altitude >= 1) {
            if (velocity > 1000) { burn = 200; }
            if (velocity > 200 && velocity <= 1000) { burn = 200; }
            if (velocity > 50 && velocity <= 200) { burn = ((velocity - 50) + 100); }
            if (velocity > 10 && velocity <= 50) { burn = ((velocity - 10) + 100); }
            if (velocity > 0 && velocity <= 10) { burn = ((velocity - 1) + 100); } }



        System.out.println(burn); /*hack!*/
        return burn;

//////////////////////////
//        int burn = 0;
//        int D=status.getAltitude();
//        int V=status.getVelocity();
//        int terminal= (((V*V)+(100*V))/200) + V + 100;
//        if (D<terminal){
//            burn=200;
//        }
//
//        if (D<100){
//            burn = 102-D+V;
//        }
//        if (D==2){burn = 99+V;}
//        if (D==1){burn=99;}
//
//
//        System.out.println(burn); /*hack!*/
//        return burn;
    }
}


