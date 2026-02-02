import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        char randomChar = PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
        return randomChar;
    }

    String randomShipRegistryNumber() {
        int number = random.nextInt(9000) + 1000;
        return "NCC-"+number;
    }

    double randomStardate() {
       double number2 = 41000.0 + random.nextDouble()* 1000.0;
           return number2;
    }
}
