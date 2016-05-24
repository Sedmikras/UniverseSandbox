package application;

/**
 * Created by sedmikras on 24.5.16.
 */
public class Planet {
    private static int x;
    private static int y;
    private static int population;

    public Planet(int x,int y, int population) {
        Planet.x = x;
        Planet.y = y;
        Planet.population = population;
    }

    public Planet() {
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        Planet.population = population;
    }
}
