//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Bat("batt");
        animal.makeNoise();

        Bird bird = new Bird("bird_name");
        bird.makeNoise();
        bird.roam();

        Dog dog = new Dog();
        dog.eat();
        dog.roam();
        dog.setName("puppy");
        System.out.println( dog.getName());


//        Animal an = new Cat("cat_name");
//        an.makeNoise();
//       // an.jump(); not possible hence follow below one
//        Cat c = (Cat)an;
//        c.jump();
//
//         AnimalUtils util = new AnimalUtils();
//         util.addanimal(bird);
//         util.addanimal(dog);




//         Animal A = new Animal();
//        Animal A1 = new Animal("Dog");
//        System.out.println(A.getName());
//        A.eat();
//        A.makeNoise();
//        A.roam();
//
    }


}