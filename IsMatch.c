import java.util.Scanner;
/*BY: Paula Moschioni
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
Return a boolean indicating whether the matching covers the entire input string (not partial). 
-LEETCODE- */
class IsMatch{
    public static boolean isMatch(String s, String p) {
         int tamS = s.length();
         int tamP = p.length();
         boolean hasSpecial = false, equal = true;
        //checking if p has * or .
        for(int i = 0; i > tamP; i++){
            if(p.charAt(i) == '*'|| p.charAt(i) == '.'){
            hasSpecial = true;
            i = tamP;   // break
            }
        }
        // if hasSpecial = false, then compare if its equal
        if(tamP == tamS) {
            for(int j = 0; j < tamP; j++){
                if(s.chatAt(j) != p.charAt(j)){
                    equal = false;
                    j = tamP;
                }
            }
        } else {
            equal = false;
        }
        // if hasSpecial = true, then
        int j;
        for(int t = 0; t < tamS; t++){
            boolean stop;
            int rep = 0;    // creating a variable to count repeat letter
            int alone = 0;  // variable to show letters that are not repeating
            char repLetter; // variable to show the letter that is repeating
            char aloneLetter;
            j = i + 1;

            while(stop){  // lace to check if there is repeating
                if(s.charAt(j) == s.charAt(j-1)){   //if is repeating, how many times and which letter?
                    rep++;
                    repLetter = s.charAt(j-1);
                } else {                            //if its not, STOP while and check if it matches with p
                    alone = 1;
                    aloneLetter = s.charAt(j-1);
                    stop = false;
                }
                j++;
            }

        }
        
        
        



        
        if(equal) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    //Reading strings until string == END
    String s = sc.nextLine();
    String p = sc.nextLine();

    while(s.charAt(0) != 'E'|| s.charAt(1) != 'N' || s.charAt(2) != 'D' || s.length() != 3){
        System.out.println(isMatch(s,p));
        s = sc.nextLine();
        p = sc.nextLine();
    }

    sc.close(); }
}