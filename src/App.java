import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int c = 0;
        int b = 0;
        int total = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < total; i++){
            String[] arr = sc.nextLine().split(" ");
            
            if(arr[1].equals("F")){
                b++;
            }else{
                c++;
            }
        }

        System.out.println(c +" carrinhos");
        System.out.println(b +" bonecas");

        sc.close();
    }
}
