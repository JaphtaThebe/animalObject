public interface Animal {

    //it is not mandatory to explicitly write the keyword static because it is redundant in the interface(static fields in the interface are implicitly public static final)
    static String gender = "Female";//static variable

    void makeNoise();//this is abstract method that must be implemented by the implementing classes
    void poop();
    default void run(){//default method,default methods can be overridden otherwise implementing classes will use the default method defined in the interface
        System.out.println("Animal Running");
    }
    static void animalsEat(){//static method that belong to the interface and can be called using the Interface name without creating an object
        System.out.println("Eating Food");
    }

}
