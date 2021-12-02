public class A{
    public static void main(String args[]) {
        int arr[]=new int[5];
        int sum=0;
        int avg;
        if(args.length>0){
            for(int i=0;i<args.length;i++) {
                try {
                    arr[i] = Integer.parseInt(args[i]);
                }
                catch(NumberFormatException obj){
                    System.out.println("invalid input type");
                }
            }
        }
        for(int i=0;i<5;i++){
         sum+=arr[i];
        }
        avg=sum/5;
        System.out.println(sum+" "+avg);
    }
}
