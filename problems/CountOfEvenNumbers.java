class CountOfEvenNumbers{
    public static void main ( String [] args){
        int [] numbers = {2, 5, 12, 7, 18};
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                count++;
            }
        }

        System.out.println("Total count of Even Numbers:"+" "+ count);
    }
}