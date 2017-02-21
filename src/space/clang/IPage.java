package space.clang;

import java.io.IOException;

public interface IPage {
    IPage getNextPage();
    void setNextPage(IPage page);
    void accept(IVisitor v) throws IOException;
}
