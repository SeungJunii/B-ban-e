<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = (String)session.getAttribute("idKey");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Kinds of cocktails</title>
<link rel="shortcut icon" href="imgs/favicon.ico">
<link rel="stylesheet" href=
"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
<link rel="stylesheet" href="../css/reset.css">
<link rel="stylesheet" href="../css/common.css">
<link rel="stylesheet" href="../css/fhd.css" media="screen and (min-width:1400px)">
<link rel="stylesheet" href="../css/hd.css" media="screen and (min-width:1000px) and (max-width:1399px)">
<link rel="stylesheet" href="../css/tb.css" media="screen and (min-width:700px) and (max-width:999px)">
<link rel="stylesheet" href="../css/sm.css" media="screen and (max-width:699px)">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="../js/common.js"></script>
<script src="../js/jquery.isotope.js"></script>
<script src="../js/sub02.js"></script>

<body>
<header>    
        <nav>
            <a href="#" id="trigger">
                <span></span>
                <span></span>
            </a>
            <h1><a href="../index.jsp"><img src="../imgs/logo.png" alt="logo"></a></h1>
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

<div class="clear"></div>