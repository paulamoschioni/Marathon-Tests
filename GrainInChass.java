import java.util.Scanner;
class GrainInChass{
    public static void Count(int X){
        double grains;
        //how many grains?
        if(X == 1) grains = 1;
        else grains = (Math.pow(2,X)) - 1;

        //has at least i kg?
        double result = (int)grains/12000;  //save just the integer part
        System.out.println(result + " kg");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X;
        
        for(int i = 0; i < N; i++){
            X = sc.nextInt();
            if(X > 64 || X < 1) System.out.println("Invalid X");
            else Count(X);
        }
    sc.close(); }
}