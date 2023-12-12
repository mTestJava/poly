package polymorph1;

public class Cat extends Animal{

    public void printName() {
        name = "myCat" ;
        System.out.println(" Name of animal is " + name + " . Age is " + age);
    }

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
