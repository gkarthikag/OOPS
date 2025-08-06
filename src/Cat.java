public class Cat extends Animal{
    public void makeNoise(){
        System.out.println("Cat is making noise");
    }

    @Override
    public void roam() {

    }

    public void jump(){
        System.out.println("billi is jumping");
    }
    public  Cat(String name){
        super(name);
    }

    @Override
    public void eat() {

    }
}
