javascript: (function() {
    document.getElementById("colophon").remove();
    
    document.getElementById("sidr-id-menu-item-1033").remove();

    document.getElementById("sidr-id-menu-item-1034").remove();

    const removeElements = (elms) => elms.forEach(el => el.remove());
    removeElements( document.querySelectorAll(".idmuvi-socialicon-share"));

    const elements = document.getElementsByClassName("gmr-notification player-notification global-notification");
    while (elements.length > 0) elements[0].remove();

    while (document.getElementsByClassName('widget widget_text')[0]) {
        document.getElementsByClassName('widget widget_text')[0].remove();
    }

    Array.from(document.getElementsByClassName("entry-footer"))
    .forEach(element => element.remove());

    var social = document.getElementsByClassName("gmr-social-icon clearfix");
    social[0].parentNode.removeChild(social[0]);

    var notif1 = document.getElementsByClassName("gmr-boxaftermenu");
    notif1[0].parentNode.removeChild(notif1[0]);

    var foter2 = document.getElementsByClassName("text-center site-footer");
    foter2[0].parentNode.parentNode.removeChild(foter2[0].parentNode);
    
})();
