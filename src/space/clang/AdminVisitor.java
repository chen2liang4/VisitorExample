package space.clang;

public class AdminVisitor implements IAdminVisitor {
    public IPage start() {
        return new PageB();
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
}
