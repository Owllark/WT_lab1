package task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(0, Color.GREEN);
        Ball ball2 = new Ball(1, Color.BLUE);
        Ball ball3 = new Ball(2, Color.BLUE);

        Bucket bucket = new Bucket();

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);

        System.out.println(bucket.countBlueBalls());
    }
}
