package application;

/**
 * Created by sedmikras on 24.5.16.
 */
public class HabitablePlanet extends Planet {
    private static int x;
    private static int y;
    private static int population;


    HabitablePlanet(int x, int y, int population) {
        this.x = x;
        this.y = y;
        this.population = population;
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
}
