package pack_2;

public class Class_2 {

    public static void main(String[] args) {
        bar2();
    }

    public static void bar2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Class_2.class.getName());
        }
    }
}
