public class App {
    public static void main(String[] args) throws Exception {
        cwl("Binary Converter Started");
        cwl(Binary_NumberToBinary(83)+" "+Binary_BinaryToNumber(1010011));
        cwl(Binary_NumberToBinary(65)+" "+Binary_BinaryToNumber(1000001));
        
        cw(Binary_BinaryToChar(1010011));
        cw(Binary_BinaryToChar(1000101));
        cw(Binary_BinaryToChar(1001100));
        cw(Binary_BinaryToChar(1000001));
        cw(Binary_BinaryToChar(1001101));

        cwl("\nBinary Converter Ended");
    }

    static String ReverseString(String strVal) {
        String trash = "";
        for (int i = strVal.length() - 1; i >= 0; i--) {
            trash += strVal.charAt(i);
        }
        return trash;
    }

    static void cwl(Object msg) {
        System.out.println(msg);
    }
    static void cw(Object msg)
    {
        System.out.print(msg);
    }

    static int Binary_BinaryToNumber(int number) {
        // rule : 2^charIndex * number(0,1)
        int result = 0;
        String numStr = String.valueOf(number);
        for (int i = numStr.length() - 1; i >= 0; i--) {
            result += 
            Math.pow(2, ((numStr.length() - 1) - i)) * 
            Integer.parseInt(numStr.charAt(i) + "");
        }
        return result;
    }
    static int Binary_NumberToBinary(int number)
    {
        // rule : number%2 += list ->while : number>=2
        // all binary nums ends with 1 -> 1/2=1
        String result="";
        while ((number/2)>=1) {
            result+=String.valueOf(number%2);
            number/=2;
        }
        result+="1";
        return Integer.parseInt(ReverseString(result));
    }
    static String Binary_BinaryToChar(int number)
    {
        return Character.toString(Binary_BinaryToNumber(number));
    }
}
