public class remove {
  
  public static void main (String[] args) {
    
    String word = "Hellto mty namet is Codty";
    String x = "t";
    
    String newWord = remove_char(word, x);
    
    System.out.println("The new string is " + newWord);
  }
  
  public static String remove_char(String word, String i){
    String str = word;
    str = str.replace(i, "");
    return str;
   }
  
}