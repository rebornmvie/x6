javascript: (function() {
    var wa = document.getElementsByClassName('fa fa-whatsapp');
    wa[0].parentNode.parentNode.removeChild(wa[0].parentNode);
    var tg = document.getElementsByClassName('fa fa-paper-plane');
    tg[0].parentNode.parentNode.removeChild(tg[0].parentNode);
    var spamdl = document.getElementsByClassName('list-inline gmr-download-list');
    spamdl[0].parentNode.parentNode.removeChild(spamdl[0].parentNode);
    var spamlink = document.getElementsByClassName('gmr-notification player-notification global-notification');
    spamlink[0].parentNode.removeChild(spamlink[0]);
})()