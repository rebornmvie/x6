javascript: (function() {

    const removeElements = (elms) => elms.forEach(el => el.remove());
    removeElements( document.querySelectorAll(".idmuvi-social-share"));

    while (document.getElementsByClassName('idmuvi-topplayer')[0]) {
        document.getElementsByClassName('idmuvi-topplayer')[0].remove();
    }

    Array.from(document.getElementsByClassName("entry-footer"))
    .forEach(element => element.remove());

    var topbanr = document.getElementsByClassName("idmuvi-topbanner-aftermenu");
    topbanr[0].parentNode.removeChild(topbanr[0]);

    var foter = document.getElementsByClassName("text-center site-footer");
    foter[0].parentNode.parentNode.removeChild(foter[0].parentNode);

    var sbox = document.getElementsByClassName("gmr-notification player-notification");
    if (sbox.length > 0){
    sbox[0].parentNode.removeChild(sbox[0]);
    }

    if (document.getElementById("disqus_thread")){
    document.getElementById("disqus_thread").style.display = 'none';}

    if (document.getElementById("gmr-topnavresponsive-menu")){
    document.getElementById("gmr-topnavresponsive-menu").remove();}

    btndwnld = document.getElementById("download");
    btndwnld.parentNode.removeChild(btndwnld);

    document.getElementById("overlay").remove();

})();
