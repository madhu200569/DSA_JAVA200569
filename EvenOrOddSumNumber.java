import java.util.*;
public class EvenOrOddSumNumber

{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int e=0;
	    int o=0;
	    while(n!=0){
	         int rem=n%10;
	         if(rem%2==0)e+=rem;
	         o+=rem;
	        n=n/10;
	    }
	    System.out.println("even"+e);
	    System.out.println("odd"+o);
	}
}