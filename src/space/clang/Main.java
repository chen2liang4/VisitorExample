package space.clang;

public class Main {

    public static void main(String[] args) {
        IVisitor visitor = new VisitorRow();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }
}
