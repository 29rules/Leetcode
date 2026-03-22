class IndexTracking{
    public static void main ( String [] args){
        int [] numbers = {2, 5, 12, 7, 18};
        int index = 0;

        for(int i = 0; i < numbers.length; i++){

            
            if(numbers[i]== 7){
                index = i;
                break;
            }
        }

        System.out.println("Index of element 7"+ " :"+ index); // value 3
    }
}