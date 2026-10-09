import java.util.Scanner;
/*
 * DJ: N songs labeled A..Z. Songs play in the order of a sequence made of
 * all words of length 1, then 2, 3... (in lexicographic order), written
 * one after another. For each k, print the k-th song in that sequence.
 * Blank line after each test case. Input ends with N = Q = 0.
 * Paula Moschioni, 08/10/2026
 */
class computerDj{
    public static String queries(int k, String titles[]){
        int N = titles.length;      //N songs

        //search the correct block
        int size = 1;
        long position = k;
        long wordsBlock = N;
        while(position > (wordsBlock*size)){
            position = position - (wordsBlock*size);
            size++;
            wordsBlock = wordsBlock * N;
        }

        //which letter and which word
        long pos = position - 1;            // posição dentro do bloco, contando do 0
        long word = pos / size;
        int letter = (int)(pos % size);

        //which is the real word
        long divisor = 1;
        for(int i = 0; i < size - 1 - letter; i++){
            divisor = divisor * N;
        }
        int index = (int)(word/divisor % N);

        return titles[index];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N, Q, k;

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

                System.out.println(); 
        N = sc.nextInt();
        Q = sc.nextInt();
        }
        sc.close();
    }
}