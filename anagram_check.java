import java.util.*;

public class Anagram_check{
    static final int Char=256;
    public static  boolean anagram(String t,String patt){
                int pl=patt.length();
                int tl=t.length();
                for(int i=0;i<tl-pl;i++){
                      if( is_anagram(t,patt,i))
                       return true;
                        }
                        return false;
                }
public static boolean is_anagram(String t,String p,int i){
int count[]=new int[Char];
for(int j=0;j<p.length();j++){
        count[p.charAt(j)]++;
        count[t.charAt(i+j)]--;
}
       for(int j=0;j<Char;j++){
        if(count[j]!=0){
            return false;
        }
       }                 
return true;
}
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the text string");
        String s1 = sc.nextLine();
        System.out.println("enter the patttern string");
        String s2 = sc.nextLine();
System.out.println(anagram(s1, s2));
    }
}



