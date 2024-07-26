enum Laptop{
    Mac(2000),Dell(1300),HP(3000),Pavalion(1000);

private int price ;

private Laptop(int price) {
    this.price = price;
}

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}

}

public class java7_enum
{
    // enum Status {
    //     pending,running,success,failed;
    // }
    public static void main(String[] args) {
        // Status s=Status.running;
        // System.out.println(s);
Laptop lp[]=Laptop.values();
for (int i=0;i<lp.length;i++)
{

    System.out.println(lp[i] +":" + lp[i].getPrice());
}
    }
    
}

