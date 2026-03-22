class LargestNumbers{
    public static void main ( String [] args){
        int [] numbers = {2, 5, 12, 7, 18};
        int LargestNum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > LargestNum )
            {
                LargestNum = numbers[i];
            }

        }

        System.out.println("Largest Number in the array"+" :"+LargestNum); // Answer 18
    }
}