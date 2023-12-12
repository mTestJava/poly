

import polymorph1.Animal;
import polymorph1.Cat;
import polymorph1.Pingu;

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

        List<Animal> l1 = new ArrayList<>();
        l1.add(new Animal());
        l1.add(new Cat());
        l1.add(new Pingu());

        l1.forEach(a->{
            System.out.println(a.toString());
        });
    }
}