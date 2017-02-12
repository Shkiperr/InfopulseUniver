package lesson3.prakt2;

class Car {
    private String name;
    private int carCase;
    private int doors;
    private int wheels;
    private int windows;
    private boolean drawing;

    static class Builder{
        private String name;
        private int carCase = 1;
        private int doors = 0;
        private int wheels = 0;
        private int windows = 0;
        private boolean drawing = false;

        Builder(String name) {
            this.name = name;
        }

        Builder setCarCase(int carCase){
            this.carCase = carCase;
            return this;
        }

        Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        Builder setDrawing(boolean drawing) {
            this.drawing = drawing;
            return this;
        }

        Car finalCar(){
            return new Car(this);
        }
    }

    Car(Builder builder) {
        this.name = builder.name;
        this.carCase = builder.carCase;
        this.doors = builder.doors;
        this.wheels = builder.wheels;
        this.windows = builder.windows;
        this.drawing = builder.drawing;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carCase=" + carCase +
                ", doors=" + doors +
                ", wheels=" + wheels +
                ", windows=" + windows +
                ", drawing=" + drawing +
                '}';
    }
}

