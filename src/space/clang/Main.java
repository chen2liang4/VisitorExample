package space.clang;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        IAdminVisitor visitor = new AdminVisitor();

        IPage page = visitor.start();
        while (page != null) {
            page.accept(visitor);
            page = page.getNextPage();
        }
    }
}
