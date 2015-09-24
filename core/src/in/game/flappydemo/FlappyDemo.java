package in.game.flappydemo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import in.game.flappydemo.states.GameStateManager;
import in.game.flappydemo.states.MenuState;

public class FlappyDemo extends ApplicationAdapter {
	public static int WIDTH = 480;
    public static int HEIGHT = 800;

    public static final String TITLE = "Flappy Bird";
    private GameStateManager gsm;
    private SpriteBatch batch;
    private Texture img;

    public FlappyDemo(int height, int width) {
        HEIGHT = height;
        WIDTH = width;
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        gsm = new GameStateManager();
        //Gdx.gl.glClearColor(0, 1, 1, 1);
        gsm.push(new MenuState(gsm));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
    }
}
