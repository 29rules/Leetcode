
public class DuplicateZero {
    public static void main ( String [] args){
        int [] nums = {1,0,2,3,0,4,5,0};

    for(int i = 0; i < nums.length -1; i++){
        if(nums[i]== 0){

            for(int j = nums.length - 1; j > i +1; j--){
               nums[j] = nums[j-1];
            }
            nums[i+1]= 0;
            i++;
        }
    }
    for(int k = 0; k < nums.length-1; k ++){
        System.out.println(nums[k]);
    }

    }    
}
