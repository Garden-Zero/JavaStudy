abstract class Player{
    boolean pause;
    int currentPos;
    Player(){
        pause = false;
        currentPos = 0;
    }
    abstract void play(int pos);
    abstract void stop();
    void play(){
        play(currentPos);
    }

    void pause() {
        if (pause) {
            pause = false;
            play();
        } else {
            pause = true;
            stop();
        }
    }
}

class CdPlayer extends Player{
    CdPlayer(){
        super();
    };
    void play(int pos){
        System.out.println("CD의 " + pos + "번째 음악이 재생 중 입니다.");
    }
    void stop(){
        System.out.println("CD의 재생을 멈췄습니다." );
    }
}
public class AbstractPlayer{
    public static void main(String[] args){
        CdPlayer cd = new CdPlayer();
        cd.play();
    }
}
