public class Local extends DataStorage{

    public Local(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        System.out.println("\nLocal storage");
    }

}
