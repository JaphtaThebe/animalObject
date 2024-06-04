public class Cat implements Animal {

    private String name;//instance variable name of type String
    private int age;//instance variable of type primitive int

   /* void setAnimalInstances(){//method to initialize cat instances
        this.name = "Laura";
        this.age = 5;
    }*/
   /*    void printInstances(){//method to print the instances of cat
        System.out.println(this.name);
        System.out.println(this.age);
    }*/
    public Cat(){//Constructor with empty args
        this.name = "Laura";// this refers to the current instance of Cat
        this.age = 5;
        System.out.println();
    }
    public Cat(String name,int age){//Constructor with 2 args
        this.name = name;
        this.age = age;
        System.out.println();
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }

    @Override
    public void poop() {
        System.out.println("Poop then hide");
    }
    @Override
    public String toString() {//overridden toString method to return a string representation of object cat
        return "cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
   /* public String toString() {
        return "name = " + name + "" + "age = " + age;
    }*/
}
