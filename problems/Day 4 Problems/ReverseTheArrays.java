class ReverseTheArrays{
    public static void main ( String [] args){
        int [] my_list = {10, 20, 30, 40, 50};
        int i = 0;
        int j = my_list.length-1;

        while (i < j) {
            
            int temp = my_list[i];
            my_list[i] = my_list[j];
            my_list[j] = temp;

            i++;
            j--;
        }

        for( int k = 0; k < my_list.length; k++){

            System.out.print("Reversed list "+ my_list[k]);
        }

        
    }
}