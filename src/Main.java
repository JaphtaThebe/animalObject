public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();//reference variable type Cat,referencing Cat Object type
        cat.setName("Jabu ");
        cat.poop();
        cat.makeNoise();
        System.out.println(cat);
        System.out.println(".....................................................................................");

        Cat cat2 = new Cat("Boby", 20);//second object of cat that accepts 2 args
        cat2.setName("sledge ");
        System.out.println(cat2);
        System.out.println(".....................................................................................");

        Animal animal = new Dog();//reference variable of type Animal, referencing Dog object type
        animal.run();
        animal.makeNoise();
        animal.poop();
        System.out.println(animal.gender);
        System.out.println(".....................................................................................");

        Dog dog = new Dog();//reference variable type Dog,referencing Dog Object type
        dog.makeNoise();
        dog.poop();
        dog.setName("Phoebe");
        dog.dogNames();
        System.out.println(dog);


        System.out.println("Hello world!");
    }
}
