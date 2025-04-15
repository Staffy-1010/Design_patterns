package Adapter;

public class JsonMessageAdapter implements Message{
    ByteMessage j = new ByteMessage();

    @Override
    public void getMessage() {
        j.getMessage();
        System.out.println("Converting");
        //Converts byte Msg to json msg
        System.out.println("JsonMessage");
    }
}
