package space.clang;

public class VisitorRow implements IVisitor {
    public IPage start() {
        return new PageA();
    }

    public void visit(PageA page) {
        page.setNextPage(new PageB());
    }

    public void visit(PageB page) {
        if (page.clickOnCancel()) {
            page.setNextPage(null);
        } else {
            page.setNextPage(new PageC());
        }
    }

    public void visit(PageC page) {
        page.setNextPage(null);
    }
}
