package space.clang;

public class PageC implements IPage {
    private IPage nextPage;

    public String input;

    public void accept(IVisitor v) {
        System.out.println("show page C");
        System.out.println(this.input);
        v.visit(this);
    }

    public IPage getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(IPage page) {
        this.nextPage = page;
    }
}
