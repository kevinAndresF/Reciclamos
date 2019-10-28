package model;

public class TimeDescompose{

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private int day;
    private int month;
    private int years;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public TimeDescompose(int day, int month, int years){

        this.day = day;
        this.month = month;
        this.years = years;

    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the years
     */
    public int getYears() {
        return years;
    }


}