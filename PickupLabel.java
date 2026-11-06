
// This program prints the pickup Label.
public class PickupLabel {
    public static void main(String[] args) {
        System.out.println("==============================");

        final String pharmacyName = "LAKESIDE PHARMACY";
        System.out.println(pharmacyName + " - PICKUP");

        String patientName = "Maria Lopez";
        System.out.println("Patient:  " + patientName);

        String drugName = "Amoxicillin";
        double strength = 500;
        System.out.println("Drug:    " + drugName + strength + "mg");

        var refillsLeft = 2.5;
        System.out.println("Refills left:  " + refillsLeft);

        boolean controlledDrug = false;
        System.out.println("Controlled Drug:  " + controlledDrug);

        System.out.println("Ask the pharmacist if you have questions.");
        System.out.println("==============================");
    }
}
