// JavaScript Document

$(".entrada-menu, .boton, .button-aceptar, .button-rechazar, .button-consultar, .button-reg").live('click', function(){
    var pg = $(this).attr("pg");
	
    if(pg == ""){
	alert("no  hay link");
    }else{	
        $("#info").fadeOut('fast', function(){
            $("#info").remove();
            $("#contenido").append("<div id='info'></div>");
            $("#info").load(pg);
        });
    }
});



//Sirve para checar los datos de login
$(".button-entrar").live('click',function(){
	document.form.submit();
});

$(".entrada").hover(function(){
	$(this).addClass("hover");
}, function(){
	$(this).removeClass("hover");
});

$('.button-forma').live('click', function(){
	$("#forma").submit();
});

//***** Verificador de entrada: solo numeros, tab, izquierda, derecha, inicio, fin y punto *****//
$("#telefono").live('keydown', function(event) {

    if(event.keyCode == 46 || event.keyCode == 8 || event.keyCode == 39 || event.keyCode == 37 || event.keyCode == 110 || event.keyCode == 190 || event.keyCode == 9 || event.keyCode == 35 || event.keyCode == 36){
    // Dejamos que pase el evento
    }else if((event.keyCode < 48 || event.keyCode > 57) && (event.keyCode < 96 || event.keyCode > 105 )    ){
        event.preventDefault();
    }
}); 