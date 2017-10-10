package com.company;



public class lucky {

    int a =0;
    double z = 0;

    public int perfectRandom() {

        z = Math.random()*100;
        if (z<=11.1) {

            a=1;

        }
        else if (z<=22.2) {

            a=4;

        }
        else if (z<=33.3) {

            a=9;

        }
        else if (z<=44.4) {

            a=16;

        }
        else if (z<=55.5) {

            a=25;

        }
        else if (z<=66.6) {

            a=36;

        }else if (z<=77.7) {

            a=49;

        }
        else if (z<=88.8) {

            a=64;

        }
        else if (z<100) {

            a=81;

        }
        return a;

    }

}
