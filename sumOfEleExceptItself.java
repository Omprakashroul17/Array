public class sumOfEleExceptItself {
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        int[] ans=sum(arr);
        for(int a:ans){
            System.out.println(a);
        }
    }
    public static int[] sum(int[]arr){
        int n=arr.length;
        int[] ans=new int[n];
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        for(int i=0;i<n;i++){
            ans[i]=totalSum-arr[i];
        }
        return ans;
    }
}
