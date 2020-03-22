public class date
{
    private int year;
    private int month;
    private int day;

    public date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }  

    @Override
    public String toString() {
        return  year + "/" + month + "/" + day;
    }
    
    
}