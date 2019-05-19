var obj = (function(){
	
	function makeMainHead(data,container){
		var content = "<div class='card flipInX animated'>";
		content += "<div class='card-body color-blu-one'>" + data.level2;
		content += "</div></div>";
		$(container).html(content);
	}
	
	function makeSubHead(data,container){
		var html = [];
		for(var i = 0;i<data.length;i++){
			var content = "<div class='co-sm-2 col-md-2 col-lg-2 mb-3 text-center justify-content-center align-self-center flipInX animated'>";
			content +="<div class='card'>";
			content +="<div class='card-body color-blu-two'>" + data[i].level3;
			content +="</div></div></div>";
			html[i] = content;
		}
		
		$(container).html(html.join(""));
		
	}
	
	return {
		getData:function(){
			var _param = params();
			var _url = "/dataview?level1=" + _param.level1 + "&level2=" + _param.level2;
			$.ajax({
				url : _url,
				type : "GET",
				contentType : "application/json",
				cache : false,
				success : function(res) {
					makeMainHead(_param,"#level-one-head");
					makeSubHead(res,"#level-two-head");
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