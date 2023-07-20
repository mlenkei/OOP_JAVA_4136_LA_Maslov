package dz_OOP2.dz_1;

public class Ram extends The_brute implements IRunable, ISwimable{
    private String wool;
    public Ram(String name, int box, String wool) {
        super(name, box);
        this.wool = wool;
    }
    @Override
    public int speedOfSwim() {
        return 5;
    }
    @Override
    public int speedOfRun() {
        return 8;
    }

    @Override
    public String say() {
        return "Бее бее";
    }
    @Override
    public String toString() {
        return String.format("Ram: %s, wool: %s", super.toString(), this.wool);
    }
}
