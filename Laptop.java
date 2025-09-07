enum Laptop{
    MacBook(2000),Dell(1500),Hp(1000);
    private int price;
    private Laptop(int price)
                {
                  this.price = price;
                }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Demo {
     public static void main(String[] args)
     {
         Laptop s = Laptop.MacBook;
         s.setPrice(100);
         for(Laptop t : Laptop.values())
         {
             System.out.println(t + " :" + t.getPrice());
         }

     }
}
