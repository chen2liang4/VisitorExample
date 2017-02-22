package space.clang;

public class PageB implements IPage {
    private IPage nextPage;
    private boolean cancelClicked;

    public String context;

    public void accept(IVisitor v) {
        System.out.println("show page B");
        cancelClicked = false;
        this.context = "come from B";
        v.visit(this);
    }

    public IPage getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(IPage page) {
        this.nextPage = page;
    }

    public boolean clickOnCancel() {
        return this.cancelClicked;
    }
}
