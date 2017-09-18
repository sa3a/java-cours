public class Col{

public static void main(String[] args){

System.out.println("Hello");
int first=Integer.valueOf(args[0]);
int second=Integer.valueOf(args[1]);
int sum = first+second;
int R = first-second;
int P = first*second;
float C = first/second;
double St = Math.pow(first,second);

System.out.println("Summa: "+sum);
System.out.println("Raznost: "+R);
System.out.println("Proizvedenie: "+P);
System.out.println("Castnoe: "+C);
System.out.println("Stepen: "+St);
}

}