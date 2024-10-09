import java.util.*;

public class Problem1 {
    //Constant need to be updated based on the size of the numbers  
    static final int NUM_BITS=8;
    

    public static void main(String[] args)throws Exception {
        System.out.println(toBinary("15"));    
        System.out.println(toBinary("-15"));
    }
    public static List<Integer> toBinary(String num){
        int remainder;
        
        int nums= Integer.parseInt(num);

        List<Integer> binary = new ArrayList<>();

        List<Integer> binaryReversed = binary.reversed();

        if (num.charAt(0)!='-'){
            while (nums>0){
                remainder = nums % 2;
                nums  =  nums/2;
                binary.add(remainder);
            }
            while (binary.size() < NUM_BITS ){
                binary.add(0);
            }
            return binaryReversed;
        }
        else{
            nums = Math.abs(nums);
            while (nums>0){
                remainder = nums % 2;
                nums  =  nums/2;
                binary.add(remainder);

            }
            while (binary.size() <NUM_BITS ){
                binary.add(0);
            }
            binary = binaryReversed;
            binaryReversed=binary.reversed();
            for (int i = 0 ; i <= binary.size()-1 ;i++){

                if (binaryReversed.get(i) == 1){
                    binaryReversed.set(i, 0);    
                }
                else{
                    binaryReversed.set(i, 1);   
                } 
            }
            binary = addBinary(binaryReversed, List.of(1));
            return binary;
        }
    } 
    public static List<Integer> addBinary(List<Integer> a,List<Integer>b){
        List<Integer> sum =  Arrays.asList(new Integer[Math.max(a.size(), b.size())+1]);
        for (int i=0;i<sum.size();i++){
            sum.set(i, 0);
        }
        if (b.size()<a.size()){
            List<Integer> temp = b;
            b = a;
            a = temp;
        }
        b = b.reversed();
        for (int i = a.size()-1; i >= 0; i--){
            int stepsFromRight= a.size()-1-i;
            int bIndex = b.size()-1 - stepsFromRight;
            int sumIndex =sum.size()-1-stepsFromRight;
            List<Integer> addedBits = addbinaryBit(a.get(i), b.get(bIndex));
            if (addedBits.size()==1){
                if (sum.get(sumIndex)==1){
                    if (addedBits.get(0)==1){
                        sum.set(sumIndex,0);
                        sum.set(sumIndex-1,1);
                    }
                }
                else{ 
                    sum.set(sumIndex,(addedBits.get(0)));
                }
            }
            if (addedBits.size()==2){
                sum.set(sumIndex-1,1);
            }
        }
        for (int i = sum.size()-1-a.size();i >= 0 ; i--){
           
            int stepsFromRight= sum.size()-1-i;
            int bIndex = b.size()-1 - stepsFromRight;
            if (bIndex<0){
                break;
            }
            if (sum.get(i)==1){
                if ( b.get(bIndex)==1){
                    sum.set(i,0);
                    sum.set(i-1,1);
                }
            }
            else{ 
                sum.set(i,b.get(bIndex));
            }
        }
        boolean leadingZeros =true;
        List<Integer> output = new ArrayList<>();
        for(int bit:sum){
            if(leadingZeros){
                leadingZeros = bit == 0;
            }
            if(!leadingZeros){
                output.add(bit);
            }
        }
        return output;
    }
    public static List<Integer> addbinaryBit(int a, int b){
        if (a ==1 && b ==1){
           return List.of(1,0);
        }
        if (a+b==1){
            return  List.of(1);
        }
        return List.of(0);
    }
}
