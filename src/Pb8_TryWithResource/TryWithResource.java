class WorkException extends Exception{
    WorkException(String msg){super(msg);}
}
class CloseExcpetion extends Exception{
    CloseExcpetion(String msg){super(msg);}
}
class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exception("+exception+")이 호출됨");
        if(exception){
            throw new WorkException("WorkException 발생");
        }
    }

    public void close() throws CloseExcpetion{
        System.out.println("close()가 호출됐고 CloseException 발생 예정");
        throw new CloseExcpetion("CloseException 발생");
    }
}


public class TryWithResource{
    public static void main(String[] args){
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseExcpetion e){
            e.printStackTrace();
        }

        System.out.println();
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseExcpetion e){
            e.printStackTrace();
        }
    }
}