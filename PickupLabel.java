
// This program prints the pickup Label.
public class PickupLabel {
    public static void main(String[] args) {

        final String PHARMACY_NAMES = "LAKESIDE PHARMACY";
        String patientName = "Maria Lopez";
        String drugName = "Amoxicillin";
        int strengthMg = 500;
        int refillsLeft = 2;
        boolean isControlled = false;

        System.out.println("==============================");
        System.out.println(PHARMACY_NAMES + " - PICKUP");
        System.out.println("Patient:  " + patientName);
        System.out.println("Drug:     " + drugName + " " + strengthMg + " mg");
        System.out.println("Refills left: " + refillsLeft);
        System.out.println("Controlled drug: " + isControlled);
        System.out.println("Ask the pharmacist if you have questions.");
        System.out.println("==============================");
    }
}
