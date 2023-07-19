package dz_OOP2.dz_1;

public class Duck extends Animal implements IRunable, ISwimable, IFlyable{

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfFly() {
        return 21;
    }

    @Override
    public int speedOfSwim() {
        return 6;
    }

    @Override
    public int speedOfRun() {
        return 7;
    }

    @Override
    public String say() {
        return "Кря кря";
    }
}