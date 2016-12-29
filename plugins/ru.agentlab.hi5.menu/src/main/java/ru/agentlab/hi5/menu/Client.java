package ru.agentlab.hi5.menu;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Client {
    public static void main(String[] args) {
        HTMLDocument document = HTMLDocument.current();
        //HTMLElement div = document.createElement("div");
        //HTMLElement p = document.createElement("p");
        //HTMLElement script = document.createElement("script");
        //HTMLElement menubar = document.createElement("a");
        HTMLElement menubarContainer = document.createElement("div");
        HTMLElement menubar = document.createElement("div");
        HTMLElement file = document.createElement("a");
        HTMLElement edit = document.createElement("a");
        HTMLElement arrange = document.createElement("a");
        HTMLElement extras = document.createElement("a");
        HTMLElement help = document.createElement("a");

        help.listenClick(evt -> Push());

        menubar.setAttribute("class", "geMenubar");
        menubarContainer.setAttribute("class", "geMenubarContainer");
        menubarContainer.setAttribute("style", "top: 0px; left: 0px; right: 0px; height: 30px;");
        //menubar.setAttribute("href", "javascript:void(0);");
        //menubar.setAttribute("class", "geItem");
        file.setAttribute("href", "javascript:void(0)");
        file.setAttribute("class", "geItem");
        file.setAttribute("onclick", "alert('FILE')");


        edit.setAttribute("href", "javascript:void(0);");
        edit.setAttribute("class", "geItem");
        edit.setAttribute("onclick", "alert('EDIT')");

        arrange.setAttribute("href", "javascript:void(0);");
        arrange.setAttribute("class", "geItem");

        extras.setAttribute("href", "javascript:void(0);");
        extras.setAttribute("class", "geItem");

        help.setAttribute("href", "javascript:void(0);");
        help.setAttribute("class", "geItem");

        //script.appendChild(document.createTextNode("bind: function(scope, funct){return function(){return funct.apply(scope, arguments);};},"));
        //div.appendChild(document.createTextNode("TeaVM generated element"));


        //div.appendChild(document.createTextNode("KURSACH SDELAN"));
        //https://jgraph.github.io/mxgraph/javascript/examples/grapheditor/www/index.html

        //http://localhost:8080/teavmfirstapp/index.html
        //p.appendChild(document.createTextNode("paragraph"));
        //menubar.appendChild(document.createTextNode("File"));
        //menubar.appendChild(document.createTextNode("View"));
        //menubar.appendChild(document.createTextNode("Edit"));
        file.appendChild(document.createTextNode("File"));
        edit.appendChild(document.createTextNode("Edit"));
        arrange.appendChild(document.createTextNode("Arrange"));
        extras.appendChild(document.createTextNode("Extras"));
        help.appendChild(document.createTextNode("Help"));

        menubarContainer.appendChild(menubar);

        menubar.appendChild(file);
        menubar.appendChild(edit);
        menubar.appendChild(arrange);
        menubar.appendChild(extras);
        menubar.appendChild(help);

        //document.getBody().appendChild(script);
        //document.getBody().appendChild(p);
        //document.getBody().appendChild(div);
        //document.getBody().appendChild(menubar);

        //document.getBody().appendChild(file);
        document.getBody().appendChild(menubarContainer);
        //document.getBody().appendChild(file);
        //document.getBody().appendChild(edit);
        //document.getBody().appendChild(help);
        //document.getBody().menubar.innerHTML("Edit");
        //document.getBody().appendChild(a);
/*
//new
HTMLSourceElement sourceMp4 = document.createElement("source").cast();
sourceMp4.setSrc("http://media.w3.org/2010/05/sintel/trailer.mp4");
sourceMp4.setAttribute("type", "video/mp4");

HTMLSourceElement sourceWebm = document.createElement("source").cast();
sourceWebm.setSrc("http://media.w3.org/2010/05/sintel/trailer.webm");
sourceWebm.setAttribute("type", "video/webm");

HTMLSourceElement sourceOgv = document.createElement("source").cast();
sourceOgv.setSrc("http://media.w3.org/2010/05/sintel/trailer.ogv");
sourceOgv.setAttribute("type", "video/ogg");

HTMLElement p = document.createElement("p");
p.appendChild(document.createTextNode("Your user agent does not support the HTML5 Video element."));

HTMLVideoElement video = document.createElement("video").cast();
video.setControls(true);
video.setPreload("none");
video.setMediaGroup("myVideoGroup");
video.setPoster("http://media.w3.org/2010/05/sintel/poster.png");
video.appendChild(sourceMp4);
video.appendChild(sourceWebm);
video.appendChild(sourceOgv);
video.appendChild(p);

HTMLElement divVideo = document.createElement("div");
divVideo.appendChild(video);

HTMLElement divButtons = document.createElement("div")
        .withAttr("id", "button")
        .withChild("button", elem -> elem.withText("load()").listenClick(evt -> video.load()))
        .withChild("button", elem -> elem.withText("play()").listenClick(evt -> video.play()))
        .withChild("button", elem -> elem.withText("pause()").listenClick(evt -> video.pause()))
        .withChild("br")
        .withChild("button", elem -> elem.withText("currentTime+=10")
                .listenClick(evt -> video.addCurrentTime(10)))
        .withChild("button", elem -> elem.withText("currentTime-=10")
                .listenClick(evt -> video.addCurrentTime(-10)))
        .withChild("button", elem -> elem.withText("currentTime-=50")
                .listenClick(evt -> video.setCurrentTime(50)))
        .withChild("br")
        .withChild("button", elem -> elem.withText("playbackRate++")
                .listenClick(evt -> video.addPlaybackRate(1)))
        .withChild("button", elem -> elem.withText("playbackRate--")
                .listenClick(evt -> video.addPlaybackRate(-1)))
        .withChild("button", elem -> elem.withText("playbackRate+=0.1")
                .listenClick(evt -> video.addPlaybackRate(0.1)))
        .withChild("button", elem -> elem.withText("playbackRate-=0.1")
                .listenClick(evt -> video.addPlaybackRate(-0.1)))
        .withChild("br")
        .withChild("button", elem -> elem.withText("volume+=1").listenClick(evt -> video.addVolume(0.1F)))
        .withChild("button", elem -> elem.withText("volume-=1").listenClick(evt -> video.addVolume(-0.1F)))
        .withChild("button", elem -> elem.withText("mute").listenClick(evt -> video.setMuted(true)))
        .withChild("button", elem -> elem.withText("unmute").listenClick(evt -> video.setMuted(false)));

HTMLBodyElement body = document.getBody();
body.appendChild(divVideo);
body.appendChild(divButtons);
//new end
 * 
 */
    }

    private static void Push() {
    	HTMLDocument document = HTMLDocument.current();
        HTMLElement p = document.createElement("p");
        p.appendChild(document.createTextNode("NEW LINE"));
        document.getBody().appendChild(p);
    }

    //new

}


