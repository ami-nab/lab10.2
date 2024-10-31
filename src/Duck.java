public class Duck implements Swimmable,Flyable,Living{
    public void fly() {
        System.out.println("Duck id flying");
    }
    public void stopFlying(){
        System.out.println("Duck stopped flying");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void stopSwimming(){
        System.out.println("Duck stopped swimming");
    }
}
