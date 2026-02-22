package Animal;

public class Dog extends Animal{
    private String breed;
    private boolean trained;
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public void train(){
        trained = true;
        System.out.println(name + " is successfully trained");
    }

    public void sit(){
        if (trained){
            System.out.println(name + " is sitting");
        }
        else{
            System.out.println(name + " doesn't to anything");
        }
    }
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
    }
}
