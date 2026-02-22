package Animal;

public class Animal {
    protected String name;
    protected int age;
    protected static int numberOfAnimal;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        numberOfAnimal++;
    }
    public int getNumberOfAnimal(){
        return numberOfAnimal;
    }
    public void changeName(String newname){
        this.name = newname;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void makeSound(){
        System.out.println("Aaaaaa");
    }
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

