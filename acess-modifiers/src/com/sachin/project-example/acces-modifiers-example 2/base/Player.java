package com.sachin.base;

public class Player {
	public String name;
	public int age;
	int match;
	int run;
	int wicket;

	public Player(String name, int age) {
		System.out.println("invoked player name and age");
		this.name = name;
		this.age = age;
	}

	private void initMatchs(int match) {
		System.out.println("invoked method initMatchs");
		this.match = match;
	}

	void initRuns(int run) {
		System.out.println("invoked method initRuns");
		this.run = run;
	}

	protected void initWickets(int wicket) {
		System.out.println("invoked method initWickets");
		this.wicket = wicket;
	}

	public void displayAll() {
		System.out.println("player name " + this.name);
		System.out.println("age " + age);
		System.out.println("match " + match);
		System.out.println("run " + run);
		System.out.println("wicket " + wicket);
	}

	public static void main(String[] args) {
		Player player1 = new Player("Rishab", 24);
		player1.initMatchs(80);
		player1.initRuns(4000);
		player1.initWickets(2);
		player1.displayAll();
	}
}
