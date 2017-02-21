package space.clang;

import java.io.IOException;

public interface IAdminPage {
    IPage getNextPage();
    void setNextPage(IPage page);
    void accept(IAdminVisitor v) throws IOException;
}
