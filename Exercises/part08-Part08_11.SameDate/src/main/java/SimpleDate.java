
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    public boolean equals(Object object) {
       //returns true if the date of the object passed to the method as a parameter is the same as the date of the object used to call the method. 
       //equals, not hashCode
       
       if (this == object) {
           return true;
       } 
       
       if (!(object instanceof SimpleDate)) {
        return false;
    }
       
       SimpleDate comparedDate = (SimpleDate) object;
       
       if (this.day == comparedDate.day &&
               this.month == comparedDate.month &&
               this.year == comparedDate.year) {
           return true;
       }
       
       return false;
    }

}
