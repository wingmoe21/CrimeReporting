/**
 * Importing ArrayList class from java.base
 */
import java.util.ArrayList;
/**
 * Importing List class from java.base
 */
import java.util.List;

/**
 *
 * This is a unique class for representing Districts. The object has methods relating to the
 * aspects of a district and some of its behaviours.
 *
 *
 * @author Muhannad Aldossary
 */

public class District {
    private String name;
    private List<Incident> burglaryInc;

    /**
     * construct that initializes the burglary list
     */
    public District()
    {
        burglaryInc=new ArrayList<Incident>();
    }

    public District(String name){
        this.name=name;
        burglaryInc=new ArrayList<Incident>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Incident> getBurglaryInc() {
        return burglaryInc;
    }

    /**
     * This method adds an incident object to the burglary list (burglaryInc).
     *
     * @param objIncident the name of the incident that will be added to the burglary list in a district.
     */
    public void addBurglary(Incident objIncident)
    {
        burglaryInc.add(objIncident);
    }


    /**
     * This function will check the incident that has the highest value for this district
     *
     * @return this function returns the object of Incident type with the highest value
     *
     */
    public Incident getIncidentWithHighestValue(){
        Incident highestValueIncident=null;
        double highestValue=0;
        for (Incident objIncident : burglaryInc) {
            if(objIncident.getValue() > highestValue)
            {
                highestValueIncident=objIncident;
                highestValue=objIncident.getValue();
            }

        }
        return highestValueIncident;
    }


    /**
     * This is sa method calculate an average of incident's values on a given year.
     *
     * @param year is an input parameter used to enter the year
     * @return return a decimal representation of the average of burglary incident value
     */
    public double getAverageValueRecorded(int year){
        int count=0;
        double total=0;
        for (Incident objIncident : burglaryInc) {
            if(objIncident.getYear()==year)
            {
                total=total+objIncident.getValue();
                count++;
            }
        }
        return  (total/count);
    }


    /**
     * This gives a list represent all incident with a value greater than a given value as a parameter
     * @param value the provided incident value
     * @return return the list of incident that has a value greater than the provided incident value
     */
    public List<Incident> getAllIncident(double value){
        List<Incident> DistrictBurglaryInc= new ArrayList<>();
        for (Incident objIncident : burglaryInc) {
            if(objIncident.getValue()>value)
            {
                DistrictBurglaryInc.add(objIncident);
            }
        }
        return DistrictBurglaryInc;
    }
}
