public class repeat {
  
  public static void main(String[] args) {
    
    int[] arr = {1,2,1,2,3,4,3,4,5,7,6,5,6};
    int counter = 0;
    int single = 0;
    int j;
    
    for(int i=0; i < arr.length; i++){
      if(i > 1 && counter != 2){
        single = arr[i-1];
      }
      counter=0;
      for(j=0; j < arr.length; j++){
        if(arr[i] == arr[j]){
          counter++;
        }
      }
    }
    
    System.out.println(single);
    
  }
}