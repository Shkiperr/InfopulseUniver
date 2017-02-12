package lesson1.prakt2;

class Emloyee implements Cleaning, Comparable<Emloyee> {

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

