import javax.swing.text.html.HTML;

public class Pb9_5{
    public static int count(String src, String target){
        int count = 0;
        int pos = 0;

        for(int fIdx = src.indexOf(target, pos); fIdx != -1; fIdx = src.indexOf(target, pos)){
            count++;
            pos = fIdx + target.length();
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println((count("12345AB12AB345AB", "AB")));
        System.out.println(count("12345", "AB®"));
    }
}
