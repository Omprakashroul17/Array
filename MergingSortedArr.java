public class MergingSortedArr {
    public static void main(String[] args) {
        int[]a={3,5,6,7,8};
        int[]b={0,3,4,7,9};
        int[]c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&i<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }    
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        for(int e:c){
            System.out.println(e);
        }
    }
}
