public class Dog implements Animal{
    String name;
    int age;

    public Dog(){

        this.name = "Monica ";
        this.age = 19;

    }
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void dogNames(){
        //Local Variable of Type String
        String[] names;

        names = new String[4];//declaring a variable named names of type String and assigning a new array to the names variable
        names[0] = "Skelem";
        names[1] = "Victoria";
        names[2] = "Kenosi";
        names[3] = "Samantha";
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
//        for (String name : names){
//            System.out.println(name);
//        }

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

    /*public String toString() {
        return "name = " + name + "" + "age = " + age;
    }*/

    @Override
    public void makeNoise() {
        System.out.println("Dog Barking");
    }

    @Override
    public void poop() {
        System.out.println("prprprprprp");
    }
}
