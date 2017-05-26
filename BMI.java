package com.company;


public class Main extends factory {
    factory name = new factory();
    factory height = new factory();
    factory weight = new factory();

    public static void main(String[] args) {
       //getInfo();
        calculate regn = new calculate(87,1.83 );
    }
    //Does nothing, this way was over complicating something simple.
    public static void getInfo(){
        factory name = new factory();
        factory height = new factory();
        factory weight = new factory();

        name.setName("Andreas");
        height.setHeightCm(1.83);
        weight.setWeightKg(87);

        name.getName();
        height.getHeightCm();
        weight.getWeightKg();

        //System.out.print("Name: " + name.getName() +"\n" + "Bmi: " + height.getHeightCm() / weight.getWeightKg() * 100);

    }
        //Simplest way I could calculate it
        public static class calculate{
            private final int x;
            private final double y;


            public calculate(int x, double y){
                this.x = x;
                this.y = y;
                double bmi = (x / y / y) * 1 ;
            System.out.print("Bmi: " +bmi + "\n");
        }

    }

}
