package dz_OOP2.dz_1;

public class Dog extends Animal implements IRunable{

    public Dog(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public String say() {
        return "Гав";
    }
}
