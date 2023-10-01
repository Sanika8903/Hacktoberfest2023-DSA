package array;
import java.util.*;

public class linear_search {
    
    public static void search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
                if(numbers[i] ==key){
                    System.out.println("number found at location " + i);
                }   
            }
        }
        
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the length of array");
        int a = sc.nextInt();
        int numbers[]= new int[a];
        System.out.println("enter the elements of list");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter the key to search");
        int key =sc.nextInt();
        search(numbers,key);
    }
