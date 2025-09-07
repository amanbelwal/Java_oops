interface A {
   public void show();
}
public class Lambda_prac{
    public static void main(String[] args)
    {
        A obj = () -> System.out.println("in show");
        obj.show();
        return;
    }
}
