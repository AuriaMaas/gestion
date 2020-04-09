M.AutoInit();
document.addEventListener('DOMContentLoaded', function() {
    //activar el nav para móvil
    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, {});

    //activar el collapsible
    var elementos = document.querySelectorAll('.collapsible');
    var instancias = M.Collapsible.init(elems, {});
});

/*function calculo() {
    var cantidad = document.getElementById;
}*/
