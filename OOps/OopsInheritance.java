package OOps;

public class OopsInheritance {
    public static void main(String[] args) {
        Fish whale= new Fish();
        whale.eat();
    }
    
}
class Animal{
    String Color;
    public void eat(){
        System.out.println("eats rice");
    }
    public void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void Swim(){
        System.out.println("swim in lake");
    }
}
