package lesson1.prakt2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager();

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        Emloyee [] emloyesArray = new Emloyee[3];

        emloyesArray[0] = new Manager();
        emloyesArray[1] = new BigBoss();
        emloyesArray[2] = new Worker();

        Arrays.sort(emloyesArray);

        for (Cleaning c : emloyesArray){
            c.cleaning();
        }


        manager1.delegateTo(worker1);
        worker1.sign();

        System.out.println(Arrays.toString(emloyesArray));

    }
}
