import java.util.*;


class HelloWorld {
 
 
  public static void main(String args[]) 
{
   
    System.out.println("add two numbers");
     

   int a=6;
     
  
 int b=5;

  
   int c=a+b;

       
 System.out.println (" sum is "+c);
    }
}

//  fibnocci series 
class HelloWorld 
{

    public static void main(String[] args) 
{
        int a;
   
     int b=0;
   
     int n=10;
  
      for(a=0;a<=n;a++)
  
       {   b=b+a;
    
        System.out.println(b);
    }}
}

// tables 1 to 10 
class HelloWorld {

    public static void main(String[] args) 
{
        int i,j;
    
    for(i=1;i<=10;i++)
    
    {
            for(j=1;j<=10;j++)
          
      System.out.println(i*j);
      
  }
    }
}


//pattern program


class HelloWorld {
 
   public static void main(String[] args)
 {
    int a=1,b;
    

    while(a<=5)
  
  {
        b=1;
       
 while(b<=a)
      
  {
            System.out.print(b);
  
          b++;
        }
    
    System.out.println();
      
  a++;
    }}}


// sorting by selection sort
// Online Java Compiler
// 
Use this editor to write, compile and run your Java code online


class HelloWorld {
    public static void main(String[] args) 
 
   {
        int a[]={1,9,8,13,15,2,5,6,0};
    
    int i,j,l,pos;
     
   for(i=0;i<a.length;i++)
    
    {
            l=a[i];
   
         pos=i;
        
    for(j=i+1;j<a.length;j++)
     
       {
                if(l>a[j])
           
     {
                    l=a[j];
             
       pos=j;
                }
            }
      
      a[pos]=a[i];
        
    a[i]=l;
        }
     
   System.out.print("the sorted list is ");
    
    for(i=0;i<a.length;i++)
    
    System.out.print(a[i]+" ");
    }
} 


//bubble sort

 HelloWorld
 {
public static void printarray(int arr[])

{
    for(int i=0;i<arr.length;i++)
 
   {
        System.out.print(arr[i]+" ");
   
 }
    System.out.println();}
    
 
   public static void main(String[] args) {
 
       int arr[]={7,8,3,5,7,8,23,21,34,45,1};
    
    for(int i=0;i<arr.length-1;i++){
   
     for(int j=0;j<arr.length-i-1;j++){
     
       if(arr[j]>arr[j+1]){
        
        int temp=arr[j];
      
          arr[j]=arr[j+1];
     
           arr[j+1]=temp;
       
     }
        }
        }
   
     printarray(arr);
  
  }
}


//scanner //

import java.util.*;
  
public class ScannerExample { 
 
public static void main(String args[]){  
     
     Scanner in = new Scanner(System.in);  
     
     System.out.print("Enter the no 1: ");  
    
      int a = in.nextInt();  
    
      System.out.print("enter the no 2: ");
    
      int b = in.nextInt();
     
     int sum=a+b;
    
      System.out.print("the sum is "+sum);
     
     in.close();             
   
       }  
}






