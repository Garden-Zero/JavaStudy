import java.io.PipedInputStream;
import java.text.ParsePosition;

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int pIdx = 0;

    void buy(Product p){
        if(this.money < p.price){
            return;
        }
        this.money -= p.price;
        add(p);
    }

    void add(Product p){
        int cartSize = cart.length;
        if(pIdx+1 == cartSize){
            Product[] tmpCart = new Product[cartSize * 2];
            System.arraycopy(cart, 0, tmpCart, 0, cartSize);
            cart = tmpCart;
        }
        cart[pIdx++] = p;
    }

    void summary(){
        int total = 0;
        for(int i=0; i<pIdx; i++){
            System.out.print(cart[i]+", ");
            total += cart[i].price;
        }
        System.out.println();
        System.out.println("사용금액 :"+ total + " 남은금액 :" + money);
    }

}

class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }

    public String toString(){return "Tv";}
}
class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){return "Computer";}
}
class Audio extends Product {
    Audio(){
        super(50);
    }

    public String toString(){return "Audio";}
}
public class Pb7_19 {
    public static void main(String[] args){
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
