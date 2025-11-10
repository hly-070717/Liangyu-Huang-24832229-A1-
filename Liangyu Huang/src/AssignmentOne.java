import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    // Collection to store all appointments
    private static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3: Create health professional objects and print details
        System.out.println("=== Part 3: Health Professional Information ===");

        // 3 General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Zhang", "General Medicine", 20);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Li", "General Medicine", 15);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Wang", "General Medicine", 18);

        // 2 Cardiologists
        Cardiologist cardio1 = new Cardiologist(201, "Dr. Zhao", "Cardiology", "Coronary Artery Disease");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Chen", "Cardiology", "Arrhythmia");

        // Print professional details
        gp1.printProfessionalDetails();
        gp2.printProfessionalDetails();
        gp3.printProfessionalDetails();
        cardio1.printProfessionalDetails();
        cardio2.printProfessionalDetails();
        System.out.println("------------------------------");

        // Part 5: Manage appointments
        System.out.println("\n=== Part 5: Appointment Management ===");

        // Create 4 appointments
        createAppointment("Xiao Ming", "13800138000", "2025-11-15 09:00", gp1);
        createAppointment("Xiao Hong", "13900139000", "2025-11-15 10:00", gp2);
        createAppointment("Xiao Gang", "13700137000", "2025-11-16 14:00", cardio1);
        createAppointment("Xiao Li", "13600136000", "2025-11-16 15:00", cardio2);

        // Print all appointments
        System.out.println("\n--- All Appointment Records ---");
        printExistingAppointments();

        // Cancel an appointment
        System.out.println("\n--- After Cancellation ---");
        cancelBooking("13900139000");
        printExistingAppointments();
        System.out.println("------------------------------");
    }

    // Create a new appointment (with validation)
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.isEmpty() ||
                patientMobile == null || patientMobile.isEmpty() ||
                timeSlot == null || timeSlot.isEmpty() ||
                doctor == null) {
            System.out.println("Appointment creation failed: Incomplete information!");
            return;
        }
        Appointment newAppt = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointments.add(newAppt);
        System.out.println("Appointment created successfully: " + patientName + " booked with Dr. " + doctor.getName());
    }

    // Print all existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointment records found!");
            return;
        }
        for (Appointment appt : appointments) {
            appt.printAppointmentDetails();
            System.out.println("------------------");
        }
    }

    // Cancel an appointment by mobile number
    public static void cancelBooking(String mobile) {
        boolean removed = appointments.removeIf(appt -> appt.getPatientMobile().equals(mobile));
        if (removed) {
            System.out.println("Appointment with mobile " + mobile + " has been cancelled");
        } else {
            System.out.println("No appointment found with mobile " + mobile);
        }
    }
}