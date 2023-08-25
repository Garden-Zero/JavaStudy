package Pb7_1;

import java.rmi.StubNotFoundException;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i<CARD_NUM; i++) {
            cards[i] = new SutdaCard(i / 2 + 1, false);
            if (i == 1 || i == 5 || i == 15) {
                cards[i].isKwang = true;
            }
        }
    }

    void show(){
        for(int i=0; i<cards.length; i++){
            System.out.print(cards[i].toString()+", ");
        }
        System.out.println();
    }
    void shuffle(){
        for(int i=0; i<cards.length; i++){
            int randInt = (int)(Math.random()*20);
            SutdaCard tmp = cards[0];
            cards[0] = cards[randInt];
            cards[randInt] = tmp;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*20)];
    }
}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Pb7_1{
    public static void main(String[] args){
        SutdaDeck st = new SutdaDeck();
        st.show();
        st.shuffle();
        st.show();
        System.out.println(st.pick(10).toString());
        System.out.println(st.pick().toString());
    }
}
