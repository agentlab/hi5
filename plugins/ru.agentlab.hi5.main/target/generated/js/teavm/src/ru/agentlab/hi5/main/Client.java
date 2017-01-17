package ru.agentlab.hi5.main;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Client {

    public static HTMLDocument document = HTMLDocument.current();
    public static HTMLElement menubarContainer = document.createElement("div");
    public static HTMLElement menubar = document.createElement("div");
    public static HTMLElement toolbarContainer = document.createElement("div");
    public static HTMLElement toolbar = document.createElement("div");
    public static HTMLElement sidebarContainer = document.createElement("div");
    public static HTMLElement sidebar = document.createElement("div");
    public static HTMLElement sidebarContainer2 = document.createElement("div");
    public static HTMLElement sidebar2 = document.createElement("div");
    public static HTMLElement diagramContainer = document.createElement("div");
    public static HTMLElement diagram = document.createElement("div");
    public static HTMLElement split = document.createElement("div");
    public static HTMLElement footerContainer = document.createElement("div");
    public static HTMLElement footer = document.createElement("div");

    public static void main(String[] args) {
        document.getBody().setAttribute("class", "geEditor");
        insert(menubar, "geMenubar", "", menubarContainer, "Тут меню");
        insert(menubarContainer, "geMenubarContainer", "top: 0px; left: 0px; right: 0px; height: 30px;", null, "");
        insert(toolbar, "geToolbar", "", toolbarContainer, "Тут тулбар");
        insert(toolbarContainer, "geToolbarContainer", "left: 0px; right: 0px; top: 30px; height: 34px;", null, "");
        insert(sidebar, "geSidebar", "", sidebarContainer, "Тут инструменты");
        insert(sidebarContainer, "geSidebarContainer", "left: 0px; top: 65px; width: 204px; bottom: 28px;", null, "");
        insert(sidebar2, "geSidebar", "", sidebarContainer2, "Тут параметры");
        insert(sidebarContainer2, "geSidebarContainer",
            "right: 0px; z-index: 1; overflow-x: hidden; overflow-y: auto; font-size: 12px; top: 65px; width: 240px; bottom: 28px; background-color: whitesmoke;",
            null, "");
        insert(diagramContainer, "geDiagramContainer geDiagramBackdrop",
            "right: 240px; left: 212px; top: 65px; bottom: 28px; cursor: default; overflow: auto;", null,
            "Тут диаграммы");
        insert(split, "geHsplit", "width: 8px; top: 65px; bottom: 28px; left: 204px;", null, "");
        insert(footer, "geFooter", "", footerContainer, "");
        insert(footerContainer, "geFooterContainer",
            "left: 0px; right: 0px; bottom: 0px; z-index: 10004; height: 28px;", null, "");

    }

    private static void insert(HTMLElement Element, String Class, String Style, HTMLElement Child, String Text) {
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        Element.appendChild(document.createTextNode(Text));
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }
}
