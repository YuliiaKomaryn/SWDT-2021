public class Web extends DataStorage{

    public Web(String path, String data){
        super(path, data);
    }

    @Override
    public final void getType() {
        System.out.println("\nWeb storage");
    }

    public final void denyAccess(){
        System.out.println("500 Internal Server Error");
    }
}
