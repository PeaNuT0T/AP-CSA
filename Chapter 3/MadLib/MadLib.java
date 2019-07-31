//****************************************************************************************************************
//*********************************************    Talon Huang     ***********************************************
//****************************************************************************************************************
//*********************************************       MadLib       ***********************************************
//****************************************************************************************************************

/*Write a relatively short story of your own having something to do with Walker in the past tense.  
 * (i.e. sports, academics, a course, an activity, your BFF, etc.). 5 Sentences long and including 8  random words*/
public class MadLib
{
  //** Story **//
  //The Walker School is where I go to school every day. 
  //I first came here when I was in **GRADE** grade.
  //I like sports, I played **SPORT** and  
  //**SPORT** last year. I also like music. My favorite musical 
  //instrument is **INSTRUMENT** 
  //Life is Good. But my first period was **SUBJECT** .Plus I didn't do 
  //my **SUBJECT** homework. Sometimes, life is **NEGMOOD*. 
  
  public static void main(String args[])
  { 
    
RandWord PICK = new RandWord();// Call from RandWord.java
    
    // Print the story
    System.out.println("The Walker School is where I go to school every day.");
    System.out.println("I first came here when I was in " + PICK.pickGrade() + " grade.");
    System.out.println("I like sports, I played " + PICK.pickSport() + " and " + PICK.pickSport() + " last year.");
    System.out.println("I also like music. My favorite musical " + "instrument is " + PICK.pickInstrument() + ".");
    System.out.println("Life is " + PICK.pickMood() + ". " + "But my first period was " + PICK.pickSubject() + ".");
    System.out.println("Plus I didn't do my " + PICK.pickSubject() + " homework. " + "Sometimes, life is " + PICK.pickNegMood() + ".");
  }
}