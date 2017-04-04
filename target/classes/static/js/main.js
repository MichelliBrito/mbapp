$("#submeter").click(function(){
	console.log("Publicado com sucesso!")
});

$("#admin").click(function(){
	alert("Adminstrador do blog: Michelli Brito")
});



var campo = $(".texto");
campo.on("input", function () {
	   $(".texto").each(function (i) {
	       var text = $(this).text();
	       var t = campo.val();
	       var len = t.split(".").length;
	       if (len > 1) {
	           var query = t.split(".", 2);
	           query.push('...');
	           res = query.join(' ');
	           $(".resumo").val(res);
	           console.log(res);
	       }else{
	    	   $(".resumo").val(t);
	    	   console.log(len);
	    	   console.log(t);
	       }
	   });
}); 



