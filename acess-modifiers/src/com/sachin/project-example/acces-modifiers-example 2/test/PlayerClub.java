package com.sachin.test;

import com.sachin.base.Player;

public class PlayerClub extends Player {

	public PlayerClub(String name, int age) {
		super(name, age);
	}

	public static void main(String[] args) {
		Player player4 = new Player("Rahul", 29);
		// player4.initMatchs(180);
		// player4.initRuns(8000);
		//player4.initWickets(10);
		player4.displayAll();

	}
@Override
protected void initWickets(int wicket) {
	super.initWickets(wicket);
}
}
