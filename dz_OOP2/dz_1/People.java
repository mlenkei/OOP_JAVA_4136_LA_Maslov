package dz_OOP2.dz_1;

public abstract class People implements ICapital {

    private String name;
    private int an;

    public People(String name, int an) {
        this.name = name;
        this.an = an;
    }

    @Override
    public String toString() {
        String text = String.format("name: %s, an: %d", this.name,  this.an);

        return text;
    }

    public abstract String say();
}
