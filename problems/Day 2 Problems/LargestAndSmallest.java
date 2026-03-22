class LargestAndSmallest{
    public static void main( String []args){
        int [] numbers = {2, 5, 12, 7, 18};
        int Largest = numbers[0];
        int smallest = numbers[0];
        int difference = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]> Largest)
            {
                Largest=numbers[i];
            }
            if(numbers[i]< smallest){
                smallest=numbers[i];
            }
        }
        difference = Largest-smallest;
        System.out.println("Difference"+ " :"+ difference);
    }
}