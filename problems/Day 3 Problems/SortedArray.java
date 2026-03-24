class SortedArray{
    public static void main ( String [] args){
        //input is number unsorted array 
        //output need boolean true or false
        // condition next number from current number should be small or equal.
        // Logic: create a variable and store first value of unsorted array assuming that it is the lowest number. Than we compare that number with next 
        //number from array list if variable number is bigger than next number that means array is not sorted and we exit with  array not sorted.if next number is smallest or equal to variable number than we update the variable value and keep going until we check whole array.


        int [] arr ={2, 5, 7, 12, 18};
        boolean isSorted = false;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]>= arr[1+1]){
                isSorted = false;
                break;
            }

        }
        System.out.println("Is Array sorted? "+ isSorted);

        
    }
}