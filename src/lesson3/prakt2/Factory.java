package lesson3.prakt2;

public class Factory {
    public static void main(String[] args) {

        Worker petr = new Worker();
        Worker dima = new Worker();
        Worker drawer = new Worker();
        Worker master = new Worker();

        Car.Builder zz = petr.createZz("Lanos");
        petr.addCarCase(zz);
        petr.addDoors(zz);
        dima.addWheels(zz);
        dima.addWindows(zz);
        drawer.drawIt(zz);
        Car x = master.createCar(zz);

        System.out.println(x);
    }
}
