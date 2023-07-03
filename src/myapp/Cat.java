package myapp;

public class Cat extends Dog{

    private String name;
    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
