package lesson1_homework;

public class TestMain {

    public static void main(String[] args) {
       Team team1 = new Team("Dicks", new Human("Vasya", 15, 30),  new Cat("Barsik", 10,2), new Robot("SHELEZYAKA", "R2D2", 3, 7));
       Cross cross1 = new Cross(new wall(3), new treadmill(15));
       team1.TeamInfo();
       cross1.doIt(team1);
    }

}
