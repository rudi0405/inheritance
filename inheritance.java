public class inheritance {
    String name;
    public void eat() {
        System.out.println("I am an animal");
        System.out.println("My name is" + name);
    }

}
class Dog extends Animal {
    String name;

    public void display() {
        System.out.println("My name is" + name);
    }

    public void eat() {
    }
}
class Main {
     public static void main(String[] args) {
         Dog dog1 = new Dog();
         dog1.name = "Fenton";
         dog1.eat();

         dog1.display();

     
        
    }
}        
