<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complex form handling</title>
</head>
<body>
		<h3>Complex form Handling</h3>
		<br/>
		<form action="handleForm" method="post" >
			Your Name :<input type="text" name="name">
			
			<br/>
			<br/>
			Your Id:<input type="text" name="id">
			
			<br/>
			<br/>
			Your DOB:<input type="text" name="date">
			<br/>
			<br/>
			Example Course:<select name="courses" multiple>
			<option>java</option>
			<option>Python</option>
			<option>C++</option>
			<option>Django</option>
			<option>Spring Framework</option>
			</select>
			<br/>
			<br/>
			
			
			Select Gender:<input type="radio" name="gender" value="male">male <input type="radio" name="gender" value="female">female 
			<br/>
			<br/>
			
			Select Type:<select name="type">
			<option value="oldstudent">Old Student</option>
			<option value="newstudent">New Student</option>
			
			
			</select>
			
			<br/>
			<br/>
			
			
			<button type="submit">Submit</button>
			
			
			
			
			
		
		
		
		
		
		</form>
</body>
</html>