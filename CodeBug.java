class CodeBug {
  public static void main(String[] args) {
	int[] arr = new int[]{4,6,22,8,64,2,32,5,12,10};
    int N = arr.length; //N = 10
    int minLocation=arr.length-1;
    double min = arr[arr.length -1];
    
    for(int i=0;i<=N-1; i++) 
    {
    	
      if( arr[i] < min) {
    	  min = arr[i]; 
          minLocation = i;
      }   
    }
 System.out.print("The minimal value is arr[");
 System.out.println(minLocation + "] = " + min);
 

  }
}

//The first error was at line 8 where it was for(inti=1..) needs to be a space there.

//An array wasn't declared before using arr.length method.

//Array out of bounds error meaning at line 8 (i<=N) needs to be changed to (i<=N-1), Also (i=1) needs to be changed to (i=0)
     //in order to get the first element of the array

//I added line 6 because I wanted to initialize the min value as anything within the array, it didn't matter. This is because
     //during line 8 there will be a for loop to check each element in the array to see if that really is the minimum value.
     //If not, the minimum value that is found in the loop will be put into the variable min. If the element that is smallest
     //ends up being the one in which I assigned, I changed minLocation to match the same element location (minLocation = arr.
     //length-1)
