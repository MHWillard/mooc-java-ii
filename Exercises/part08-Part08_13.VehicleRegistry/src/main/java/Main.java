
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);
               
        VehicleRegistry registry = new VehicleRegistry();
        registry.add(li1, "Arto");
        registry.add(li2, "Arto");
        registry.add(li3, "Jürgen");

        registry.printLicensePlates();
        registry.printOwners();
    }
}
