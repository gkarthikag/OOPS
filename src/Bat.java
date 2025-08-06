public class Bat extends Animal{



    @Override
    public void eat() {

    }

    public Bat() {
    }

    public Bat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" is makingnoise");
    }

    @Override
    public void roam() {

    }
}
