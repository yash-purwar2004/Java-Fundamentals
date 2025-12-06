public class Lecture2 {
    public static void main(String[] args) {
        String name = "Yash";
        System.out.println(name);

        String a = new String("Yash");
        String b = new String(name);

        String c = "Yash";
        String d = "Yash";
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
