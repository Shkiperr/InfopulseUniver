package lesson3.prakt1;

class Workers {

    private String experience;

    Workers(String experience) {
        this.experience = experience;
    }

    void createDetail(Agregat x){
        switch (experience){
            case "low":
                x.createAgregat(new Detail("1"));
            break;
            case "medium":
                x.createAgregat(new Detail("1"), new Detail("2"), new Detail("3"));
                //x.createAgregat(new Detail("2"));
                //x.createAgregat(new Detail("3"));
                //new Detail("1");
                //new Detail("2");
                //new Detail("3");
            break;
            case "high":
                x.createAgregat(new Detail("1"),new Detail("2"),new Detail("3"),new Detail("4"),new Detail("5"));
                //x.createAgregat(new Detail("2"));
                //x.createAgregat(new Detail("3"));
                //x.createAgregat(new Detail("4"));
                //x.createAgregat(new Detail("5"));
                //new Detail("1");
                //new Detail("2");
                //new Detail("3");
                //new Detail("4");
                //new Detail("5");
        }
    }
}
