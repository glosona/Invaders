package engine;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import screen.*;

=======
import screen.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
>>>>>>> develop

/**
 * Implements core game logic.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public final class Core {

	/** Width of current screen. */
	private static final int WIDTH = 448;
	/** Height of current screen. */
	private static final int HEIGHT = 520;
	/** Max fps of current screen. */
	private static final int FPS = 60;

	/** Max lives. */
	private static final int MAX_LIVES = 3;
	/** Levels between extra life. */
	private static final int EXTRA_LIFE_FRECUENCY = 3;
	/** Total number of levels. */
	private static final int NUM_LEVELS = 7;
<<<<<<< HEAD

	/**Default level*/
	/** Difficulty settings for level 1. */
	private static final GameSettings SETTINGS_Default_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000);
	/** Difficulty settings for level 2. */
	private static final GameSettings SETTINGS_Default_LEVEL_2 =
			new GameSettings(5, 5, 50, 2500);
	/** Difficulty settings for level 3. */
	private static final GameSettings SETTINGS_Default_LEVEL_3 =
			new GameSettings(6, 5, 40, 1500);
	/** Difficulty settings for level 4. */
	private static final GameSettings SETTINGS_Default_LEVEL_4 =
			new GameSettings(6, 6, 30, 1500);
	/** Difficulty settings for level 5. */
	private static final GameSettings SETTINGS_Default_LEVEL_5 =
			new GameSettings(7, 6, 20, 1000);
	/** Difficulty settings for level 6. */
	private static final GameSettings SETTINGS_Default_LEVEL_6 =
			new GameSettings(7, 7, 10, 1000);
	/** Difficulty settings for level 7. */
	private static final GameSettings SETTINGS_Default_LEVEL_7 =
			new GameSettings(8, 7, 2, 500);

	/**Hard level*/
	/** Difficulty settings for level 1. */
	private static final GameSettings SETTINGS_Hard_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000);
	/** Difficulty settings for level 2. */
	private static final GameSettings SETTINGS_Hard_LEVEL_2 =
			new GameSettings(5, 5, 50, 2500);
	/** Difficulty settings for level 3. */
	private static final GameSettings SETTINGS_Hard_LEVEL_3 =
			new GameSettings(6, 5, 40, 1500);
	/** Difficulty settings for level 4. */
	private static final GameSettings SETTINGS_Hard_LEVEL_4 =
			new GameSettings(6, 6, 30, 1500);
	/** Difficulty settings for level 5. */
	private static final GameSettings SETTINGS_Hard_LEVEL_5 =
			new GameSettings(7, 6, 20, 1000);
	/** Difficulty settings for level 6. */
	private static final GameSettings SETTINGS_Hard_LEVEL_6 =
			new GameSettings(7, 7, 10, 1000);
	/** Difficulty settings for level 7. */
	private static final GameSettings SETTINGS_Hard_LEVEL_7 =
			new GameSettings(8, 7, 2, 500);

	/**Expert level*/
	/** Difficulty settings for level 1. */
	private static final GameSettings SETTINGS_Expert_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000);
	/** Difficulty settings for level 2. */
	private static final GameSettings SETTINGS_Expert_LEVEL_2 =
			new GameSettings(5, 5, 50, 2500);
	/** Difficulty settings for level 3. */
	private static final GameSettings SETTINGS_Expert_LEVEL_3 =
			new GameSettings(6, 5, 40, 1500);
	/** Difficulty settings for level 4. */
	private static final GameSettings SETTINGS_Expert_LEVEL_4 =
			new GameSettings(6, 6, 30, 1500);
	/** Difficulty settings for level 5. */
	private static final GameSettings SETTINGS_Expert_LEVEL_5 =
			new GameSettings(7, 6, 20, 1000);
	/** Difficulty settings for level 6. */
	private static final GameSettings SETTINGS_Expert_LEVEL_6 =
			new GameSettings(7, 7, 10, 1000);
	/** Difficulty settings for level 7. */
	private static final GameSettings SETTINGS_Expert_LEVEL_7 =
=======
	
	/** Difficulty settings for level 1. */
	private static final GameSettings SETTINGS_LEVEL_1 =
			new GameSettings(5, 4, 60, 2000);
	/** Difficulty settings for level 2. */
	private static final GameSettings SETTINGS_LEVEL_2 =
			new GameSettings(5, 5, 50, 2500);
	/** Difficulty settings for level 3. */
	private static final GameSettings SETTINGS_LEVEL_3 =
			new GameSettings(6, 5, 40, 1500);
	/** Difficulty settings for level 4. */
	private static final GameSettings SETTINGS_LEVEL_4 =
			new GameSettings(6, 6, 30, 1500);
	/** Difficulty settings for level 5. */
	private static final GameSettings SETTINGS_LEVEL_5 =
			new GameSettings(7, 6, 20, 1000);
	/** Difficulty settings for level 6. */
	private static final GameSettings SETTINGS_LEVEL_6 =
			new GameSettings(7, 7, 10, 1000);
	/** Difficulty settings for level 7. */
	private static final GameSettings SETTINGS_LEVEL_7 =
>>>>>>> develop
			new GameSettings(8, 7, 2, 500);
	
	/** Frame to draw the screen on. */
	private static Frame frame;
	/** Screen currently shown. */
	private static Screen currentScreen;
	/** Difficulty settings list. */
	private static List<GameSettings> gameSettings;
	/** Application logger. */
	private static final Logger LOGGER = Logger.getLogger(Core.class
			.getSimpleName());
	/** Logger handler for printing to disk. */
	private static Handler fileHandler;
	/** Logger handler for printing to console. */
	private static ConsoleHandler consoleHandler;


	/**
	 * Test implementation.
	 * 
	 * @param args
	 *            Program args, ignored.
	 */
	public static void main(final String[] args) {
		try {
			LOGGER.setUseParentHandlers(false);

			fileHandler = new FileHandler("log");
			fileHandler.setFormatter(new MinimalFormatter());

			consoleHandler = new ConsoleHandler();
			consoleHandler.setFormatter(new MinimalFormatter());

			LOGGER.addHandler(fileHandler);
			LOGGER.addHandler(consoleHandler);
			LOGGER.setLevel(Level.ALL);

		} catch (Exception e) {
			// TODO handle exception
			e.printStackTrace();
		}

		frame = new Frame(WIDTH, HEIGHT);
		DrawManager.getInstance().setFrame(frame);
		int width = frame.getWidth();
		int height = frame.getHeight();

<<<<<<< HEAD
		/**레벨 설정*/
		/**기본 레벨*/
		int settinglevel = 1;

		switch (settinglevel){
			case 1:
				gameSettings = new ArrayList<GameSettings>();
				gameSettings.add(SETTINGS_Default_LEVEL_1);
				gameSettings.add(SETTINGS_Default_LEVEL_2);
				gameSettings.add(SETTINGS_Default_LEVEL_3);
				gameSettings.add(SETTINGS_Default_LEVEL_4);
				gameSettings.add(SETTINGS_Default_LEVEL_5);
				gameSettings.add(SETTINGS_Default_LEVEL_6);
				gameSettings.add(SETTINGS_Default_LEVEL_7);
				break;
			case 2:
				gameSettings = new ArrayList<GameSettings>();
				gameSettings.add(SETTINGS_Hard_LEVEL_1);
				gameSettings.add(SETTINGS_Hard_LEVEL_2);
				gameSettings.add(SETTINGS_Hard_LEVEL_3);
				gameSettings.add(SETTINGS_Hard_LEVEL_4);
				gameSettings.add(SETTINGS_Hard_LEVEL_5);
				gameSettings.add(SETTINGS_Hard_LEVEL_6);
				gameSettings.add(SETTINGS_Hard_LEVEL_7);
				break;
			case 3:
				gameSettings = new ArrayList<GameSettings>();
				gameSettings.add(SETTINGS_Expert_LEVEL_1);
				gameSettings.add(SETTINGS_Expert_LEVEL_2);
				gameSettings.add(SETTINGS_Expert_LEVEL_3);
				gameSettings.add(SETTINGS_Expert_LEVEL_4);
				gameSettings.add(SETTINGS_Expert_LEVEL_5);
				gameSettings.add(SETTINGS_Expert_LEVEL_6);
				gameSettings.add(SETTINGS_Expert_LEVEL_7);
				break;

		}


		GameState gameState = new GameState();
=======
		gameSettings = new ArrayList<GameSettings>();
		gameSettings.add(SETTINGS_LEVEL_1);
		gameSettings.add(SETTINGS_LEVEL_2);
		gameSettings.add(SETTINGS_LEVEL_3);
		gameSettings.add(SETTINGS_LEVEL_4);
		gameSettings.add(SETTINGS_LEVEL_5);
		gameSettings.add(SETTINGS_LEVEL_6);
		gameSettings.add(SETTINGS_LEVEL_7);
		
		GameState gameState;
>>>>>>> develop

		int returnCode = 1;
		do {
			gameState = new GameState(1, 0, MAX_LIVES, 0, 0);

			switch (returnCode) {
<<<<<<< HEAD
				case 1:
					// Main menu.
					currentScreen = new TitleScreen(width, height, FPS);
					LOGGER.info("Starting " + WIDTH + "x" + HEIGHT
							+ " title screen at " + FPS + " fps.");
					returnCode = frame.setScreen(currentScreen);
					LOGGER.info("Closing title screen.");
=======
			case 1:
				// Main menu.
				currentScreen = new TitleScreen(width, height, FPS);
				LOGGER.info("Starting " + WIDTH + "x" + HEIGHT
						+ " title screen at " + FPS + " fps.");
				returnCode = frame.setScreen(currentScreen);
				LOGGER.info("Closing title screen.");
>>>>>>> develop
				break;
			case 2:
				// Game & score.
				do {
					// One extra live every few levels.
					boolean bonusLife = gameState.getLevel()
							% EXTRA_LIFE_FRECUENCY == 0
							&& gameState.getLivesRemaining() < MAX_LIVES;
<<<<<<< HEAD

=======
					
>>>>>>> develop
					currentScreen = new GameScreen(gameState,
							gameSettings.get(gameState.getLevel() - 1),
							bonusLife, width, height, FPS);
					LOGGER.info("Starting " + WIDTH + "x" + HEIGHT
							+ " game screen at " + FPS + " fps.");
					frame.setScreen(currentScreen);
					LOGGER.info("Closing game screen.");

					gameState = ((GameScreen) currentScreen).getGameState();

					gameState = new GameState(gameState.getLevel() + 1,
							gameState.getScore(),
							gameState.getLivesRemaining(),
							gameState.getBulletsShot(),
							gameState.getShipsDestroyed());

				} while (gameState.getLivesRemaining() > 0
						&& gameState.getLevel() <= NUM_LEVELS);

<<<<<<< HEAD
				if (gameState.getLivesRemaining() == -1) {
					currentScreen = new TitleScreen(width, height, FPS);
					returnCode = frame.setScreen(currentScreen);
					LOGGER.info("Closing score screen.");
					break;
				}

=======
>>>>>>> develop
				LOGGER.info("Starting " + WIDTH + "x" + HEIGHT
						+ " score screen at " + FPS + " fps, with a score of "
						+ gameState.getScore() + ", "
						+ gameState.getLivesRemaining() + " lives remaining, "
						+ gameState.getBulletsShot() + " bullets shot and "
						+ gameState.getShipsDestroyed() + " ships destroyed.");
				currentScreen = new ScoreScreen(width, height, FPS, gameState);
				returnCode = frame.setScreen(currentScreen);
				LOGGER.info("Closing score screen.");
				break;
			case 3:
				// High scores.
				currentScreen = new HighScoreScreen(width, height, FPS);
				LOGGER.info("Starting " + WIDTH + "x" + HEIGHT
						+ " high score screen at " + FPS + " fps.");
				returnCode = frame.setScreen(currentScreen);
				LOGGER.info("Closing high score screen.");
				break;
			default:
				break;
<<<<<<< HEAD

			case 4:
				//Setting
				currentScreen = new SettingScreen(width, height, FPS);
				returnCode=frame.setScreen(currentScreen);
				break;

=======
>>>>>>> develop
			}

		} while (returnCode != 0);

		fileHandler.flush();
		fileHandler.close();
		System.exit(0);
	}

	/**
	 * Constructor, not called.
	 */
	private Core() {

	}

	/**
	 * Controls access to the logger.
	 * 
	 * @return Application logger.
	 */
	public static Logger getLogger() {
		return LOGGER;
	}

	/**
	 * Controls access to the drawing manager.
	 * 
	 * @return Application draw manager.
	 */
	public static DrawManager getDrawManager() {
		return DrawManager.getInstance();
	}

	/**
	 * Controls access to the input manager.
	 * 
	 * @return Application input manager.
	 */
	public static InputManager getInputManager() {
		return InputManager.getInstance();
	}

	/**
	 * Controls access to the file manager.
	 * 
	 * @return Application file manager.
	 */
	public static FileManager getFileManager() {
		return FileManager.getInstance();
	}

	/**
	 * Controls creation of new cooldowns.
	 * 
	 * @param milliseconds
	 *            Duration of the cooldown.
	 * @return A new cooldown.
	 */
	public static Cooldown getCooldown(final int milliseconds) {
		return new Cooldown(milliseconds);
	}

	/**
	 * Controls creation of new cooldowns with variance.
	 * 
	 * @param milliseconds
	 *            Duration of the cooldown.
	 * @param variance
	 *            Variation in the cooldown duration.
	 * @return A new cooldown with variance.
	 */
	public static Cooldown getVariableCooldown(final int milliseconds,
			final int variance) {
		return new Cooldown(milliseconds, variance);
	}
}