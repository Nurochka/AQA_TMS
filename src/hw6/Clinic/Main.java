package hw6.Clinic;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        patient1.setPlan(TreatmentPlan.Second);
        patient1.setDoctor();
        patient2.setDoctor();
    }

}
