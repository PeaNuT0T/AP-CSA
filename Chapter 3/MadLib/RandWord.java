//****************************************************************************************************************
//*********************************************    Talon Huang     ***********************************************
//****************************************************************************************************************
//************************************         MadLib RandWord Class        **************************************
//****************************************************************************************************************
import java.util.Random;

  
  

public class RandWord{
  // Create enumerated types
  enum Sport { Basketball, Baseball, Softball, Volleyball, Lacrosse, Soccer}
  enum Instrument { Violin, Piano, Keyboard, Guitar, Trumpet, Saxophone}
  enum Mood {Good, Excellent, Sweet, Joyful, Beautiful, Cheerful}
  enum Grade {First, Second, Third, Fourth, Fifth, Sixth}
  enum Subject { Math, English, CS, Biology, Physics, Chemistry}
  enum NegMood {Tough, Hard, Difficult, Boring, Meaningless, Bad}

  // Create Methods
    public RandWord(){}
  public String pickSport()
  {
     int pickSport = new Random().nextInt(Sport.values().length);
      return ("" + Sport.values()[pickSport]);
    }
  public String pickInstrument()
  {
     int pickInstrument = new Random().nextInt(Instrument.values().length);
      return ("" + Instrument.values()[pickInstrument]);
    }
    public String pickMood()
    {
     int pickMood = new Random().nextInt(Mood.values().length);
      return ("" + Mood.values()[pickMood]);
    }
    public String pickGrade()
    {
      int pickGrade = new Random().nextInt(Grade.values().length);
      return ("" + Grade.values()[pickGrade]);
    }
    public String pickSubject()
    {
      int pickSubject = new Random().nextInt(Subject.values().length);
      return ("" + Subject.values()[pickSubject]);
    }
    public String pickNegMood()
    {
      int pickNegMood = new Random().nextInt(NegMood.values().length);
      return ("" + NegMood.values()[pickNegMood]);
    }
  }
