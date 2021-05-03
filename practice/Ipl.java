class Ipl {
String name;
String nickname;
String team;

void captain() {
System.out.println(nickname +" " + name +" is captain of " + team +"." );
}

public static void main (String[] args) {
Ipl virat_kohli = new Ipl();
virat_kohli.name= "virat kohli";
virat_kohli.nickname= "king";
virat_kohli.team = "rcb";

Ipl rohit = new Ipl();
rohit.name= "rohit sharma";
rohit.nickname= "hitman";
rohit.team = "MI";


virat_kohli.captain();
rohit.captain();

}
}