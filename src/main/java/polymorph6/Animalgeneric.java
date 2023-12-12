package polymorph6;

public class Animalgeneric {
    String name = "hello";
    int age = 10;

    public <T> void  printName(T data) {
        System.out.println(data.getClass().getName() + " = " + data);
        System.out.println(" Name of animal is " + name + " . Age is " + age + " .  Extra  "+ data.toString());
    }
}
