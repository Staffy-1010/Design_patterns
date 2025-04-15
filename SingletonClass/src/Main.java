public class Main {
    public static void main(String[] args) {
//        Name n = Name.getInstance();
//        Name s = Name.getInstance();
//        Name t = Name.getInstance();
//        System.out.println(t == s);
//        System.out.println(s.getName());
//        System.out.println(t.getName());

        Names n = Names.INSTANCE;
        Names s = Names.INSTANCE;

        System.out.println(s==n);
        System.out.println(n.getName());
        System.out.println(s.getName());
        s.setName("Staffy");
        System.out.println(n.getName());
        System.out.println(s.getName());

    }
}