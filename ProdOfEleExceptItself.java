public class ProdOfEleExceptItself {
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        int[] ans=product(arr);
        for(int a:ans){
            System.out.println(a);
        }
    }
    public static int[] product(int[]arr){
        int n=arr.length;
        int[] ans=new int[n];
        int totalProd=1;
        for(int num:arr){
            totalProd*=num;
        }
        for(int i=0;i<n;i++){
            ans[i]=totalProd/arr[i];
        }
        return ans;
    }
}
