package com.sachin.base;

public class PlayerList extends Player {
	public PlayerList(String player, int list) {
		super(player, list);
	}

	public static void main(String[] args) {
		Player player3 = new Player("Hardik", 28);
		// player.initMatchs(120);
		player3.initRuns(3000);
		player3.initWickets(80);
		player3.displayAll();

	}

}
