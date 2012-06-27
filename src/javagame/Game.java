package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame{
	
	public static final String title = "Asteroid Blaster!";

	public Game(String title) {
		super(title);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Game(title));
			app.setDisplayMode(1400, 1000, false);
			app.setTargetFrameRate(60);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
				
	}

}
