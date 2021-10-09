/**
 * Descrption: Class which reprsent eploye in order to print information about there salllary
 */
public class Employee {
    private String firstName = "Pero";
    private String lastName = "Peric";
    private double hoursWorkedW = 40;
    private double YTD = 500;
    private double hourR = 60.5;

    /**
     * Defult Constructrostor
     */
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.hoursWorkedW = 40;
        this.YTD = 500;
        this.hourR = 60.5;
    }

    /**
     * Parmatrize constructor
     * pametni constro on passe vrije
     * pametni constro on passe vrijenost
     * @param firstName
     * @param lastName
     */
    public Employee(String firstName, String lastName, double hoursWorkedW, double YTD, double hourR ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorkedW = hoursWorkedW;
        this.YTD = YTD;
        this.hourR = hourR;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setHoursWorked(int hoursWorkedW) {
        this.hoursWorkedW = hoursWorkedW;

    }

    public double getHoursWorked() {
        return this.hoursWorkedW;
    }

    public void setHoursWorkedYTD(int YTD) {
        this.YTD = YTD;

    }

    public double getHoursWorkedYTD() {
        return this.YTD;
    }

    public void setHourRate(double hourR) {

        this.hourR = hourR;
    }

    public double getHourRate(double hourR) {
        return this.hourR;
    }

    public void print() {
        System.out.println("Employee: " + this.firstName + " " + this.lastName + " " + this.hoursWorkedW + " "
                + this.YTD + "" + this.hourR);

    }

    public String toString() {
        return "Employee: "  + this.firstName + "\n " + "Hours worked Last week "+ this.lastName + " \n" + this.hoursWorkedW + "\n " + this.YTD + " "
                + this.hourR;

    }
}
