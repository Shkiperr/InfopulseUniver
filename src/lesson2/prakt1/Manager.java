package lesson2.prakt1;

public class Manager extends Emloyee implements Cleaning, Sign {

    public Manager() {
        this.salary = 7000;
    }

    void delegateTo(Worker worker){
        worker.setDelegate(this);
    }

    public void sign(){
        System.out.println("Sined");
    }

}
