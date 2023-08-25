class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv2(){
        this.isPowerOn = false;
        this.channel = 1;
        this.volume = 10;
        this.prevChannel = 1;
    }
    public void powerBtn(){
        isPowerOn = !isPowerOn;
    }

    public void setChannel(int channelNum){
        if(!isPowerOn || channelNum<MIN_CHANNEL || channelNum>MAX_CHANNEL){
            return;
        }
        this.prevChannel = this.channel;
        this.channel = channelNum;
    }
    public int getChannel(){
        if(!isPowerOn){
            return -1;
        }
        return this.channel;
    }
    public void setVolume(int volumeNum){
        if(!isPowerOn || volumeNum<MIN_VOLUME || volumeNum>MAX_VOLUME){
            return;
        }
        this.volume = volumeNum;
    }
    public int getVolume(){
        if(!isPowerOn){
            return -1;
        }
        return this.volume;
    }
    public void gotoPrevChannel(){
       setChannel(prevChannel);
    }
}

public class Pb7_10 {
    public static void main(String[] args){
        MyTv2 t = new MyTv2();

        t.powerBtn();
        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setVolume(20);
        System.out.println("volume: " + t.getVolume());
        t.setChannel(20);
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());;
    }
}
