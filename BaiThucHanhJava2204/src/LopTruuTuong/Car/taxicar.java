package LopTruuTuong.Car;

public class taxicar implements car {
    public void move() {
        System.out.println("Di chuyen");
    }

    public void stop() {
        System.out.println("Dung lai");
    }

    public void turnright() {
        System.out.println("Re phai");
    }

    public void turnleft() {
        System.out.println("Re trai");
    }

    public void reverse() {
        System.out.println("Quay dau");
    }
}
