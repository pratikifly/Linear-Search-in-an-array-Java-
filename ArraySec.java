import java.io.IOException;
import java.util.Scanner;

class ArraySec{
    public static void main(String[] args) throws IOException{
        
        ArrayMain arr1=new ArrayMain(100);
        int elems=10;
        int p;
        System.out.println("type");
        Scanner obj=new Scanner(System.in);
        try{
            for(p=0;p<elems;p++)
        {
            int c=obj.nextInt();
            arr1.setElem(p,c);
        }
        
        for(p=0;p<elems;p++)
        {
            System.out.print(arr1.getElem(p)+" ");
        }
        System.out.println("");
        System.out.printf("Enter the search element\n");
        int searchElem=obj.nextInt();
        
        
        for(p=0;p<elems;p++)
        {
            if(arr1.getElem(p)==searchElem)
               break;
        }
        if(p==elems)
           {
               System.out.printf("Search element not found\n");
           }
        else
           {
               System.out.printf("Search element found at: " + p + "\n"); 
           }
        } finally 
        {
            obj.close();
        }  
    }
}