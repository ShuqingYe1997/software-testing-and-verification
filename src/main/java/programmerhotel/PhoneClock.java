package programmerhotel;

import java.util.Map;

public class PhoneClock extends Clock {

    private int time;

    public PhoneClock(int time,int offset){
        super(offset);
        this.time=time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void adjustCityClocks(Map<String,CityClock> cityClocks){
        int utcTime=getUtcTime();
        for(CityClock cityClock:cityClocks.values())
            cityClock.setLocalTime(utcTime);
    }

    public int getUtcTime(){
        return (time-getOffset()+24)%24;
    }
}
