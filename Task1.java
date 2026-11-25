public class Task1 {
    private int x;
    private int y;

    public Task1() {
        this.x = 0;
        this.y = 0;
    }

    public Task1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt((double) x * x + (double) y * y);
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Task1 p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt((double) dx * dx + (double) dy * dy);
    }

    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    public static void main(String[] args) {
        Task1 p1 = new Task1(5, 3);
        System.out.println("Initial p1: " + p1);
        System.out.println("Distance from origin: " + p1.distanceFromOrigin());

        p1.translate(2, 1);
        System.out.println("After translate(2, 1): " + p1);

        p1.setLocation(0, 0);
        System.out.println("After setLocation(0, 0): " + p1);

        Task1 p2 = new Task1(3, 4);
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
    }
}