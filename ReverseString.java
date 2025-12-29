public class ReverseString {
    public static void main(String[]args){
        String store="apple";
        String result="";
        for(int i=store.length()-1;i>=0;i--){
result+= store.charAt(i);
        }
        System.out.println("Reversed string is: " + result);
    }
}
