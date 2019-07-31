//LockableDice.java//
//Talon and Hayes//
public interface LockableDice{
  int setKey(int currentKey, int newKey);
  void lock(int currentKey);
  void unlock(int currentKey);
  Boolean locked = true;
}