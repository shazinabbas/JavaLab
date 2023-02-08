package Week1;

public class Lab02 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int secondsInaYear = 60 * 60 * 24 * 365;

        int births = secondsInaYear / 7;
        int deaths = secondsInaYear / 13;
        int immigrants = secondsInaYear / 45;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += births + immigrants - deaths;
            System.out.println("Year " + i + " = " + (int) currentPopulation);
        }
    }
}
