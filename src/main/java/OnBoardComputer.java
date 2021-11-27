public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
//        int burn = 0;
//
//        System.out.println(burn); /*hack!*/
//        return burn;

        int burn = 0;
        int D=status.getAltitude();
        int V=status.getVelocity();
        int terminal= (((V*V)+(100*V))/200) + V + 100;
        if (D<terminal){
            burn=200;
        }

        if (D<100){
            burn = 102-D+V;
        }
        if (D==2){burn = 99+V;}
        if (D==1){burn=99;}


        System.out.println(burn); /*hack!*/
        return burn;
    }
    }


