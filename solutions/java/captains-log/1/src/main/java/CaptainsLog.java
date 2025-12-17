import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int random_number = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[random_number];
    }

    String randomShipRegistryNumber() {
        int random_number = 1000 + random.nextInt(9000);
        return "NCC-" + random_number;
    }

    double randomStardate() {
        return 41000.0 + 1000.0 * random.nextDouble();
    }
}
