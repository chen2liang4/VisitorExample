package space.clang;


import org.junit.Test;

import java.io.IOException;

public class VisitorTest {
    @Test
    public void test_visitorRow_ABC() throws IOException{
        IVisitor visitor = new VisitorRow();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }

    @Test
    public void test_cancleB_AB() throws IOException{
        IVisitor visitor = new VisitorRow();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }
}
