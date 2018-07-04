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
         <style>
             .linktext{
    text-decoration: none;
}
         </style>
    </head>
        <body class="col_head">
        <nav class="nav navbar-inverse">
            <div class="container ">
               <ul class="nav   aa">
                   <li class=" linktext"><h2><a href="electionhome.jsp">VOTEFORGOOD </a></h2></li>
                </ul>
                <ul class="nav navbar-nav  ab">
                    <li class=" linktext"><h2><a href="about.jsp">About us <span class="glyphicon glyphicon-user"></span></a></h2></li>
                </ul>
            </div>
        </nav>
        
        <p>
        <p>    
        
        
        
       
 <div class="container col_head">
     <center>
                      <div class="panel panel-default color_p">
                    <div class="panel-heading color_p">
                        <div class="jumbotron ">
                            <h2 class="myfont"><strong>Election Survey 2019</strong></h2>
                            <p><p>
                               <div class="col-sm-6 ">  
                                   <a href="hindi.jsp" class="btn btn-success aa">?????</a>
                                  
                               </div> 
                            <p><p> 
                               <div  class="col-sm-6"> 
                                   <a href="telugu.jsp" class="btn btn-success ab">??????</a>
                               </div>  
                        </div>
                        
                
                        <p><strong>You decide the nation</strong> </p>
     </div>
                        
                            
                    </div>
                <div class="panel-body">
                   
                    <form class="form-horizontal" action="Elections.java">
                       
                       
                        <input type="text"  class="form-control form-group" name="uname" placeholder="Enter Your Name" >
                             <label> Age :</label><p>
                           
                                    <input type="radio" name="uage" value="adult">18+<br>
                                   <input type="radio" name="uage" value="child">18-<br><p><p>
                                   <label> Constituency  :</label><p>
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
                                   
                                   
                                 </select>
                                   <div><p><p><p>
                                    
                                   <button type="submit" class="btn btn-success btn-block">VOTE</button>    </div>                                              
                    </form>                                         
                </div>  
            

                   
      </div>
 </center>                                   
 </div>                                       
  
</html>

