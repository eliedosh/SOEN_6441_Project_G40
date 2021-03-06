package main.utills;

/**
 * this class contains the constatnt names and numbers in game
 */
public class GameConstants {
    // Constant Variables across the project
    public static final int MAXIMUM_NUMBER_OF_PLAYERS = 6;
    public static final int MINIMUM_NUMBER_OF_PLAYERS = 2;
    public static final int INITIAL_NUMBER_OF_UNITS = 0;

    // Constant Strings
    public static final String PROJECT_TITLE = "Risk - SOEN 6441 Porject - Group # 40";
    public static final String GAME_TITLE = "Risk Game";

    // some other string
    public static final String SELECT_PLAYERS = "Select the number of players";
    public static final String PLACE_ARMY = "Place your armies in any of your countries";

    public static final String SAVE_GAME_CONFIRMATION = "Do you wish to save this game?";
    public static final String SAVE_GAME_CONFIRMATION_DESCRIPTION = "You can save the game and continue it later.";
    public static final String SAVE_GAME_ERROR = "Something Went Wrong, Your game is not saved.";
    public static final String LOAD_GAME_ERROR = "Something Went Wrong, This Game cant be loaded.";
    public static final String LOAD_GAME_SELECT_WARNING = "Please Select one file to load the game";

    // error Messages
    public static final String PLAYER_COUNT_ERROR = "Enter a valid Number-Players count should be between 2 and 6";
    public static final String INVALID_PLAYER_COUNT_ERROR = "Please Enter a valid player count between 2 to 6";
    public static final String INVALID_MAP_ERROR = "Enter a valid Map Data";

    public static final String MAP_MSG="Do you want to Start a Game with new map ?";
    public static final String FORTIFY_INVALID_MSG = "Invalid Operation Data";
    public static final String FORTIFY_VALID_MSG = "Fortification Completed";
    public static final String ATTACK_ARMY_SWAP_INVALID_MSG = "You don't have enough army";
    public static final String ATTACK_ARMY_SWAP_VALID_MSG = "Army units swap completed";
    public static final String SELECT_ATTACKER_COUNTRY = "Select one of your countries for attacking";
    public static final String SELECT_DEFENDER_COUNTRY = "Select one of your adjacent countries for attacking";
    public static final String NUMBER_OF_DICES = "Select the number of dices";
    public static final String ROLL_DICE = "Rolling dices";
    public static final String ATTACKER_WIN = "Attacker wins";
    public static final String DEFENDER_WIN = "Defender wins";
    public static final String MAP_FILE_PATH = System.getProperty("user.dir") + "/src/resources/World.map";
    public static final String MAP_IMAGE_FILE_PATH = System.getProperty("user.dir") + "/src/resources/World.bmp";
    public static final String USER_MAP_FILE_PATH = System.getProperty("user.dir") + "/resources/user_map_files/";
    public static final String USER_SAVED_GAMES_PATH = System.getProperty("user.dir") + "/resources/saved_games/";
    public static final String USER_NO_INPUT = "Please enter all the fields to continue";
    // Splitters
    public static final String CONTINENT_DATA_SPLITTER = "=";
    public static final String COUNTRY_DATA_SPLITTER = ",";

    /**
     * constructor for game constants
     */
    public GameConstants() {

    }
}
