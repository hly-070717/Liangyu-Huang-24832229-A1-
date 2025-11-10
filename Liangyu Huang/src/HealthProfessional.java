public class HealthProfessional {
    private int id;
    private String name;
    private String specializationArea;

    // Default constructor
    public HealthProfessional() {
    }

    // Parameterized constructor
    public HealthProfessional(int id, String name, String specializationArea) {
        this.id = id;
        this.name = name;
        this.specializationArea = specializationArea;
    }

    // Print basic details
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization Area: " + specializationArea);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecializationArea() {
        return specializationArea;
    }

    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }
}