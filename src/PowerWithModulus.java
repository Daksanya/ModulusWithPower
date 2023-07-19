import java.util.Scanner;

public class PowerWithModulus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println(modulusPower(a,b,c));
    }
    static int modulusPower(int a,int b,int c){
        int result=1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        return result%c;
    }
}
