public class Dog implements Animal{
    String name;
    int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog Barking");
    }

    @Override
    public void poop() {
        System.out.println("prprprprprp");
    }
}
