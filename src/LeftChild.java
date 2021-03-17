public class LeftChild extends Removable{

    public LeftChild(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": left child");
    }
}
