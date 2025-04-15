public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Prototype p = new Student(19112098,"Staffy","NITJ");
        Prototype l = p.clone();
        System.out.println(l.toString());
    }
}