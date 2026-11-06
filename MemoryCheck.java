
// This Class shows real numbers from this Mac, how much room Java has.

import java.sql.SQLOutput;

public class MemoryCheck {
    public static void main(String[] args) {
        final String PHARMACY_TASK = "Lakeside Pharmacy Memory Check";
        char shelfName = 'A';
        int refills = 3;
        int copy  = refills;
        refills = refills - 3;

        String drugName = "Amoxicillin";
        String nameOnLabel = drugName;
        drugName = "Ibuprofen";

        System.out.println(PHARMACY_TASK);
        System.out.println("Shelf: " + shelfName);
        System.out.println("Refills: " + refills);
        System.out.println("Copy: " + copy);
        System.out.println("DrugName: " + drugName );
        System.out.println("NameOnLabel: " + nameOnLabel);

    }
}
