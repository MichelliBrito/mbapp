$("#submeter").click(function(){
	console.log("Publicado com sucesso!")
});

$("#admin").click(function(){
	alert("Adminstrador do blog: Michelli Brito")
});
 

$(function(){
	   $(".resumo").each(function (i) {
	       var text = $(this).text();
	       var len = text.split(".").length;
	       if (len > 1) {
	           var query = text.split(".", 2);
	           query.push('...');
	           res = query.join(' ');
	           $(this).text(res);
	       }
	    });
	});
