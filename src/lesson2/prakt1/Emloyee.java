package lesson2.prakt1;

class Emloyee implements Cleaning, Comparable<Emloyee>, Cloneable {

    int salary;


    @Override
    public void cleaning() {
        System.out.println(this + " clean with " + Materials.WATER + " by " + Instruments.BUCKET);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int compareTo(Emloyee e) {
        return this.salary > e.salary ? 1 : -1;
    }
}

