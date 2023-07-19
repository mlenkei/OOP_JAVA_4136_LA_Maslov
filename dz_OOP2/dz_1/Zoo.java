package dz_OOP2.dz_1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public Zoo addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }

    public List<ISpeakable> getISpeakable(){
        List<ISpeakable> answer = new ArrayList<>();

        for (Animal animal : animals){
            answer.add(animal);
        }

        answer.add(radio);

        return answer;
    }

    public int getChampionOfRunners(){
        int result = 0;

        List<IRunable> list = getIRunable();
        for (IRunable runable : list){
            if (runable.speedOfRun() > result){
                result = runable.speedOfRun();
            }
        }

        return result;
    }

    public List<IRunable> getIRunable(){
        List<IRunable> result = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof IRunable){
                result.add((IRunable) animal);
            }
        }
        return result;

    }

    public List<IFlyable> getIFlyable(){
        List<IFlyable> result = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof IFlyable){
                result.add((IFlyable) animal);
            }
        }
        return result;

    }

    public List<ISwimable> getISwimable(){
        List<ISwimable> result = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof ISwimable){
                result.add((ISwimable) animal);
            }
        }
        return result;

    }

    public  List<Animal> getAnimal() {
        return animals;
    }

    public IFlyable[] getIFlyable() {
        return null;
    }
}