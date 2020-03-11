package lesson1_homework;

    public class wall extends Obstacles{
      int Height;
    public wall (int _Height) {
        this.Height = _Height;
}

        @Override
        public void Doit(Competitor competitor) {
            competitor.jump(Height);
        }
    }
