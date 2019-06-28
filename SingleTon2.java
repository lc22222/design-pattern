package practice.designpattern;

public class SingleTon2 {
    private SingleTon2(){

    }
    private static class HolderClass{
        private static final SingleTon2 instance = new SingleTon2();
    }
    public SingleTon2 getInstance(){
        return HolderClass.instance;
    }
}
