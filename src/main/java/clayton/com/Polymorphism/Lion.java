package clayton.com.Polymorphism;

public class Lion extends Animal implements Type {

    String sound;
    String type;

    public Lion(String sound) {

        this.sound = sound;
        this.type = type();

    }

    @Override
    public String sound(){

        return super.sound() + " rrrrr!";

    }

    @Override
    public String type(){

        return "mammal";

    }

}
