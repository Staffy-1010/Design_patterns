package Proxy;

public class Main {
    public static void main(String[] args) {
        MediaProxy m = new MediaProxy();
        String s = m.downloadContent("song - do you know");
        System.out.println(s);
        String s1 = m.downloadContent("song - do you know.mp3");
        System.out.println(s1);
        String s3 = m.downloadContent("song - do you know.mp3");
        System.out.println(s3);
    }
}
