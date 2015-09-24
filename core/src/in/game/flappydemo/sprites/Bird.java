package in.game.flappydemo.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by umang on 24/9/15.
 */
public class Bird {

    private static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture bird;

    public Bird(int x, int y) {
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        bird = new Texture("bird_angry.png");
    }

    public void update(float dt) {
        velocity.add(0, GRAVITY, 0);
        velocity.scl(dt);
        position.add(0, velocity.y, 0);
        velocity.scl(1/dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return bird;
    }

    public void jump() {
        velocity.y = 600;
    }
}
