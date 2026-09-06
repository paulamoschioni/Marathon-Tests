import java.util.Scanner;
/*You are given an integer array arr. Sort the integers in the array in ascending order
 by the number of 1's in their binary representation and in case of two or more
integers have the same number of 1's you have to sort them in ascending order.
Return the array after sorting it. */
class SortIntegers{
    public void Swap(int arr[], int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

    public int BinaryRep(int num){
        int ones = 0;
        while(num > 0){
            if(num % 2 == 1) ones++;
            num = num/2;   //updating num
        }
        return ones;
    }

    public int[] SortByBits(int arr[]) {
        int num, size = arr.length;
        int binary1, binary2;
        for(int i = 0; i < size - 1; i++){  //check all the positions of arr 
            num = arr[i];
            for(int j = (size-1); j > i; j--){
                binary1 = BinaryRep(arr[j]);
                binary2 = BinaryRep(arr[j-1]);
                if(binary1 < binary2){      //if the previous number have same 1´s
                    Swap(arr, j);
                }
                if(binary1 == binary2){     //if have the same numbs, compare the real value
                    if(arr[j] < arr[j-1]){
                        Swap(arr, j);
                    }
                }
            }
            

        }
        return arr;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int size = sc.nextInt();
        int[] solution = new int[size];
    
        for(int i = 0; i < size; i++){
            num = sc.nextInt();
            solution[i] = num;
        }
        SortIntegers si = new SortIntegers();
    solution = si.SortByBits(solution);
        for(int j = 0; j < size; j++){
        System.out.println(solution[j] + " ");
        }

    sc.close(); }
}