public class MaxMin {
    public static void main (String [] args){

        int [] nums = {2,5,7,8};
        int smallest = nums[0];
        int larget = 0;

        for(int i = 1; i < nums.length; i++){
           if(nums[i] < smallest){
            smallest = nums[i];
           }else{
            larget = nums[i];
           }

        }
        int difference = larget - smallest;
        System.out.println("Difference between largest and smallest: " + difference);
    }
    
}
