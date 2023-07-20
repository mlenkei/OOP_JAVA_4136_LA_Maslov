package dz_OOP2.dz_1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<The_brute> animals;
    private Owner owner = new Owner();

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public Zoo addAnimal(The_brute animal){
        this.animals.add(animal);
        return this;
    }

    public List<ISpeakable> getISpeakable(){
        List<ISpeakable> answer = new ArrayList<>();

        for (The_brute animal : animals){
            answer.add(animal);
        }

        answer.add(owner);

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
        for (The_brute animal : animals){
            if (animal instanceof IRunable){
                result.add((IRunable) animal);
            }
        }
        return result;

    }

    public List<IFlyable> getIFlyable(){
        List<IFlyable> result = new ArrayList<>();
        for (The_brute animal : animals){
            if (animal instanceof IFlyable){
                result.add((IFlyable) animal);
            }
        }
        return result;

    }

    public List<ISwimable> getISwimable(){
        List<ISwimable> result = new ArrayList<>();
        for (The_brute animal : animals){
            if (animal instanceof ISwimable){
                result.add((ISwimable) animal);
            }
        }
        return result;

    }

    public  List<The_brute> getAnimal() {
        return animals;
    }

    public IFlyable[] getIFlyable() {
        return null;
    }
}