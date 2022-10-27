package java;

public class Country implements Measurable{
    String name;
    double size;

    public Country(String name, double size){
        this.name = name;
        this.size = size;
    }
    @Override
    public double getMeasure(){
        return size;
    }
}