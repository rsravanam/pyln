<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<style type="text/css">
			 <%@include file="/CSS/Login.css" %>
		</style>
	</head>
<body class="bodyCSS">
	
	<div class="bodyBackgroundCSS">
		<div class="mainFrameCSS">
			<div class="buttonRowCSS">
				<input type="button" value="Sign Up" class="signUpButtonCSS" onclick="location.href='/SpringMVCUsingHibernate/Home.html'">
				<input type="button" value="Login" class="loginPageButtonCSS" onclick="location.href='/SpringMVCUsingHibernate/Login.html'">
			</div>
			
			
			<div class="middleComponentCSS">
				
				<div class="textCSS">
					
					Enter Credentials	
				</div>
				<form:form  action="/SpringMVCUsingHibernate/Login.html" method="POST" name="loginForm">
					<label class="usernameLabelCSS">User Name</label>
						<input type="text" class="usernameFieldCSS" name="loginusername" />
						<div class="usernameErrorFieldCSS">${usernameError}</div>
						
						
					<label class="passwordLabelCSS">Password</label>
						<input type="password" class="passwordFieldCSS" name="loginpassword" />
						<div class="passwordErrorFieldCSS">${passwordError}</div>
					
					<input type="submit" value="Login" class="loginButtonCSS" />
				</form:form>
			</div>
			
			<div style="color:red;text-align:center;top:73%;position:absolute;left:37%">
				<h4>${message}</h4>
			</div>
		</div>
	</div>
	
	 
	
	 
	 
	
 
</body>
</html>