public class Tank {
   static final String MODEL = "T34";
   static int ntanks;
   private int x, y;
   private int dir;
   private int fuel;
   private int n;


    public Tank() {
       this(0,0,100);
    }

    public Tank(int x, int y) {
        this(x,y, 100);

    }

    public Tank(int x, int y, int fuel) {
        this.x=x;
        this.y=y;
        this.fuel = fuel;
        n = ++ntanks;
    }


    public void goForward(int i) {
        if (fuel-Math.abs(i)>=0) i=i;
        else if  (i >0) i=fuel;
        else i=-fuel;

       fuel-=Math.abs(i);

        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }


    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + n + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

}