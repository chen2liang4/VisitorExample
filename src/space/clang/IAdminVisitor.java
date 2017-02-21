package space.clang;

public interface IAdminVisitor {
    IPage start();
    void visit(PageA pageA);
    void visit(PageB pageB);
}
