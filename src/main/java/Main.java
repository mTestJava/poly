
import polymorph1.Animal;
import polymorph1.Cat;
import polymorph1.Pingu;
import polymorph5.AnimalGeneric;
import polymorph6.Animalgeneric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal a1= new Animal();
//        a1.printName();
//        Cat c1= new Cat();
//        c1.printName();
//        Pingu p1= new Pingu();
//        p1.printName();


//        Animal a1= new Animal();
//        a1.printName();
//        Cat c1= new Cat();
//        c1.printName();
//        Pingu p1= new Pingu();
//        p1.printName();

//        Animal a1= new Animal();
//        a1.printName();
//        Cat c1= new Cat();
//        c1.printName();
//        c1.makeNoise();
//        Pingu p1= new Pingu();
//        p1.printName();
//        p1.makeNoise();

//        List<Animal> l1 = new ArrayList<>();
//        l1.add(new Animal());
//        l1.add(new Cat());
//        l1.add(new Pingu());
//
//        l1.forEach(ele->{
//            System.out.println(ele.toString());
//        });

        AnimalGeneric<Integer> intObj = new AnimalGeneric<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());
        AnimalGeneric<String> strObj = new AnimalGeneric<>("Hello");
        System.out.println("Generic Class returns: " + strObj.getData());

//        Animalgeneric   gen = new Animalgeneric();
//        gen.printName("Java Programming");
//
//        // generics method working with integer
//        gen.printName(25);

    }
}