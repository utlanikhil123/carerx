
// This program prints the pickup Label.
public class PickupLabel {
    public static void main(String[] args) {
        System.out.println("==============================");

        final String pharmacyName = "LAKESIDE PHARMACY";
        System.out.println(pharmacyName + " - PICKUP");

        String patientName = "Maria Lopez";
        System.out.println("Patient:  " + patientName);

        String drugName = "Amoxicillin";
        int strength = 500;
        System.out.println("Drug:     " + drugName + " " + strength + " "  + "mg");

        int refillsLeft = 2;
        System.out.println("Refills left: " + refillsLeft);

        boolean controlledDrug = false;
        System.out.println("Controlled drug: " + controlledDrug);

        System.out.println("Ask the pharmacist if you have questions.");
        System.out.println("==============================");
    }
}
