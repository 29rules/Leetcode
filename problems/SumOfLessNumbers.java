class SumOfLessNumbers{
    public static void main ( String [] args){
        int [] numbers = {2, 5, 12, 7, 18};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]< 10){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of less than 10 numbers: "+" "+ sum); // Total is 14
    }
}