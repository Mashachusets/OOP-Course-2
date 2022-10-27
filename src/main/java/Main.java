package java;

public class Main {
    public static void main(String[] args) {
        Measurable[] countries = new Measurable[5];
        countries[0] = new Country("Lithuania", 65300);
        countries[1] = new Country("Brazil", 8516000);
        countries[2] = new Country("Liechtenstein", 160);
        countries[3] = new Country("Ukraine", 600000);
        countries[4] = new Country("China", 9597000);

        Measurable maxCountry = Measurable.maximum(countries);
        System.out.println("Largest country is " + maxCountry + " with maximum size: " + maxCountry.getMeasure());
    }
}