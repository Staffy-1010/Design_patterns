package Adapter;

public class MessageAdapter {
    Message mByte = new ByteMessageAdapter();
    Message mJson = new JsonMessageAdapter();

    MessageAdapter(){
    }

    public void getMsg(){
        //Conversion Logic here
        mByte.getMessage();
        mJson.getMessage();
    }
}
