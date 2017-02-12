package lesson2.prakt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Manager manager1 = new Manager();

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
        */

        Detail etalon = new Detail("Bolt");

        try {
            Detail newDetail;

            //System.out.println(etalon.hashCode());

            newDetail = etalon.clone();
            //System.out.println(newDetail.hashCode());

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        Detail otherDetail = new Detail(etalon);
        otherDetail.setName("NewDetail");
        //System.out.println(otherDetail.hashCode());

        String strongPhisicsSkills[] = {"first", "second"};

        Worker oldMan = new Worker();
        System.out.println(oldMan.hashCode());

        oldMan.brains = oldMan.createSkills();
        oldMan.brains.setKnowgeLevel(5);

        oldMan.brains.phisicSkills = oldMan.brains.createPhisicSkills();
        oldMan.brains.phisicSkills.setPhisicKnowlege(strongPhisicsSkills);

        try {
            Worker youngMan = new Worker();
            youngMan.brains = oldMan.brains.clone();
            youngMan.brains.phisicSkills = oldMan.brains.phisicSkills.clone();
            System.out.println(youngMan.hashCode());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}