import java.util.Scanner;

class TwoDynamicArray{
   
    static public void main(String [] args){

        int size1,size2; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lenght of Column Array : ");
        size1=sc.nextInt();
        System.out.println("Enter Lenght of Row Array : ");
        size2=sc.nextInt();  
        int[][] a = new int[size1][size2];  

        for (int i=0; i<size1; i++){    
            System.out.println("Enter Elements  of Column "+i+" Array : ");
            for (int j=0; j<size2; j++){   
                 System.out.println("Enter Elements  of Row "+j+" Array : ");
            a[i][j]=sc.nextInt();  
            }
        }
        System.out.println();
        System.out.println("Element of an Array is : ");  
       
        for (int i=0; i<size1; i++){           
         
            for (int j=0; j<size2; j++){            
                System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
        }
    }
}

