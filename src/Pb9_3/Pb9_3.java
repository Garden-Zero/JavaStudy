public class Pb9_3 {
    public static void main(String[] args){
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        fullPath = fullPath.trim();
        path = fullPath.substring(0, fullPath.lastIndexOf("\\"));
        fileName = fullPath.substring(fullPath.lastIndexOf("\\")+1, fullPath.length());

        System.out.println(fullPath);
        System.out.println(path);
        System.out.println(fileName);
    }
}
