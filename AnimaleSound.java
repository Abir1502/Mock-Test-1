
        class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

    class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

    class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

    class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos");
    }
}

    public class AnimaleSound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 

        Dog d = new Dog();
        d.makeSound(); 

        Cat c1 = new Cat();
        c1.makeSound(); 

        Cow c2 = new Cow();
        c2.makeSound(); 
    }
}