package Ques4;

public class Holiday {

    private String name;

    private int day;

    private String month;


    public Holiday(String name) {
        this.name = name;
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    //Mutators and accessors
    //Set name
    public void setName(String name) {
        this.name = name;
    }

    //Get name
    public String getName() {
        return name;
    }

    //Set day
    public void setDay(int day) {
        this.day = day;
    }

    //Get day
    public int getDay() {
        return day;
    }

    //Set name
    public void setMonth(String month) {
        this.month = month;
    }

    //Get name
    public String getMonth() {
        return month;
    }

    //Check for same month
    public boolean isSameMonth(Object obj) {
        // check for if it the same reference
        if (this == obj) return true;

        // check if it is not instance of this class
        if (!(obj instanceof Holiday)) return false;

        // cast the compared object to Holiday class
        Holiday other = (Holiday) obj;

        //Return true if month is same
        return this.month.equals(other.month);
    }

    //Check for same holiday date
    public boolean SameHolidayDate(Object obj) {
        // check for if it the same reference
        if (this == obj) return true;

        // check if it is not instance of this class
        if (!(obj instanceof Holiday)) return false;

        // cast the compared object to Holiday class
        Holiday other = (Holiday) obj;

        //Return true if month and day are same
        return this.month.equals(other.month) && this.day == other.day;
    }
}