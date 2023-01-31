/**
 *
 * This is a class for representing an Incident object. This has getter and setter and toString methods
 * for storing and retrieving information about the value of the stolen goods, the postcode,
 * the month, and the year in which the crime was reported.
 *
 *
 * @author Muhannad Aldossary
 *
 *
 */

public class Incident {

    double value;
    String postcode;
    String month;
    int year;
    public Incident()
    {}

    public Incident(double value, String postcode, String month, int year) {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }
    /**
     * This returns a human readable version of the Incident object
     *
     * @return string representation of a incident
     */

    @Override
    public String toString() {
        return "Incident{" +
                "value= " + value + "£" +
                ", postcode= '" + postcode.toUpperCase() + '\'' +
                ", Reported at= " + month +" " + year +
                '}';
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    public String getPostcode() {
        return postcode.toUpperCase();
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

}