public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {


////        int burn = 0;
        int altitude = status.getAltitude();
        int velocity = status.getVelocity();
        int burn = (velocity * velocity / (2 * altitude)) + 100;


        // got it to land a few times now, so i'm memorializing this with the results below
        // i know this is not a way to do this and i got lucky.

//        Time	Velocity		Fuel		Altitude		Burn
//                ----	-----		----		------		----
//                0		1000 		12000 		14579		134
//        10		966 		11866 		13613		134
//        20		932 		11732 		12681		134
//        30		898 		11598 		11783		134
//        40		864 		11464 		10919		134
//        50		830 		11330 		10089		134
//        60		796 		11196 		9293		134
//        70		762 		11062 		8531		134
//        80		728 		10928 		7803		133
//
//        Time	Velocity		Fuel		Altitude		Burn
//                ----	-----		----		------		----
//                90		695 		10795 		7108		133
//        100		662 		10662 		6446		133
//        110		629 		10529 		5817		134
//        120		595 		10395 		5222		133
//        130		562 		10262 		4660		133
//        140		529 		10129 		4131		133
//        150		496 		9996 		3635		133
//        160		463 		9863 		3172		133
//        170		430 		9730 		2742		133
//
//        Time	Velocity		Fuel		Altitude		Burn
//                ----	-----		----		------		----
//                180		397 		9597 		2345		133
//        190		364 		9464 		1981		133
//        200		331 		9331 		1650		133
//        210		298 		9198 		1352		132
//        220		266 		9066 		1086		132
//        230		234 		8934 		852		132
//        240		202 		8802 		650		131
//        250		171 		8671 		479		130
//        260		141 		8541 		338		129
//
//        Time	Velocity		Fuel		Altitude		Burn
//                ----	-----		----		------		----
//                270		112 		8412 		226		127
//        280		85 		8285 		141		125
//        290		60 		8160 		81		122
//        300		38 		8038 		43		116
//        310		22 		7922 		21		111
//        320		11 		7811 		10		106
//        330		5 		7705 		5		102
//        340		3 		7603 		2		102
//        350		1 		7501 		1		100


        System.out.println(burn); /*hack!*/
        return burn;


//        int altitude = status.getAltitude();
//        int velocity = status.getVelocity();
//        int burn = (velocity * velocity/ (2 * altitude)) + 100;
//
//        if (altitude < 10000 && altitude >= 5000) { burn = 150; }
//
//        if (altitude < 5000 && altitude >= 1000) {
//            if (velocity > 200) { burn = 200; }
//            else { burn = 100; } }
//
//        if (altitude < 1000 && altitude >= 200) {
//            if (velocity > 200) { burn = 200; }
//            else { burn = 100; } }
//
//        if (altitude < 200 && altitude >= 1) {
//            if (velocity > 1000) { burn = 200; }
//            if (velocity > 200 && velocity <= 1000) { burn = 200; }
//            if (velocity > 50 && velocity <= 200) { burn = ((velocity - 50) + 100); }
//            if (velocity > 10 && velocity <= 50) { burn = ((velocity - 10) + 100); }
//            if (velocity > 0 && velocity <= 10) { burn = ((velocity - 1) + 100); } }
//
//
//        System.out.println(burn); /*hack!*/
//        return burn;


/////////////////////////////////

//        int altitude = status.getAltitude();
//        int velocity = status.getVelocity();


    }
}


