// PP 9.2
// AP CSA
// Talon Huang
package hospital;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        // crate doctors
        Doctor drOBrian = new Doctor("Bred","O'Brian", 99876, 567000);
        Doctor drDrew = new Doctor("Uncle","Drew", 11013, 567001);
        Doctor drDoe = new Doctor("John","Doe", 11014, 567002);
        // create nurses
        Nurse nNick = new Nurse("Nick", "Sweeney", 12001, 50000);
        Nurse nLook = new Nurse("Sam", "Look", 12002, 55000);
        // create admins
        Administrator nBlake = new Administrator("Josh", "Blake", 10005, 85000);
        Administrator aHagi = new Administrator("George", "Hagi", 10001, 185000);
        // janitors
        Janitor jPoor = new Janitor("Sally", "Poor", 19030, 24000);
        drOBrian.assignNurse(nNick, 36001);
        drDrew.assignNurse(nLook, 36013);
        // patient visits
        drDrew.visitPatient(36013);
        nLook.visitPatient(36013);
        // change salaries
        nBlake.changeSalary(drDoe, 145000);
        // assign time slots
        List<Integer> slots = new ArrayList<Integer>();
        slots.add(13);
        aHagi.setTimeSlotsForJanitor(jPoor, slots);
    }
}