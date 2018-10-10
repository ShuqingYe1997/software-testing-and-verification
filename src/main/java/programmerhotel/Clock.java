package programmerhotel;

public abstract class Clock {

    private int offset;

    public Clock(){}

    public Clock(int offset){
        this.offset=offset;
    }

// --Commented out by Inspection START (2018/10/10 18:52):
//    public void setOffset(int offset){
//        this.offset=offset;
//    }
// --Commented out by Inspection STOP (2018/10/10 18:52)

    public int getOffset() {
        return offset;
    }

}
