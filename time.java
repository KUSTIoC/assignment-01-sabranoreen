public class time
{
    private int  hours;
    private int min;
    private int sec;

    public time(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    @Override
    public String toString() {
        return  hours + ":" + min + ":" + sec ;
    }
     
    
}
