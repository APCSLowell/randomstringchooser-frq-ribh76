import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> valuesRemaining; 
  public RandomStringChooser(String[] values){
    valuesRemaining = new ArrayList<String> ();
    for (String Value : values){
      valuesRemaining.add(value); 
    } 
  }
  public String getNext(){ 
    if (valuesRemaining.size() == 0) {
      return "NONE" ; 
    }
    int index = (int)(Math.random()*valuesRemaining.size());
    return valuesRemaining.remove(index); 
  } 
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
