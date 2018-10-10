package programmerhotel;


import java.util.HashMap;
import java.util.Map;

public class ClockSystem {

    public static final int PK_OFFSET =8;

    private PhoneClock phoneClock;
    private Map<String,CityClock> cityClocks;

    public ClockSystem(int phoneTime,int offset,String cityNames[],int[] offsets){
        phoneClock=new PhoneClock(phoneTime,offset);
        cityClocks=new HashMap<>();
        for(int i=0;i<cityNames.length;i++)
            cityClocks.put(cityNames[i],new CityClock(offsets[i]));
    }

    public void setPhoneClock(PhoneClock phoneClock) {
        this.phoneClock = phoneClock;
    }

    public void adjustCityClocks(){
        phoneClock.adjustCityClocks(cityClocks);
    }

    public int getCityTime(String cityName){
        return cityClocks.get(cityName).getLocalTime();
    }
}
