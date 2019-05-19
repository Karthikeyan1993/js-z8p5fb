var obj = (function(){
	
	function makeMainHead(data,container){
		var index = 0;
		var html = [];
		for(var ele in data){
		    var content = "<div class='co-sm-4 col-md-4 col-lg-4 text-center justify-content-center align-self-center flipInX animated'>";
		    content +="<div class='card'>";
		    content +="<div class='card-body color-blu-one'>"+ele+"</div>";
		    content +="</div></div>";
		    html[++index]=content;
		}
		$(container).html(html.join(""));
	}
	
	function makeSubHead(data,container){
		var index = 0;
		var html = [];
		for(var ele in data){
			var content = "<div class='co-sm-6 col-md-6 col-lg-6'>";
			content +="<div class='row'>";
			for(var ele1 in data[ele]){
				if(ele1!="-"){
				content += "<div class='co-sm-3 col-md-3 col-lg-4 mb-3 text-center justify-content-center align-self-center flipInX animated'>";
				content += "<div class='card'>";
				var link = "/treeview?level1=" + ele + "&level2=" + ele1;
				content += "<a class='card-body color-blu-two' href=" + link + ">" + ele1 + "</a>";
			    content += "</div></div>";
				}
			}
			content += "</div></div>";
			html[++index] = content;
		}
		$(container).html(html.join(""));
	}
	
	
	return {
		getData:function(){
			$.ajax({
				url : "/data",
				type : "GET",
				contentType : "application/json",
				cache : false,
				success : function(res) {
					makeMainHead(res,"#level-one-h");
					makeSubHead(res,"#level-two-h");
				},
				error : function(err) {
				}
			});
		}
	}
})();

$(function(){
	console.warn('---script started---');
	obj.getData();
});