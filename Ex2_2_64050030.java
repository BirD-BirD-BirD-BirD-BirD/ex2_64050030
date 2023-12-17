import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//64050030 นาย กิติภูมิ หน่อเนื้อ

public class Ex2_2_64050030 {

    public static final int MAX = 5;
    public static void main(String[] args){
        System.out.println("Welcome to the Application!");
        List<Integer> nums = new ArrayList<>();
        input(nums);

        Sort extended_sort = new Sort();
        extended_sort.selectionSort(nums);
        //extended_sort.mergeSort(nums);
        //extended_sort.insertionSort(nums);
        //sort(nums);

        print(nums);
        
    }

    public static void input(List<Integer> nums){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while(nums.size() < MAX){
            String s = inp.nextLine();

            if(typeCheck(s)){
                int num = Integer.parseInt(s);

                if(rangeCheck(num)) {
                    nums.add(num);
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }
        inp.close();
    }

    public static boolean typeCheck(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    public static boolean rangeCheck(int num){
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }else{ 
            return true;
        }
    }

    public static void sort(List<Integer> nums){
        Collections.sort(nums);
    }

    public static void print(List<Integer> nums){
        for(int num : nums){
            System.out.print(num+" ");
        }            
    }
}