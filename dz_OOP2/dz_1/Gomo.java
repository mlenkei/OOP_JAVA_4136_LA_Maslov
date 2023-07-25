package dz_OOP2.dz_1;

import java.util.ArrayList;
import java.util.List;

public class Gomo {
    private List<People> peoples;

    public Gomo() {
        this.peoples = new ArrayList<>();
    }

    public Gomo addPeople(List<People> people){
        this.peoples.add(people);
        return this;
    }
    public List<ICapital> getICapital(){
        List<ICapital> result = new ArrayList<>();
        for (People people : peoples){
            if (people instanceof ICapital){
                result.add((ICapital) people );
            }
        }
        return result;

    }

    public List<People> getPeople() {
        return peoples;
    }

    public void addPeople(Owner1 owner1) {
    }

    public void addPeople(Owner2 owner2) {
    }

}
