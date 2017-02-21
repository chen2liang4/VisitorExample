package space.clang;

public class Main {

    public static void main(String[] args) {
        IVisitor visitor = new AdminVisitor();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }
}
