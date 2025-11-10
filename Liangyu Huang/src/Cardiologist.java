public class Cardiologist extends HealthProfessional {
    private String subSpecialty;

    // Default constructor
    public Cardiologist() {
    }

    // Parameterized constructor
    public Cardiologist(int id, String name, String specializationArea, String subSpecialty) {
        super(id, name, specializationArea);
        this.subSpecialty = subSpecialty;
    }

    // Print detailed information
    public void printProfessionalDetails() {
        System.out.println("----- Cardiologist Details -----");
        super.printDetails();
        System.out.println("Sub-specialty: " + subSpecialty);
        System.out.println("Professional Type: Cardiologist");
    }

    // Getter and Setter
    public String getSubSpecialty() {
        return subSpecialty;
    }

    public void setSubSpecialty(String subSpecialty) {
        this.subSpecialty = subSpecialty;
    }
}