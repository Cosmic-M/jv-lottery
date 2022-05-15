package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}