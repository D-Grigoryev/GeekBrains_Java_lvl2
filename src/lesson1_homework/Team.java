package lesson1_homework;

public class Team  {
    String Nameteam;
    Competitor [] players;
    Competitor [] getMembers () {return players;};

    public Team(String Nameteam, Competitor... players) {
        this.Nameteam = Nameteam;
        this.players=players;
    }
    public void TeamInfo(){
    System.out.println("Команда " +this.Nameteam+ " выходит на полосу препятствий! Поприветсвуем их!!!!");
    }
}