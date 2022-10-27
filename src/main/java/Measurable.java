package java;

public interface Measurable {
    double getMeasure();

    public static Measurable maximum(Measurable[] objects){
        if(objects.length == 0){
            return null;
        }
        Measurable maximum = objects[0];
        for(Measurable obj: objects){
            if(obj.getMeasure()>maximum.getMeasure()){
                maximum = obj;
            }
        }
        return maximum;
    }
}