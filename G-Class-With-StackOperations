#Generic Class with Stack Operation on different datatypes.

package testgeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_ClassTest {

   static BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int ch;
        do{
            System.out.println("Welcome to Stack Development....");
            run();
            System.out.println("Do you want to continue....\nPress 1...");
             ch=Integer.parseInt(b.readLine());
        }
        while (ch==1);
    }

    static void run() throws IOException {
        System.out.println("Hello... Which Stack Do You Create..\nPlease Type...\n1.IntegerType\n2.DoubleType\n3.StringType");
        switch (Integer.parseInt(b.readLine())) {
            case 1 -> {
                System.out.println("Enter Size of Stack...");
                int o=Integer.parseInt(b.readLine());
                Stck<Integer> sI;
                sI = new Stck<Integer>(o);
                do {
                    doOps(sI);
                    System.out.println("For Continue....Press 1.");
                }
                while (Integer.parseInt(b.readLine())==1);
            }
            case 2 -> {
                System.out.println("Enter Size of Stack...");
                int o=Integer.parseInt(b.readLine());
                Stck<Double> sF;
                sF = new Stck<Double>(o);
                do {
                    doOps(sF);
                    System.out.println("For Continue....Press 1.");
                }
                while (Integer.parseInt(b.readLine())==1);
            }
            case 3 -> {
                System.out.println("Enter Size of Stack...");
                int o=Integer.parseInt(b.readLine());
                Stck<String> sC;
                sC = new Stck<String>(o);
                do {
                    doOps(sC);
                    System.out.println("For Continue....Press 1.");
                }
                while (Integer.parseInt(b.readLine())==1);
            }
            default -> throw new IllegalStateException("Unexpected value: " + b.readLine());
        }
        }

   static <typ> void doOps(Stck<typ> t) throws IOException {
        int n=t.size;
       System.out.println("Which Operation you want to do....\nPress No for....\n1.Push \n2.Pop \n3.Display\n");
        switch (Integer.parseInt(b.readLine())){
            case 1:if(!t.isfull()) {
                System.out.println("Press No of elements to Push...");
                int el = Integer.parseInt(b.readLine());
                if(el<=(n)) {
                    System.out.println("Enter Elements.");
                    for (int i = 0; i < el; i++)
                        t.pushEle((typ) b.readLine());
                }else
                    System.out.println("Invalid Number...");
            }else
                System.out.println("Stack Overflow....");
            break;
            case 2:if(!t.isEmpty()){
                System.out.println("Press No of Element to Pop....");
                int pl=Integer.parseInt(b.readLine());
                if(pl<=n){
                    System.out.println("Deleted Elements Are...");
                    for(int i=0;i<pl;i++)
                        System.out.println(t.popEle());
                }
                else  System.out.println("Invalid Number....");
            }else System.out.println("Stack Underflow...");
            break;
            case 3:System.out.println("Elements Present in Stack...");
                    t.disPlay();
                    break;
            default:System.out.println("Invalid Choice...");break;
    }
  }
}

public class Stck<J>{
    private J ar[];
    private int top;
    public int size;

    //Constructor
    Stck(int sz){
        size=sz;top=-1;
        ar =(J[])new Object[sz];
    }

    boolean isfull(){
        if(top==size)
            return true;
        else
            return false;
    }
    boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    void pushEle(J dt){
        top++;ar[top]=dt;
    }

    J popEle(){
        J vl=ar[top];top--;
        return vl;
    }
    void disPlay(){
        for(int i=0;i<=top;i++)
            System.out.printf("%s\n",ar[i]);
    }
}
