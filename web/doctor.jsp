<%-- 
    Document   : register
    Created on : Mar 23, 2021, 11:25:41 AM
    Author     : ProfessoR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style2.css">
        <title>Registration</title>
        
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        
        

    </head>
    
    <body>
     
        
  
        
        
<div class="container" id="container">
	
	<div class="form-container sign-in-container">
		<form action="DoctorLogin" method="POST">
			<h1>Sign in</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your account</span>
			<input type="text" placeholder="Username" name = "username"/>
			<input type="password" placeholder="Password" name = "password"/>
			<a href="#">Forgot your password?</a>
			<button>Sign In</button><br/>
                        <button class="button"><a class ="none" href="index.html">Home</a></button>
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Welcome Doctor</h1>
				<p>Enter your Username and Password</p>
			</div>
		</div>
	</div>
</div>

<footer>
	
</footer>
        
        
        
        
    </body>
</html>
