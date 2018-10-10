package programmerhotel;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ClockSystemTest {

    private ClockSystem clockSystem;
    @Before
    public void setUp() throws Exception {
        int phoneTime=10;
        String cities[]={"Peking","London","Moscow","Sydney","NewYork"};
        int offsets[]={8,0,4,10,-5};

        clockSystem=new ClockSystem(phoneTime,ClockSystem.PK_OFFSET,cities,offsets);
        clockSystem.adjustCityClocks();
    }

    @Test
    public void London_time_should_be_2_when_phone_time_is_10(){
        int LondonTime=clockSystem.getCityTime("London");
        assertEquals(2,LondonTime);
    }

    @Test
    public void Sydney_time_should_be_12_when_phone_time_is_10(){
        int SydneyTime=clockSystem.getCityTime("Sydney");
        assertEquals(12,SydneyTime);
    }

    @Test
    public void NewYork_time_should_be_21_when_phone_time_is_10(){
        int NewYorkTime=clockSystem.getCityTime("NewYork");
        assertEquals(21,NewYorkTime);
    }

    @Test
    public void Moscow_time_should_be_0_when_phone_time_is_4(){
        PhoneClock phoneClock1=new PhoneClock(4,ClockSystem.PK_OFFSET);
        clockSystem.setPhoneClock(phoneClock1);

        clockSystem.adjustCityClocks();
        int MoscowTime=clockSystem.getCityTime("Moscow");

        assertEquals(0,MoscowTime);
    }


}