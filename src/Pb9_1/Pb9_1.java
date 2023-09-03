public class Pb9_1 {
    public static void main(String[] args){
        SutdaCard2 c1 = new SutdaCard2(3, true);
        SutdaCard2 c2 = new SutdaCard2(3, true);

        System.out.println(c1.equals(c2)+"");
    }
}

class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }
    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj){;
        if(obj instanceof SutdaCard2){
            SutdaCard2 sc = (SutdaCard2)obj;
            return num == sc.num && isKwang == sc.isKwang;
        }
        return false;
    }

    @Override
    public String toString() {
        return num+(isKwang ? "K" : "");
    }
}