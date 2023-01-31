/**
 * Importing List class from java.base
 */
import java.util.List;
/**
 * Importing Scanner class from java.base
 */
import java.util.Scanner;


/**
 *
 * This is the main class for the input/output reporting. This class takes the input from the user
 * and compute it then display the output.
 *
 * @author Muhannad Aldossary
 *
 *
 */

public class ReportingIO {

    /**
     * This main method has the menu which will appear to the user. The user will be able to choose
     * between the six provided choices.
     *
     * The choice of the user will go to the switch function and activate the relevant case, which
     * will work as instructed and gives the output.
     *
     */
    public static void main(String[] args) {
        int input = 0;
        Reporting objReporting = new Reporting();
        String districtName = "";
        District objDistrict = null;
        do {
            //display the menu
            System.out.println("1. Enter District data");
            System.out.println("2. Enter Incident data");
            System.out.println("3. District with largest average value incident for a given year");
            System.out.println("4. Highest incident ever reported");
            System.out.println("5. All incidents with value greater than a given amount");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter District Name:");
                    sc = new Scanner(System.in);
                    districtName = sc.nextLine();
                    objDistrict = new District(districtName);
                    objReporting.addDistrict(objDistrict);
                    break;
                case 2:
                    Incident objIncident=new Incident();
                    sc= new Scanner(System.in);
                    System.out.print("Enter Month:");
                    sc= new Scanner(System.in);
                    objIncident.setMonth(sc.nextLine());
                    System.out.print("Enter Year:");
                    sc= new Scanner(System.in);
                    objIncident.setYear(sc.nextInt());
                    System.out.print("Enter Postcode:");
                    sc= new Scanner(System.in);
                    objIncident.setPostcode(sc.nextLine());
                    System.out.print("Enter Value:");
                    sc= new Scanner(System.in);
                    objIncident.setValue(sc.nextDouble());
                    objDistrict.addBurglary(objIncident);
                    break;
                case 3:
                    System.out.print("Enter Year:");
                    sc= new Scanner(System.in);
                    int year=sc.nextInt();
                    System.out.println("District with largest average value incident for "+year+" is "
                            +objReporting.getDistrictWithLargestAverageValue(year).getName());
                    break;
                case 4:
                    System.out.println("Highest incident ever reported");
                    System.out.println("Value: "+objReporting.getIncidentWithLargestValue().getValue());
                    System.out.println("Postcode: "+objReporting.getIncidentWithLargestValue().getPostcode());
                    System.out.println("Year: "+objReporting.getIncidentWithLargestValue().getYear());
                    System.out.println("Month: "+objReporting.getIncidentWithLargestValue().getMonth());
                    break;
                case 5:
                    System.out.print("Enter Value:");
                    sc= new Scanner(System.in);
                    List<Incident> listIncidents=objReporting.getAllIncidents(sc.nextDouble());
                    for(Incident objIncident1:listIncidents)
                    {
                        System.out.println("Value: "+objIncident1.getValue());
                        System.out.println("Postcode: "+objIncident1.getPostcode());
                        System.out.println("Year: "+objIncident1.getYear());
                        System.out.println("Month: "+objIncident1.getMonth());
                    }
                    break;
                default:
                    break;
            }
        } while (input != 0);//check if input is not equal to 0
    }
}