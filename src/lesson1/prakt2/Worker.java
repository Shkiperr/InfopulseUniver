package lesson1.prakt2;

class Worker extends Emloyee implements Dig, Sign{

    private Sign delegate;

    Worker() {
        this.salary = 3000;
    }

    public void dig(){
        System.out.println("Digging");
    }

    @Override
    public void sign() {
        if (delegate != null){
            delegate.sign();
        }
    }

    void setDelegate(Sign delegate) {
        this.delegate = delegate;
    }
}
