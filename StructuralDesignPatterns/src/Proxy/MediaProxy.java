package Proxy;

import java.util.HashSet;

public class MediaProxy implements SocialMedia{
    public static final HashSet<String> downloads = new HashSet<>(6);
    public final Youtube youtube = new Youtube();

    @Override
    public String downloadContent(String s){
        if(downloads.contains(s)){
            System.out.println("already downloaded");
            return s;
        }
        else {
            String downloadedContent = youtube.downloadContent(s);
            downloads.add(downloadedContent);
            return "complete";
        }
    }
}
