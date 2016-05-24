package application;

import java.util.Random;

/**
 * Created by sedmikras on 24.5.16.
 */
public class PlanetaryGenerator {
    private static Random rand = new Random();

    static double computeDistribution() {

        double sum = 0;
        for(int i = 0;i < Utility.NUMBER_OF_THROWS;i++) {
            sum += rand.nextDouble();
        }
        return Math.abs(sum - 0.5*Utility.NUMBER_OF_THROWS)/(Utility.NUMBER_OF_THROWS/12.0);
    }

    static void createVerse() {
        Planet[] planets = new Planet[Utility.NUMBER_OF_PLANETS];
        for(int i=0;i<Utility.NUMBER_OF_PLANETS;i++) {
            Planet planet = new Planet((int)rand.nextDouble()*Utility.GALAXY_WIDTH,
                    (int)(rand.nextDouble()*Utility.GALAXY_HEIGHT), (int)(computeDistribution()*Utility.MAX_POPULATION));
            planets[i] = planet;
        }
    }





    public static void main(String[] args)
    {
        Planet centrala = new CentralPlanet(200,200);
        createVerse();
    }

}
