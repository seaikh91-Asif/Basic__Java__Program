public class Find_UniqueElement_Bitwise {

    //program to find an unique element present in the array

    public static void main(String[] args){
        int [] arr = { 2, 2, 7, 7, 9, 9, 8, 8, 1};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
