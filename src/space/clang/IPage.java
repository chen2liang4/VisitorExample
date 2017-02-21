package space.clang;

public interface IPage {
    IPage getNextPage();
    void setNextPage(IPage page);
    void accept(IVisitor v);
}
