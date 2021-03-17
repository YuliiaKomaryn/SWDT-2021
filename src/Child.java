public class Child extends Removable{

    public Child(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": child");
    }
}
