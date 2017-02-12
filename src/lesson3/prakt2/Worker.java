package lesson3.prakt2;

class Worker {

    Car.Builder createZz(String name){
        return new Car.Builder(name);
    }
    void addDoors(Car.Builder zz){
        zz.setDoors(4);
    }

    void addWheels(Car.Builder zz){
        zz.setWheels(4);
    }

    void addCarCase(Car.Builder zz){
        zz.setCarCase(1);
    }

    void addWindows(Car.Builder zz){
        zz.setWindows(6);
    }

    void drawIt(Car.Builder zz){
        zz.setDrawing(true);
    }

    Car createCar(Car.Builder zz){
        return new Car(zz);
    }
}

