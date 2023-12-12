package polymorph3;

public class Cat extends Animal {

    String name = "myCat" ;


    @Override
    public void printName() {
        System.out.println(" Name of animal is " + name + " . Age is " + age);
    }

    @Override
    public void makeNoise() {
        System.out.println(" meow meow ");
    }


}
