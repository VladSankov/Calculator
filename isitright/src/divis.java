class divis extends Operation{
    public divis(int a, char oper, int b){
        if(b == 0)
        System.out.println("ERROR");
        else
        {
            if(a % b == 0)
                System.out.println(a / b);
            else
                System.out.println((double)a / (double)b);
        }


    }
}