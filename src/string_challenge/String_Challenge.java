
package string_challenge;

public class String_Challenge {

    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9";
        String lineParts[] = line.split(",");

        int intArr[] = new int[lineParts.length];
        for (int i = 0; i < lineParts.length; i++) {
            intArr[i] = Integer.parseInt(lineParts[i]);
        }
        
        int temp;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if(intArr[i]> intArr[j]){
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp; 
                }
            }
        }
        
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+", ");
        }
    }
}
