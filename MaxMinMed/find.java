public class find{
  
  public static int findMin(int[] arr){
    int min = arr[0];
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < min) {
        min = arr[i];
     }
   }
    return min;
    }
  
public static int findMax(int[] arr){
   int max = arr[0];
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max) {
        max = arr[i];
    }
  }
    return max;
    }
   
   public static int findMed(int[] arr){
     int lastPos;
     int i;
     int swap;
     int mid = arr.length/2;
     for(lastPos = arr.length-1; lastPos >= 0; lastPos--)
       for(i=0; i < lastPos - 1; i++){
         if(arr[i] > arr[i+1]){
           swap = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = swap;
         }
       }
     return (arr[mid-1] + arr[mid]) / 2;
  }
  
}