package day6_assignment;


	enum Difficulty {
	    EASY, MEDIUM, HARD
	}

	class Game {
	    private int bullets;
	    private Difficulty difficulty;

	    public Game(Difficulty diff) {
	        this.difficulty = diff;
	        switch (diff) {
	            case EASY -> bullets = 3000;
	            case MEDIUM -> bullets = 2000;
	            case HARD -> bullets = 1000;
	        }
	    }

	    public void start() {
	        System.out.println("Game started with difficulty: " + difficulty);
	        System.out.println("You have " + bullets + " bullets!");
	    }
	}

	public class Difficult_level_game_setup_enum {
	    public static void main(String[] args) {
	        Game easyGame = new Game(Difficulty.EASY);
	        easyGame.start();

	        Game mediumGame = new Game(Difficulty.MEDIUM);
	        mediumGame.start();

	        Game hardGame = new Game(Difficulty.HARD);
	        hardGame.start();
	    }
	}
