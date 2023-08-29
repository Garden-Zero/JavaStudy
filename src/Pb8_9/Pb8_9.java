class UnsupportedFunctionException extends RuntimeException{
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errorCode){
        super(msg);
        ERR_CODE = errorCode;
    }
    UnsupportedFunctionException(String msg){
        ERR_CODE = 100;
    }
    public int getErrorCode(){
        return ERR_CODE;
    }
    public String getMessage(){
        return "["+getErrorCode()+"] " + super.getMessage();
    }
}
public class Pb8_9 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}
