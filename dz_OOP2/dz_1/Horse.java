package dz_OOP2.dz_1;

public class Horse extends Animal implements IRunable{

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfRun() {
        return 30;
    }

    @Override
    public String say() {
        return "Игого";
    }
}