class SmallestNumber{
    public static void main ( String [] args){
        int [] numbers = {2, 5, 12, 7, 18};
        int SmallestNum = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < SmallestNum )
            {
                SmallestNum = numbers[i];
            }

        }

        System.out.println("Largest Number in the array"+" :"+ SmallestNum); // Answer 2
    }
}