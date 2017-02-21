package space.clang;

public class PageA implements IPage, IAdminPage {
    private IPage nextPage;

    public void accept(IVisitor v) {
        System.out.println("show page A");
        v.visit(this);
    }

    public void accept(IAdminVisitor v) {
        System.out.println("show page A for Administrator");
        v.visit(this);
    }

    public IPage getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(IPage page) {
        this.nextPage = page;
    }
}
