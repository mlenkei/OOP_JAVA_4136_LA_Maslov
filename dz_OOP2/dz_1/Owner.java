package dz_OOP2.dz_1;

public class Owner implements ISpeakable, ISwimable {
    
    private String name;

    // public Owner(String name) {
    //     this.name = name;
    // }

    @Override
    public String say() {
        return "Всем привет";
    }
    @Override
    public int speedOfSwim() {
        return 10;
    }
}


