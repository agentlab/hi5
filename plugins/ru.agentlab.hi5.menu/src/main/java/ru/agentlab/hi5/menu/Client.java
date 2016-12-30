package ru.agentlab.hi5.menu;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Client {

    //http://localhost:8080/hi5-demo/menu/index.html
    //http://localhost:8080/ru.agentlab.hi5.menu/
    public static HTMLDocument document = HTMLDocument.current();
    public static HTMLElement menubarContainer = document.createElement("div");
    public static HTMLElement menubar = document.createElement("div");
    public static HTMLElement file = document.createElement("a");
    public static HTMLElement edit = document.createElement("a");
    public static HTMLElement arrange = document.createElement("a");
    public static HTMLElement extras = document.createElement("a");
    public static HTMLElement help = document.createElement("a");
    public static HTMLElement newelement = document.createElement("a");

    public static void main(String[] args) {

        menubar.setAttribute("class", "geMenubar");
        menubarContainer.setAttribute("class", "geMenubarContainer");
        menubarContainer.setAttribute("style", "top: 0px; left: 0px; right: 0px; height: 30px;");

        someMethod(file, "File", "alert('FILE')");
        someMethod(edit, "Edit", "alert('EDIT')");
        someMethod(arrange, "Arrange", null);
        someMethod(extras, "Extras", null);
        someMethod(help, "Help", null);
        someMethod(newelement, "New Element Menu", null);

        menubarContainer.appendChild(menubar);
        document.getBody().appendChild(menubarContainer);

        help.listenClick(evt -> Push());
    }

    private static void Push() {
        HTMLDocument document = HTMLDocument.current();
        HTMLElement p = document.createElement("p");
        p.appendChild(document.createTextNode("NEW LINE"));
        document.getBody().appendChild(p);
    }

    private static void someMethod(HTMLElement newElement, String textNode, String valueOfOnClick) {

        newElement = document.createElement("a");
        newElement.setAttribute("href", "javascript:void(0)");
        newElement.setAttribute("class", "geItem");
        if (valueOfOnClick != null)
        {
            newElement.setAttribute("onclick", valueOfOnClick);
        }
        newElement.appendChild(document.createTextNode(textNode));
        menubar.appendChild(newElement);
    }
}
