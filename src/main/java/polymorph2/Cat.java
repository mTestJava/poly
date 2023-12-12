package polymorph2;

public  class Cat extends Animal{

    String name = "myCat" ;

    @Override
   public void printName() {
        System.out.println(" Name of animal is " + name + " . Age is " + age);
    }

}
