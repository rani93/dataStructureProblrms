package String;

public class largestOddNumber {
    public String largestOddNumbe(String num) {
        for(int i= num.length()-1;i>=0;i--){
            int digit = Integer.parseInt(num.charAt(i)+"");
            if(digit%2!=0){
                return num.substring(0,i+1);

            }

        } 
        return ""; 
        
    }
}
