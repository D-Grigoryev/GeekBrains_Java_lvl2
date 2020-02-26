package lesson1_homework;

public class Human implements Competitor {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    boolean active=true;

    public Human (String _name, int _maxRunDistance, int _maxJumpHeight ){
     this.name = _name;
     this.maxJumpHeight = _maxJumpHeight;
     this.maxRunDistance = _maxRunDistance;

    }

    public void jump (int Height){
        if (Height < maxJumpHeight )
            System.out.println(this.name+ " успешно перепрыгнул стену " );
        else{
            System.out.println(this.name+ " не смог перепрынгнуть стену " );
            active = false;
        }
    }

    public void run (int Distance){
        if (Distance < maxRunDistance )
            System.out.println(this.name+ " успешно пробежал дистанцию " );
        else{
            System.out.println(this.name+ " не смог пробежать дистанцию " );
            active = false;
        }
    }

    @Override
    public boolean isOndistance() {
        return active;
    }

}
