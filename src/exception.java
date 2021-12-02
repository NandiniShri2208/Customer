import java.util.InputMismatchException;
import java.util.Scanner;

class TestMain{
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index");

        try{
            int index=sc.nextInt();
            System.out.println(arr[index]);
            System.out.println("the array element successfully accessed");
        }
        catch(InputMismatchException e){
            System.out.println("invalid input type");
        }


        catch(Exception e){
            System.out.println("parent exception has occurred");
        }
        System.out.println("rest of the code");
    }
}