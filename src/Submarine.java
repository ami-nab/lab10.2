public class Submarine implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Submarine swims");
    }
    @Override
    public void stopSwimming(){
        System.out.println("Submarine stoped swimming");
    }

}
