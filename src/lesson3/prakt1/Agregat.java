package lesson3.prakt1;

import java.util.Arrays;

class Agregat {
    private Detail[] agregat = new Detail[9];
    void createAgregat(Detail d){
        for (int i = 0; i < agregat.length ; i++){
            if (agregat[i] == null){
                agregat[i] = d;
                break;
            }
        }
    }
    void createAgregat(Detail ... d){
        for (int i = 0; i < d.length; i++){
            if (agregat[i] == null){
                agregat[i] = d[i];
            }
        }
    }

    @Override
    public String toString() {
        return "Agregat{" +
                "agregat=" + Arrays.toString(agregat) +
                '}';
    }
}