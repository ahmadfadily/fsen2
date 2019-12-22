package Fsen.Website;

import java.util.LinkedList;
import java.util.List;

public class Website {
    List<Webpage> pages;
    int projectCode;

    public Website(int projectCode) {
        this.projectCode = projectCode;
        pages = new LinkedList<>();
    }


}
