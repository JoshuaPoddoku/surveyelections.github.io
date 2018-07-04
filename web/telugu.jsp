<%-- 
    Document   : telugu
    Created on : Jul 3, 2018, 8:56:35 PM
    Author     : joshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <link href="https://fonts.googleapis.com/css?family=Lato|Montserrat|Open+Sans:300|Oswald|Raleway|Roboto" rel="stylesheet">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
           
        <!--jQuery library--> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!--Latest compiled and minified JavaScript--> 
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
    
        <title>VoteForGood</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link  rel="stylesheet" href="style.css">
    </head>
    <body>
        <nav class="nav navbar-inverse">
            <div class="container ">
                <div class="navbar-brand navbar-nav">
                <a class="myfont" href="#">VoteForGood</a>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li class="myfont"><a href="about.html">About us <span class="glyphicon glyphicon-user"></span></a></li>
                </ul>
            </div>
        </nav>
        
        <p>
        <p>    
        
        
        
       
 <div class="container">
     <center>
                     

                <div class="panel panel-default col-sm-8">
                    <div class="panel-heading color_p">
                        <div class="jumbotron col_head">
                            <h3 class="myfont"><strong> Survey for Elections 2019</strong></h3>
                
                            <p>You decide the nation </p>
                            <div class="col-sm-6">  <a href="electionhome.jsp"class="btn btn-success aa">English</a></div> <p><p> <div class="col-sm-6"> <a href="hindi.jsp" class="btn btn-success ab"> हिंदी</a></div>  
                        </div>
                        
                       
                    </div>
                <div class="panel-body col_head">
                   
                    <form class="form-horizontal" action="Elections.java">
                       
                       
                            <input type="text"  class="form-control form-group" name="uname" placeholder="Enter Name / పేరు" >
                             <label> Age / వయస్సు :</label><p>
                           
                                    <input type="radio" name="uage" value="adult">18+<br>
                                   <input type="radio" name="uage" value="child">18-<br>
                                   <label> Constituency / నియోజకవర్గం :</label><p><p>
                                  <select name="uconst" class="form-control " >
                                    <option value="kmm">Khammam</option>
                                    <option value="hyd">Rangareddy</option>
                                    <option value="srpt">Suryapet</option>
                                    <option value="spl">Sathupalli</option>
                                    
                                  </select>   <p><p>
                                   <label  >Party  </label> <p>
                                 <select name="uparty" class="form-control col-lg-10">
                                     <option value="trs">TRS</option>
                                    <option value="tdp">TDP</option>
                                    <option value="ysrcp">YSRCP</option>
                                    <option value="bjp">BJP</option>
                                    <option value="aimim">AIMIM</option>
                                    <option value="cpi">CPI</option>
                                    <option value="srpt">NOTA</option>
                                   
                                   
                                 </select><p><p>
                                    
                                   <button type="submit" class="btn btn-success btn-block">VOTE</button>                                                  
                    </form>                                         
                </div>  
            

                </div>  
    
 </center>                                   
 </div>                                       

</html>

