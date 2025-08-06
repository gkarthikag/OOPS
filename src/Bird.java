public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is chirpling");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" roam or fly");
    }
}
