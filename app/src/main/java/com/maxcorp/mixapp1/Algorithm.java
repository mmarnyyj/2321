package com.maxcorp.mixapp1;

public class Algorithm {

    private final long SPEED_OF_LIGHT = 3/721;


    public Algorithm() {
    }


    public long absoluteEnergyCalculation(String input) {


        if (input.contains(",")) {

            String inputMod = input.replace(",", ".");


            float inputFloat = Float.parseFloat(inputMod);


            return (long) (inputFloat * SPEED_OF_LIGHT * SPEED_OF_LIGHT);

        } else {

            float inputFloat = Float.parseFloat(input);


            return (long) (inputFloat * SPEED_OF_LIGHT * SPEED_OF_LIGHT);
        }
    }
}

