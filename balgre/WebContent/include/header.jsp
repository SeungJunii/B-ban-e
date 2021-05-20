<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String id = (String)session.getAttribute("idKey");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initail-scale=1.0">
<title>Ark Academy</title>
<link href="../imgs/favicon.ico" rel="shortcut icon">
<link href="../imgs/favicon.ico" rel="shortcut icon" type="image/x-icon">
<link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,700|Titillium+Web:400,600&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Crimson+Text" rel="stylesheet">
<link rel="stylesheet" href="../fontAwesome/css/font-awesome.min.css">
<link rel="stylesheet" href=
"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
<link rel="stylesheet" href="../css/common.css">
<link rel="stylesheet" href="../flexSlider/flexslider.css">
<link rel="stylesheet" href="../bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="../css/addrbook.css">
<link rel="stylesheet" href="../css/member-style.css">
<link rel="stylesheet" href="../css/board-style.css">
<link rel="stylesheet" href="../css/reset.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="../flexSlider/jquery.flexslider-min.js"></script>
<script src="../bootstrap/bootstrap.min.js"></script>
<script src="../js/common.js"></script>
<script>
	$(document).ready(function(e) {
		$('#dropdown li').mouseover(function( ) {
			$(this).find('.submenu').stop( ).slideDown( );			
		});
		$('#dropdown li').mouseleave(function( ) {
			$(this).find('.submenu').stop( ).slideUp( );
		});		
		
		$('.flexslider').flexslider({ animation: "slide" });
	});
</script>
<style type="text/css">
.balogo {margin-top:-5px;}
</style>
</head>

<body>
<header>    
        <nav>
            <a href="#" id="trigger">
                <span></span>
                <span></span>
            </a>
            <h1 class="balogo"><a href="../index.jsp"><img src="../imgs/logo.png" alt="logo"></a></h1>
            <ul class="topmenu pc">
                <%	if(id != null) { %>        	
	        	<li><a href="#"><span class="glyphicon glyphicon-user"></span><strong>&nbsp; <%=id%></strong>님</a></li>
	        	<li><a href="../member/logout.jsp">로그아웃</a></li>
	        	<li><a href="../member/memberUpdate.jsp">정보수정</a></li>
<%	}else { %>
				<li><a href="../member/login.jsp">로그인</a></li>
	            <li><a href="../member/member.jsp">회원가입</a></li>
<%	} %>             
            </ul>
            <ul class="topmenu mobile">
                <%	if(id != null) { %>        	
	        	<li><a href="#"><span class="glyphicon glyphicon-user"></span><strong>&nbsp; <%=id%></strong>님</a></li>
	        	<li><a href="../member/logout.jsp">로그아웃</a></li>
	        	<li><a href="../member/memberUpdate.jsp">정보수정</a></li>
<%	}else { %>
				<li><a href="#"><i class="fas fa-sign-in-alt"></i></a></li>
                <li><a href="#"><i class="fas fa-user"></i></a></li>  
<%	} %>             
            </ul>
        </nav>
        <div id="main-menu">
            <ul >
                <li><a href="../balgre/sub01.jsp">01. about cocktails</a></li>
                <li> <a href="../balgre/sub02.jsp">02. kinds of cocktails</a></li>
                <li><a href="../balgre/sub03.jsp">03. education</a></li>
                <li><a href="../board/list.jsp">04 .reservation</a></li>
            </ul> 
        </div>       
        <div id="subBg">
            <ul class="sub-menu one">
                <li><a href="../balgre/sub01.jsp#about">칵테일이란</a></li>
                <li><a href="../balgre/sub01.jsp#history">칵테일의 기원</a></li>
            </ul>
            <ul class="sub-menu two">
                <li><a href="../balgre/sub02.jsp#kinds">칵테일의 종류</a></li>
                <li><a href="../balgre/sub02.jsp#make">칵테일의 제조법</a></li>
            </ul>
        </div>
        <div id="menuBg"><a href="#"></a></div> 
    </header>
<%//BootstrapDropdownmenu:end%>
<%// FlexSlider:start %>
<section>
	<div class="flexslider">	
        <ul class="slides">
            <li><a href="#"><img src="../imgs/slide1.jpg" alt="start space travel"></a></li>
            <li><a href="#"><img src="../imgs/slide2.jpg" alt="byeolmaro observatory"></a></li>           
        </ul>        
    </div>    
</section>
<%// FlexSlider:end %>
