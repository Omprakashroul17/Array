public class SecondSmallest {
    public static void main(String[] args) {
        int[]a={5,8,2,4,9,0,0};
        int fs=a[0];
        int ss=a[1];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]==fs)continue;
            if(a[i]<fs){
                ss=fs;
                fs=a[i];
            }
            else if(a[i]<ss){
                ss=a[i];
            }
        }
        System.out.println(ss);
    }
}
