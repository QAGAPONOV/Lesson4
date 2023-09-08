package src;

public class Game {
        private String attraction;
        public int time;
        public int price;
        private Shooting shoot = new Shooting(10, 20);
        public Game(String attraction, int time, int price) {
            this. attraction = attraction;
            this.time = time;
            this. price = price;
        }
        private class Shooting {
            public int shot;
            public int pause;

            public Shooting(int shot, int pause) {
                this. shot = shot;
                this. pause = pause;
            }
        }

}
