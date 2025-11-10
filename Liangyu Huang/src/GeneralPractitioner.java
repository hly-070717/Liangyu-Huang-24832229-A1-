public class GeneralPractitioner extends HealthProfessional {
    private int patientLimitPerDay;

    // Default constructor
    public GeneralPractitioner() {
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String specializationArea, int patientLimitPerDay) {
        super(id, name, specializationArea);
        this.patientLimitPerDay = patientLimitPerDay;
    }

    // Print detailed information
    public void printProfessionalDetails() {
        System.out.println("----- General Practitioner Details -----");
        super.printDetails();
        System.out.println("Daily Patient Limit: " + patientLimitPerDay);
        System.out.println("Professional Type: General Practitioner");
    }

    // Getter and Setter
    public int getPatientLimitPerDay() {
        return patientLimitPerDay;
    }

    public void setPatientLimitPerDay(int patientLimitPerDay) {
        this.patientLimitPerDay = patientLimitPerDay;
    }
}