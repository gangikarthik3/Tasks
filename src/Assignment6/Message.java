package Tasks.src.Assignment6;

public class Message {
    public static void staticMethod()
    {
        System.out.println("It is a static method");
    }
    public void dynamicMethod()
    {
        System.out.println("It is a dynamic method");
    }
    public static void main(String args[])
    {
        Message.staticMethod();
        Message m = new Message();
        m.dynamicMethod();
    }
}
