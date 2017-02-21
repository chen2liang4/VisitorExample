package space.clang;

public class PageB implements IPage {
    private IPage nextPage;

    public void accept(IVisitor v) {
        System.out.println("show page B");
        v.visit(this);
    }

    public IPage getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(IPage page) {
        this.nextPage = page;
    }
}
