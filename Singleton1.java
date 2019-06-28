package practice.designpattern;

/*
懒汉式
 */

public class Singleton1 {
    private volatile static Singleton1 singleton1 = null;

    private Singleton1() {
    }

    public /*static*/ /*synchronized*/ Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null)
                    singleton1 = new Singleton1();
            }
        }
        return singleton1;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = new Singleton1();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton1 singleton11 = singleton1.getInstance();
                System.out.println(singleton11);
            }).start();
        }
    }
}
