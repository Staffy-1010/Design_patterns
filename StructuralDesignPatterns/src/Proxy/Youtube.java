package Proxy;

public class Youtube implements SocialMedia{

    @Override
    public String downloadContent(String s) {
        System.out.println("This file is Downloading - " + s);
        return s;
    }
}
