$(document).ready(function(){
    $('#trigger').on('click', function(e){
        e.preventDefault( );//a태그의 하이퍼 링크 기능 제거
        $(this).toggleClass('active');
        $('#main-menu').toggleClass('active');
        $('#subBg').toggleClass('active');
        $('#menuBg').toggleClass('active');
    });

    $('#main-menu >ul> li:nth-child(1)').on('mouseover', function(e){			 
        $(this).parents('header').find('.sub-menu').removeClass('on');
        $(this).parents('header').find('.one').toggleClass('on');

    });
    $('#main-menu >ul> li:nth-child(2)').on('mouseover', function(e){
        $(this).parents('header').find('.sub-menu').removeClass('on');			 
        $(this).parents('header').find('.two').toggleClass('on');
    });
  
        
       
});