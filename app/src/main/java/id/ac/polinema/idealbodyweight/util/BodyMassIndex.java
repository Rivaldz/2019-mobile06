package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
//    public  static final int MALE = 0;
//    public  static final int FEMALE = 1;

//    private int gender;
    private float mass;
    private int height;
    private float index;

    public  BodyMassIndex( int height){
//        this.gender = gender;
        this.height = height;
        this.index = calcuate();
    }

    public  float getIndex(){
        return index;
    }
    private float calcuate(){
       return (mass/ (height * height));

        }
    }

