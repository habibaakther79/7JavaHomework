public class Task2 {
    private Task1 p1;
    private Task1 p2;

    public Task2() {
        this.p1 = new Task1(0, 0);
        this.p2 = new Task1(0, 0);
    }

    public Task2(Task1 p1, Task1 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Task1 getP1() {
        return p1;
    }

    public void setP1(Task1 p1) {
        this.p1 = p1;
    }

    public Task1 getP2() {
        return p2;
    }

    public void setP2(Task1 p2) {
        this.p2 = p2;
    }

    public double getLength() {
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "Line[start=" + p1 + ", end=" + p2 + "]";
    }

    public static void main(String[] args) {
        Task2 defaultLine = new Task2();
        System.out.println("Default line: " + defaultLine + ", length: " + defaultLine.getLength());

        Task2 line = new Task2(new Task1(1, 2), new Task1(4, 6));
        System.out.println("Line: " + line + ", length: " + line.getLength());

        line.setP2(new Task1(7, 10));
        System.out.println("Updated line: " + line + ", length: " + line.getLength());
    }
}