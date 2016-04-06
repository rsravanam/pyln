<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<style type="text/css">
   			 <%@include file="/CSS/CssFile.css" %>
   		</style>
	</head>
	
	<body class="bodyCSS">
	
		<div class="bodyBackgroundCSS">
			<div class="mainFrameCSS">
				<div class="buttonRowCSS">
					<input type="button" value="Sign Up" class="signUpButtonCSS" onclick="location.href='/SpringMVCUsingHibernate/Home.html'">
					<input type="button" value="Login" class="loginButtonCSS" onclick="location.href='/SpringMVCUsingHibernate/Login.html'">
				</div>
			
				
			 <form action="/SpringMVCUsingHibernate/Home.html" method="POST" name="registrationForm">
				<div class="middleComponentCSS">
			 
				<label class="firstNameLabelCSS">First Name</label>
					<input type="text" class="firstNameFieldCSS" name="firstName"/>
					<form:errors path="user1.firstName" element="div" cssClass="firstNameErrorFieldCSS"/>
		 
				<label class="lastNameLabelCSS">Last Name</label>
					<input type="text" class="lastNameFieldCSS" name="lastName"/>
					<form:errors path="user1.lastName" element="div" cssClass="lastNameErrorFieldCSS"/>
				
					<select class="genderFieldCSS" name="gender">
  						<option value="Male" style="text-align:center;">I am a Male</option>
  						<option value="Female">I am a Female</option>
					</select>
					
				<label class="mobileLabelCSS">Mobile</label>	
					<input type="text" class="mobileFieldCSS" name="mobile"/>
					<form:errors path="user1.mobile" element="div" cssClass="MobileErrorFieldCSS"/>
				
				
				
				<label class="emailLabelCSS">Email Address</label>
					<input type="text" class="emailFieldCSS" name="email" />
					<form:errors path="user1.email" element="div" cssClass="emailErrorFieldCSS"/>
			
					
				<label class="usernameLabelCSS">User Name</label>
					<input type="text" class="usernameFieldCSS" name="username" />
					<form:errors path="user1.username" element="div" cssClass="usernameErrorFieldCSS"/>
					
					
				<label class="passwordLabelCSS">Password</label>
					<input type="password" class="passwordFieldCSS" name="password"/>
					<form:errors path="user1.password" element="div" cssClass="passwordErrorFieldCSS"/>
					
				
				<label class="confirmPasswordLabelCSS">Confirm Password</label>
					<input type="password" class="confirmPasswordFieldCSS" name="cpassword"/>
					<div class="confirmPasswordErrorFieldCSS">${errormsg}</div>
					
					
				
			</div>
			
				<input type="submit" value="GET REGISTERED" class="submitButtonCSS"/>
			
			</form>
		
		</div>
		</div>
	
	</body>
</html>