public class countChars {
  
  public static void main(String[] args){
    
    //Count occurances of 'i' in a string.
    
    String word = "supercalifragilisticexpialidocious";
    char s = 'i';
    int counter = 0;
    
    for(int i=0; i < word.length(); i++){
      if(word.charAt(i) == s){
        counter++;
      }
    }
    System.out.println("There are " + counter + " i's in the string");
  }
}