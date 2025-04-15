public class Name {
    private static Name instance;
    private String name = "Staffy";
    private Name(){

    }
    //synchronized if thread safety is required
    public static synchronized Name getInstance(){
        if(instance == null){
            instance = new Name();
        }
        return instance;
    }

    public String getName(){
        return name;
    }
}
