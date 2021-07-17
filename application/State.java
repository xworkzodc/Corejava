class State {
	String name;
	String capitalCity;
	
	State(String name, String capitalCity)
	{
		this.name=name;
		this.capitalCity=capitalCity;
		
	}
	
	void stateProperties()
	{
		System.out.println("State name "+this.name);
		System.out.println("State Capitalcity "+this.capitalCity);
	}
}