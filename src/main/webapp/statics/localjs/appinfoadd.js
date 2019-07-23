$(function(){

	//动态加载所属平台列表
	$.ajax({
		type:"GET",//请求类型
		url:"datadictionarylist.json",//请求的url
		data:{tcode:"APP_FLATFORM"},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			// console.log(data);
			$("#flatformid").html("");
			var options = "<option value=\"\">--请选择--</option>";
			for(var i = 0; i < data.data.length; i++){
				options += "<option value=\""+data.data[i].valueid+"\">"+data.data[i].valuename+"</option>";
			}
			$("#flatformid").html(options);
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("加载平台列表失败！");
		}
	});  
	//动态加载一级分类列表
	$.ajax({
		type:"GET",//请求类型
		url:"categorylevellist.json",//请求的url
		data:{pid:null},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			$("#categorylevel2").html("");
			var options = "<option value=\"\">--请选择--</option>";
			for(var i = 0; i < data.data.length; i++){
				// options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
                options += "<option value=\""+data.data[i].id+"\">"+data.data[i].categoryname+"</option>";
			}
			$("#categorylevel1").html(options);
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("加载一级分类列表失败！");
		}
	});  
	//动态加载二级分类列表
	$("#categorylevel1").change(function(){
		var categoryLevel1 = $("#categorylevel1").val();
		if(categoryLevel1 != '' && categoryLevel1 != null){
			$.ajax({
				type:"GET",//请求类型
				url:"categorylevellist.json",//请求的url
				data:{pid:categoryLevel1},//请求参数
				dataType:"json",//ajax接口（请求url）返回的数据类型
				success:function(data){//data：返回数据（json对象）
					$("#categorylevel2").html("");
					var options = "<option value=\"\">--请选择--</option>";
					for(var i = 0; i < data.data.length; i++){
						// options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
                        options += "<option value=\""+data.data[i].id+"\">"+data.data[i].categoryname+"</option>";
					}
					$("#categorylevel2").html(options);
				},
				error:function(data){//当访问时候，404，500 等非200的错误状态码
					alert("加载二级分类失败！");
				}
			});
		}else{
			$("#categorylevel2").html("");
			var options = "<option value=\"\">--请选择--</option>";
			$("#categorylevel2").html(options);
		}
		$("#categorylevel3").html("");
		var options = "<option value=\"\">--请选择--</option>";
		$("#categorylevel3").html(options);
	});
	//动态加载三级分类列表
	$("#categorylevel2").change(function(){
		var categoryLevel2 = $("#categorylevel2").val();
		if(categoryLevel2 != '' && categoryLevel2 != null){
			$.ajax({
				type:"GET",//请求类型
				url:"categorylevellist.json",//请求的url
				data:{pid:categoryLevel2},//请求参数
				dataType:"json",//ajax接口（请求url）返回的数据类型
				success:function(data){//data：返回数据（json对象）
					$("#categorylevel3").html("");
					var options = "<option value=\"\">--请选择--</option>";
					for(var i = 0; i < data.data.length; i++){
						// options += "<option value=\""+data[i].id+"\">"+data[i].categoryName+"</option>";
                        options += "<option value=\""+data.data[i].id+"\">"+data.data[i].categoryname+"</option>";
					}
					$("#categorylevel3").html(options);
				},
				error:function(data){//当访问时候，404，500 等非200的错误状态码
					alert("加载三级分类失败！");
				}
			});
		}else{
			$("#categorylevel3").html("");
			var options = "<option value=\"\">--请选择--</option>";
			$("#categorylevel3").html(options);
		}
	});
	
	$("#back").on("click",function(){
		window.location.href = "list";
	});
	
	$("#apkname").bind("blur",function(){
		//ajax后台验证--APKName是否已存在
		$.ajax({
			type:"GET",//请求类型
			url:"apkexist.json",//请求的url
			data:{APKName:$("#apkname").val()},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				// console.log(data);
				if(data.status === "empty"){//参数APKName为空，错误提示
                    alert("不能为空！");
				}else if(data.status === "success"){//账号不可用，错误提示
                    alert("该APKName已经存在！");
				}else {
                    alert("该APKName可以使用！");
				}
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert("请求错误！");
			}
		});
	});

});
      
      
      