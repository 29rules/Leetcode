class SumOfAllNumbers {


    public static void main( String [] args){

        int [] numbers = {2, 5, 12, 7, 18};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }

        System.out.println("Total Sum of all Numbers: "+" "+sum );// total should be 44
    }
}