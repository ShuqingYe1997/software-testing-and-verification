package programmerhotel;

public class CityClock extends Clock {
    private int localTime;

    public CityClock(int offset){
        super(offset);
        localTime=0;
    }

    public void setLocalTime(int utcTime) {
        localTime = utcTime+getOffset();
        localTime=(localTime+24)%24;
    }

    public int getLocalTime(){
        return localTime;
    }
}
