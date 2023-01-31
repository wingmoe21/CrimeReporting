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
 * This is a special class called Reporting. It has several methods for manipulating
 * the incident and district objects
 *
 *
 * @author Muhannad Aldossary
 *
 */
public class Reporting {

    private List<District> listOfDistricts;

    public  Reporting(){
        listOfDistricts=new ArrayList<District>();
    }

    /**
     * This adds a district object to the district list (listOfDistricts).
     *
     * @param objDistrict the provided district with will be added to the list of districts
     *
     */
    public void addDistrict(District objDistrict)
    {
        listOfDistricts.add(objDistrict);
    }

    /**
     * This is a function displays the List of Districts
     */
    public void printDistrictList(){
        for (District objDistrict : listOfDistricts)
        {
            System.out.println(objDistrict.getName());
        }
    }

    /**This method gives out the district object which has the largest incident's average
     * value in a given year
     *
     * @param year pass the year as input parameter for which average value is required
     * @return return the object of district type
     */
    public District getDistrictWithLargestAverageValue(int year){
        double averageValue=0;
        District objDistrictWithLargest=null;
        for (District objDistrict : listOfDistricts) {
            if(objDistrict.getAverageValueRecorded(year)>averageValue)
            {
                averageValue=objDistrict.getAverageValueRecorded(year);
                objDistrictWithLargest=objDistrict;
            }
        }
        return objDistrictWithLargest;
    }


    /**
     * This shows the incident with the largest value ever recorded
     *
     * this function used the list of district to iterate through each district and the function
     * getIncidentWithHighestValue() to get the highest value in a district
     *
     * @return This will return the incident object that has the highest incident value
     */
    public Incident getIncidentWithLargestValue(){
        double highestValue=0;
        Incident objIncidentWithLargestValue=null;
        for (District objDistrict : listOfDistricts) {
            if(objDistrict.getIncidentWithHighestValue().getValue()>highestValue)
            {
                objIncidentWithLargestValue=objDistrict.getIncidentWithHighestValue();
                highestValue=objDistrict.getIncidentWithHighestValue().getValue();
            }
        }
        return objIncidentWithLargestValue;
    }


    /**
     * This method gives out a list of all incidents reported with a value greater
     * than a given amount of money.
     *
     * @param value pass the value as input parameter for which value is required for the comparison.
     * @return list of incident that has the greater value as provided in the parameter.
     */
    public List<Incident> getAllIncidents(double value){
        List<Incident> listOfIncidents=new ArrayList<Incident>();
        for (District objDistrict : listOfDistricts){
            if(objDistrict.getIncidentWithHighestValue().getValue()>value){
                listOfIncidents.add(objDistrict.getIncidentWithHighestValue());
            }
        }
        return listOfIncidents;
    }
}
