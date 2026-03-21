class EvenNumbers{
    public static void main ( String [] args){

        int [] numbers = {2, 5, 12, 7, 18};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of All Even Numbers: "+" "+ sum);
    }
}