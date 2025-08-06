public abstract class Animal {
     private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        System.out.println("Non-Parameterized Constructor ");
    }
    public Animal(String name){
        this.name = name;
    }
    public abstract void eat();
    public abstract void makeNoise();

    public void sleep(){
        System.out.println("Sleeping");
    }
    public abstract void roam();

}
