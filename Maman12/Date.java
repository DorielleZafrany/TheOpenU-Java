import java.util.*;

public class Date
{

    private int _day; 
    private int _month; 
    private int _year; 

    public Date( int d, int m, int y) {
        _day = d;
        _month = m;
        _year = y;
    }

    public int getDay(){
        return _day;
    }

    public int getMonth(){
        return _month;
    }

    public int getYear(){
        return _year;
    }

    public void setDay(int dayToSet){
        _day = dayToSet;
    }

    public void setMonth(int monthToSet)
    {
        _month = monthToSet;

    }

    public void setYear(int yearToSet)
    {
        _year = yearToSet;

    }

    public boolean equals(Date other){
        return this._year == other._year && this._month == other._month && this._day == other._day;
    }

    public boolean before(Date other)
    {
        return (_year < other._year) || (_year == other._year && _month < other._month) || (_year == other._year && _month == other._month && _day < other._day);
    }

    public String toString(){
        if(_day > 9 && _month > 9)
        {
            return _day+"/"+_month+"/"+_year;
        }
        else if(_day < 10 && _month > 9)
        {
            return "0"+_day+"/"+_month+"/"+_year;
        }
        else if(_day > 9 && _month < 10){

            return _day+"/"+"0"+_month+"/"+_year;
        }
        else{
            return "0"+_day+"/"+"0"+_month+"/"+_year;    
        }
    }

}
