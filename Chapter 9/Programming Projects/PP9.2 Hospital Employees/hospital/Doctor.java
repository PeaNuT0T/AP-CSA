package hospital;
import java.util.List;
import java.util.ArrayList;


// PP 9.2
// AP CSA
// Talon Huang
public class Doctor extends Employee {
  
  List<Long> patientIDList;    // list of patient IDs that doctor is assigned to
  
  public Doctor(String firstName, String lastName, long employeeID, long salary) {    // constructor
    super(firstName, lastName, employeeID, salary);
    ArrayList<Integer> patientIDList = new ArrayList<Integer>();
  }

  public void removePatient(long patientID) 
  {
    patientIDList.remove(patientID);
    System.out.println("Patient " + patientID + " removed from Dr. " + firstName + " " + lastName);
  }
  public void visitPatient(long patientID) 
  {// visits a patient
    System.out.println("Patient " + patientID + " is visited by Dr. " + firstName + " " + lastName);
  }
  public void assignNurse(Nurse nurse, long patientID) 
  {  
    System.out.println("Patient " + patientID + " is assigned to Nurse " + nurse.getWholeName() +
                       " by Dr. " + getWholeName());
  }
  
  public List<Long> getPatientIDList() {return patientIDList;}
  public void setPatientIDList(List<Long> patientIDList) {this.patientIDList = patientIDList;}
  
}