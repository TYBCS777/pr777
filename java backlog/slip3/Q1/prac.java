class prac{
    public static void main(String[] args){
        String name[]=new String[10];
        int l=args.length;
        String temp;
        for(int i=0;i<l;i++){
            name[i]=args[i];
        }
        for(int j=0;j<l;j++){
            for(int k=j+1;k<l;k++){
                if((name[j].compareTo(name[k]))<0){
                    temp=name[j];
                    name[j]=name[k];
                    name[k]=temp;
                }
            }
        }
        System.out.println("Sorted City Are-");
        for(int i=0;i<l;i++){
            System.out.println(name[i]);
        }
    }
}