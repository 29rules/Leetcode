
public class SumOfArray {
    
    //input is number of arrays
    //output need sum of array 
    // it should be running
    // start loop at index 1 and add previous element value and than store that at in index 1 and increase index that way i will have total of sum array.

    public static void main( String [] args){
        int [] nums = {2,5,7,8};
        
        

    for(int i = 1; i < nums.length;i++){
       nums[i] = nums[i-1] + nums[i];
       

       
    }
    for(int j = 0; j < nums.length;j++){
        System.out.println(nums[j]);
    }
    
    }
}
