<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <!--Include All CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Condensed" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.0/animate.min.css" />
    <style type="text/css">
        * {
             margin: 0;
             padding: 0;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
        }

        body {
            margin-top: 20px;
            font-family: "Roboto Condensed", sans-serif;
            font-size: 16px;
            background-color: #f7f8fc;
        	color:#fff;
        }

        .color-blu-one {
            background-color: #003399;
            color: #fff;
        }

        .color-blu-two {
            background-color: #6699ff;
            color: #fff;
        }

        .card {
            border: 0px !important;
        }

        .card a {
            color: #fff;
        }

        .card:hover {
            cursor: pointer !important;
        }
    </style>
    <c:set var = "level1" scope = "session" value = "${level1}"/>
	<c:set var = "level2" scope = "session" value = "${level2}"/>
	<script>
	 function params(){
		return {
		 'level1' : "<c:out value='${level1}'/>",
		 'level2' : "<c:out value='${level2}'/>"
		} 	
	 }
	</script> 
</head>
<body>
        <div class="container-fluid">
                <div class="row row justify-content-center mb-4">
                    <div class="col-sm-4 col-md-4 col-lg-4 text-center justify-content-center align-self-center" id="level-one-head">

                    </div>
                </div>
                <div class="row justify-content-center" id="level-two-head">

                </div>
         </div>           
    <!--Include All JavaScript -->
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="/js/treeview.js"></script>
</body>

</html>