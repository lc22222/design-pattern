package practice.designpattern;

/**
 * 饿汉式单例
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton(){}
    public Singleton getInstance(){
        return instance;
    }
}
