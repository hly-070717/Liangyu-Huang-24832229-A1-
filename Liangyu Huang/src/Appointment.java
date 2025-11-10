public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
    }

    // Parameterized constructor
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Print appointment details
    public void printAppointmentDetails() {
        System.out.println("----- Appointment Details -----");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Appointment Time: " + timeSlot);
        System.out.println("Selected Doctor Information:");

        // Polymorphic call to doctor's print method
        if (selectedDoctor instanceof GeneralPractitioner) {
            ((GeneralPractitioner) selectedDoctor).printProfessionalDetails();
        } else if (selectedDoctor instanceof Cardiologist) {
            ((Cardiologist) selectedDoctor).printProfessionalDetails();
        }
    }

    // Getter for mobile (used in cancellation)
    public String getPatientMobile() {
        return patientMobile;
    }
}