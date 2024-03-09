import java.util.*;

public class BitManupulation {

    // To know if number is odd or even 
    public static void OddEveninBit(int num){
        int bitmask =1;
        if( (num & bitmask) != 0){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }

    // To get ith bit Bitmask = 1<<i
    public static void Getithbit(int num, int i){
        int Bitmask = 1<<i;
        if( (num & Bitmask) == 0){
            System.out.println("Number at ith place is 0");
        }else{
            System.out.println("Number at ith place is 1");
        }
    }

    // To Set ith bit  i.e at i do 1
    public static int SetithBit(int num, int i){
        int Bitmask = 1<<i;
        return (num|Bitmask);
    }

    // To clear ith bit i.e at i do 0
    public static int ClearithBit(int num, int i){
        int bitmask = ~(1<<i);
        return (num & bitmask);
    }

    // To update ith Bit 
    public static int UpdateithBit(int num, int i, int givenbit){
        /*if(givenbit == 0){
            return ClearithBit(num, givenbit);
        }else{
            return SetithBit(num, givenbit);
        }*/

        num = ClearithBit(num, givenbit);
        int Bitmask = givenbit << i;
        return num | Bitmask;

    }

    // to clear ith bit 
    public static void ClealastithBit (int num, int i){
        int bitmask = ~0<<i;
        System.out.println(num & bitmask);
    }

    // Clear Range of bits
    public static int clearbits(int num, int i, int j){
        int a = (~0<<j+1);
        int b = (1<<i) -1;
        int BitMask = a|b;
        return num & BitMask;
    }

    // Check if number is power of 2 or not 
    public static void powof2(int num){
        if( (num & (num-1)) == 0 ){
            System.out.println("Number comes in power of 2");
        }else{
            System.out.println("Number does not comes in power of 2");
        }
    }

    // Count Set bits in a number 
    public static int totSetBits(int num){
        int count =0; 
        while(num >0){
            if((num & 1) ==  0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Bitwise AND & operator 
        System.out.println((5 & 8));

        //Bitwise OR | operator 
        System.out.println(( 5| 6));

        // Bitwise XOR ^ operator
        System.out.println((5 ^ 6)); 

        // Bitwise One's Complement
        // We use to get negative value because of Most Significant bit if MSB is 0 then + if MSB 1 then -1
        // So ~ usually have 1 at MSB then we find 2 complement first find 1 complement then add 1 to it 
        System.out.println((~5));
        System.out.println((~0));

        //Bitwise Left Shift << operator 
        // Formula (a<<b = a*2^b)
        System.out.println(5<<2);

        // Bitwise Right shift >> Operator
        // Formula = (a>>b = a/2^b)
        System.out.println(6>>1);

        // Check if num is odd or even 
        OddEveninBit(3);
        OddEveninBit(4);
        System.out.println("Enter the number to check for odd or even");
        int num = sc.nextInt();
        OddEveninBit(num);

        // Get ith bit 
        System.out.println("Enter the number get ith bit  ");
        int n = sc.nextInt();
        System.out.println("Enter the ith place");
        int ith = sc.nextInt();
        Getithbit(n,ith);

        // Set ith Bit 
        SetithBit(10, 2);

        // Clear ith Bit 
        ClearithBit(10,1);

        //Update ith bit 
        System.out.println(UpdateithBit(10,2,1));

        // Clear last ith bit
        ClealastithBit(15,2);

        // Clear the range of bits 
        System.out.println(clearbits(10, 2, 7));

        // Check if number is power of 2 or not
        System.out.println("Enter the num to check if it is power of 2 or not");
        int num2 = sc.nextInt();
        powof2(num2);

        //Count Set bits in a number
        System.out.println(totSetBits(10));

    }
    
}
