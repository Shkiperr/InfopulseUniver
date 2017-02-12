package lesson2.prakt1;

class Detail implements Cloneable{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Detail(String name) {
        this.name = name;
    }

    Detail(Detail otherDetail){
        this.setName(otherDetail.getName());
    }

    public Detail clone() throws CloneNotSupportedException{
        Detail cloned = (Detail) super.clone();
        return cloned;
    }
}
