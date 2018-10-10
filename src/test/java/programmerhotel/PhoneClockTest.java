package programmerhotel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneClockTest {

    private PhoneClock phoneClock;

    @Before
    public void setUp() throws Exception {
        int time=10;
        phoneClock=new PhoneClock(time,ClockSystem.PK_OFFSET);  //将手机时间设为北京时间十点
    }

    @Test
    public void utc_should_be_2_when_phone_time_is_10(){
        assertEquals(2,phoneClock.getUtcTime());
    }

    @Test
    public void utc_should_be_0_when_phone_time_is_8(){
        phoneClock.setTime(8);
        assertEquals(0,phoneClock.getUtcTime());
    }

    @Test
    public void utc_should_be_23_when_phone_time_is_7() {
        phoneClock.setTime(7);
        assertEquals(23, phoneClock.getUtcTime());
    }


}