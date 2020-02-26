package lesson1_homework;

public class Cross {
Obstacles [] obstacles;

public Cross (Obstacles... _obstacles){
    this.obstacles = _obstacles;
  }
 public void doIt(Team team) {
        for (Competitor a : team.getMembers()){
            for (Obstacles o : obstacles){
                o.Doit(a);
                if (!a.isOndistance());
            }
        }
    }
    }

