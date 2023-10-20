puplic class fuzzbuzz{
    puplic static void main(String[] args){
        System.out.print("Number : ")
        Scanner scan=new Scanner(System.in)
        int n=0;
        n=scan.nextInt();
        if(n%3==0){
            System.out.println("Buzz");
        }
        else if(n%5==0){
            System.out.println("Fuzz");
        }
        else if((n%5==0) && (n%3==0)){
            System.out.println("FuzzBuzz");
        }
        else{
            System.out.println(n);
        }
    }
}
