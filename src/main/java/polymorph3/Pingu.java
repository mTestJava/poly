package polymorph3;

public class Pingu extends Animal {
    String name = "myPingu" ;
    public void printName() {
        System.out.println(" Name of animal is " + name + " . Age is " + age);
    }

    @Override
    public void makeNoise() {
        System.out.println(" hello hello");
    }
}
