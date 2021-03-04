public class Operation {
    public void Execute(int a, char oper, int b) {
        if(oper == '+')
        {
            sum summa = new sum(a,oper,b);
        }
        if(oper == '-')
        {
            dif differ = new dif(a,oper,b);
        }
        if(oper == '*')
        {
            mult multi = new mult(a,oper,b);
        }
        if(oper == '/')
        {
            divis divis = new divis(a,oper,b);
        }
    }
}
