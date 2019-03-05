import java.awt.EventQueue;
import java.io.IOException;

import controllers.GameController;
import controllers.MapController;
import controllers.StartUp;

public class Game {
	/**
	 * This is the main method.
	 * */
	public static void main(String args[]) throws IOException {
		// Logs
		System.out.println("Start Game");
		// map data extraction
		MapController mapController = new MapController();
		mapController.generateMap();
		// Controller calls
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameController controller = new GameController();
					controller.showHomeView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("end");
	}
}

