package space.clang;


import org.junit.Test;

public class VisitorTest {
    @Test
    public void test_visitorRow_ABC() {
        IVisitor visitor = new VisitorRow();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }

    @Test
    public void test_cancleB_AB() {
        IVisitor visitor = new VisitorRow();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }
}
