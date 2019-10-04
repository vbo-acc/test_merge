package pack_2;

public class Class_1 {

    public static void bar1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Class_1.class.getName());
        }
    }

    public static void main(String[] args) {
        bar1();
    }


}
