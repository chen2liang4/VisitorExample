package space.clang;

public interface IVisitor {
    IPage start();
    void visit(PageA pageA);
    void visit(PageB pageB);
    void visit(PageC pageC);
}
