package Adapter;

public class ByteMessageAdapter implements Message{
    ByteMessage b = new ByteMessage();

    @Override
    public void getMessage() {
        b.getMessage();
    }
}
