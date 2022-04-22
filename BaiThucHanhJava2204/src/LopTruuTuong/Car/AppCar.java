package LopTruuTuong.Car;

public class AppCar {
    public static void main(String[] args) {
        car tx = new taxicar();
        tx.move();
        tx.stop();
        tx.turnright();
        tx.turnleft();
        tx.reverse();

    }
}
