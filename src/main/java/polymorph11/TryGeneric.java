package polymorph11;

import polymorph1.Animal;
import polymorph1.Cat;
import polymorph1.Pingu;

import java.util.ArrayList;
import java.util.List;

public class TryGeneric {

    public static void printNames(List<? extends Animal> lists){
        for(Animal s:lists){
            s.printName();//calling method of Animal class by child class instance
        }
    }
    public static void main(String args[]) {
        List<Cat> list1 = new ArrayList<Cat>();
        list1.add(new Cat());

        List<Pingu> list2 = new ArrayList<Pingu>();
        list2.add(new Pingu());
        list2.add(new Pingu());

        printNames(list1);

        printNames(list2);
    }
}
