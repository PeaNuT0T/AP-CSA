package hospital;
// PP 9.2
// AP CSA
// Talon Huang

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Employee 
{
  List<Long> patientIDList;
  public Nurse(String firstName, String lastName, long employeeID, long salary) 
  {
    super(firstName, lastName, employeeID, salary);
    ArrayList<Integer> patientIDList = new ArrayList<Integer>();
  }
  public void addPatient(long patientID) 
  {
    patientIDList.add(patientID);
    System.out.println("New patient " + patientID + " added to Dr. " + firstName + " " + lastName);
  }
  // removes a patient
  public void removePatient(long patientID) 
  { 
    patientIDList.remove(patientID);
    System.out.println("Patient " + patientID + " removed from Dr. " + firstName + " " + lastName);
  }
  public void visitPatient(long patientID) 
  {  // visits a patient
    System.out.println("Patient " + patientID + " is visited by Dr. " + firstName + " " + lastName);
  }
  public List<Long> getPatientIDList() 
  {   // getter of patient list
    return patientIDList;
  }
  public void setPatientIDList(List<Long> patientIDList) 
  { // setter of patient list
    this.patientIDList = patientIDList;
  }
}