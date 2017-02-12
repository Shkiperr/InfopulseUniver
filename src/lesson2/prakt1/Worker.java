package lesson2.prakt1;

class Worker extends Emloyee implements Dig, Sign, Cloneable{

    private Sign delegate;

    Skills brains;

    class Skills {
        PhisicSkills phisicSkills;
        int knowlegeLevel;

        class PhisicSkills {
            String[] phisicKnowlege = {};

            public void setPhisicKnowlege(String[] phisicKnowlege) {
                this.phisicKnowlege = phisicKnowlege;
            }

            public PhisicSkills createPhisicSkills(){
                return new  PhisicSkills();
            }

            public PhisicSkills clone() throws CloneNotSupportedException{
                PhisicSkills cloned = (PhisicSkills) super.clone();
                return cloned;
            }
        }

        public void setKnowgeLevel(int knowgeLevel) {
            this.knowlegeLevel = knowlegeLevel;
        }

        public int getKnowlegeLevel() {
            return knowlegeLevel;
        }

        public PhisicSkills createPhisicSkills(){
            return new  PhisicSkills();
        }

        @Override
        public Skills clone() throws CloneNotSupportedException{
            Skills cloned = (Skills) super.clone();
            return cloned;
        }


    }

    public Skills createSkills(){
        return new  Skills();
    }

    /*public Worker clone() throws CloneNotSupportedException{
        Worker cloned = (Worker) super.clone();
        return cloned;
    }*/



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
