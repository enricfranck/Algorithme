public class Main {
	//fonction somme
	public static int Somme(int a,int b) {
		return a+b;
	}
	
	//calcul de factoriel d'un nombre positif
	public static int factoriel(int n) {
		if(n==0 || n==1)
			return 1;
		else
			return n*factoriel(n-1);
					
	}
	
	//verification si a divise b
	public static boolean divise(int a, int b) {
		if(a%b==0)
			return true;
		else
			return false;
	}
	
	//calcule rest et quotient
	public static void QuotRest(int a,int b) {
		int q=1;
		int r=a;
		
		while(r>=b) {
			q=(int)a/b;
			r=r%b;
		}
		System.out.println("pour  "+a+ " divisé par  "+b);
		System.out.println("le Quotient est "+q+ " et le Reste est "+r);
	}
	
	//virification d'un caractère
	public static boolean voyelle(char c) {
		boolean voyelle=false;
		switch (c) {
		case 'a':
			voyelle=true;
			break;
		case 'e':
			voyelle=true;
			break;
		case 'o':
			voyelle=true;
			break;
		case 'i':
			voyelle=true;
			break;
		case 'u':
			voyelle=true;
			break;
		case 'y':
			voyelle=true;
			break;
		default:
			voyelle=false;
			break;
		}
		return voyelle;
	}
	
	//Procedure permute
	public static void permute(int a,int b) {

		System.out.println("Avant pemutation ");
		System.out.println("la valeur de A est "+a);
		System.out.println("la valeur de B est "+b);
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("Après pemutation ");
		System.out.println("la valeur de A est "+a);
		System.out.println("la valeur de B est "+b);
	}
	// calcul de la valeur absolue
	public static int Vabs(int a) {
		if(a>0)
			return a;
		else
			return -a;
	}
	
	public static void main(String[] args) {
		int a=15; int b=4; char c='e'; int d=-2;
		System.out.println("///////////////////////////");
		System.out.println(a+" + "+b+"= "+Somme(a, b));
		System.out.println("///////////////////////////");
		System.out.println(b+"!= "+factoriel(b));
		System.out.println("///////////////////////////");
		System.out.println(b+" divise "+a+" est "+divise(a, b));
		System.out.println("///////////////////////////");
		QuotRest(a, b);
		System.out.println("///////////////////////////");
		System.out.println(c+" est une voyelle est "+voyelle(c));
		System.out.println("///////////////////////////");
		permute(a, b);
		System.out.println("la valeur absolue de "+d+" est "+Vabs(d));
		System.out.println("///////////////////////////");
		
		
	}

}
