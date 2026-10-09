import java.util.Scanner;
/*
 * DJ: N songs labeled A..Z. Songs play in the order of a sequence made of
 * all words of length 1, then 2, 3... (in lexicographic order), written
 * one after another. For each k, print the k-th song in that sequence.
 * Blank line after each test case. Input ends with N = Q = 0.
 * Paula Moschioni, 08/10/2026
 */
class computerDj{
    public static String queries(int k, String array[]){
        boolean found = false;
        String key = new String();

        for(int i = 0; i < k; i++){
            if(i == k - 1){
                key = array[i];
            }
        }
        return key;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N, Q, k;
        String auxString;

        N = sc.nextInt();
        Q = sc.nextInt();
        while(N != 0 && Q != 0){
                String[] titles = new String[N];
                for(int j = 0; j < N; j++){
                    titles[j] = sc.next();    
                }
            
                String result;
                //reading Q queries
                for(int i = 0; i < Q; i++){
                    k = sc.nextInt();
                    result = queries(k, titles);
                    System.out.println(result);
                }

        N = sc.nextInt();
        Q = sc.nextInt();
        }
        sc.close();
    }
}