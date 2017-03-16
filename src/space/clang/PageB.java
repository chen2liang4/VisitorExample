package space.clang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PageB implements IPage {
    private IPage nextPage;
    private boolean cancelClicked;

    public void accept(IVisitor v) throws IOException {
        System.out.println("show page B");
        System.out.println("please confirm if cancle Y/N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String s = System.console().readLine();
        String s = br.readLine();
        cancelClicked = s.equals("Y");
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

    protected void onClick () {

    }
}
