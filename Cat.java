package Animal;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age){
        super(name,age);
    }
    public void isIndoor(boolean isindoor){
        if (isindoor){
            this.indoor = true;
        }
        else{
            this.indoor = false;
        }
    }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        if(indoor){
            return "Name: " + name + ", Age: " + age + ". It is an indoor cat";
        }
        else{
            return "Name: " + name + ", Age: " + age + ". It is not an indoor cat";
        }

    }
}