// JavaScript Document
// Activa la notificacion
function notifica(mensaje){
	$("#notificacion").html(mensaje).fadeIn('slow');
}

function quitaNotif(){
	$("#notificacion").fadeOut('fast').html(mensaje);
}