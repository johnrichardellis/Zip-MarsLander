public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {




//        int burn = 0;
//        int altitude = status.getAltitude();
//        int velocity = status.getVelocity();
//        int desiredVelocity = velocity / 10;

        int burn = (status.getVelocity() * status.getVelocity())/(2 * status.getAltitude());

        System.out.println(burn); /*hack!*/
        return burn;


    }
}


