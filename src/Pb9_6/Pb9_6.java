public class Pb9_6 {
    public static String fileZero(String src, int length){
        int srcLen = src.length();

        if(src == null || srcLen == length){
            return src;
        }
        if(length <= 0){
            return "";
        }
        if(srcLen > length){
            return  src.substring(0, length);
        }
        char[] arr = new char[length];
        for(int i=0; i<arr.length; i++){
            arr[i] = '0';
        }
        System.arraycopy(src.toCharArray(), 0, arr,srcLen ,srcLen);

        return new String(arr);
    }
    public static void main(String[] args){
        String src = "12345";
        System.out.println(fileZero(src,10));
        System.out.println(fileZero(src,-1));
        System.out.println(fileZero(src,3));
    }
}
