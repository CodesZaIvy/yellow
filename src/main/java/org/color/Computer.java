package org.color;

public class Computer {
    private String make;
    private String model;
    private int year;

    Computer(String make,String model ,int year ){
            //this.make = make;
        //instead of this when using setters
        this.setMake(make);
           this.setModel(model);
            this.setYear(year);
    }
        // To access/retrieve private attributes
    //Use getters
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
    public String getModel(){
        return model;
    }
    //To set or modify the value of a private variable.
     // Creating Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void copy(Computer x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }

}