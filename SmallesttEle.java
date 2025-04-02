class Smallestelement{
    public static void main(String[] args) {
        int[]a={6,3,7,1,4,9,4};
        int smallest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            } 
        }
        System.out.println(smallest);
    }
}