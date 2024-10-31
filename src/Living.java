public interface Living {
    default void live(){
        System.out.println(getClass().getName()+" lives");
    };
}
