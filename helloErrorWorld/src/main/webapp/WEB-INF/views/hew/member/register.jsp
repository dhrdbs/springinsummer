<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
   src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<style type="text/css">
.button {
color: #333333;
   background-color: #b8d696;
   border-color: #4e9e31;
}

.button:hover {
color: #fff;
   background-color: #92C350;
   border-color: #92C350;
   
}

.jumbotron {
    margin-bottom: 2rem;
    background-color: #e2efd5;
}

}
</style>


<title>HEW_register</title>
</head>
<body class="bg-light">

   <div class="text-center">
      <div class="row" style="height: 150px;"></div>
      <div
         class="col-sm-8 col-md-5 col-lg-4 mx-auto jumbotron rounded text-center">
         <form action="/examples/actions/confirmation.php" method="post">
            <h2>Register</h2>
            <p class="hint-text">Create your account. It's free and only
               takes a minute.</p>
            <div class="form-group">
               <div class="row">
                  <div class="col-sm-6">
                     <input type="text" class="form-control" name="first_name"
                        placeholder="First Name" required="required">
                  </div>
                  <div class="col-sm-6">
                     <input type="text" class="form-control" name="last_name"
                        placeholder="Last Name" required="required">
                  </div>
               </div>
            </div>
            <div class="form-group">
               <input type="id" class="form-control" name="id" placeholder="id"
                  required="required">
            </div>
            <div class="form-group">
               <input type="email" class="form-control" name="email"
                  placeholder="Email" required="required">
            </div>
            <div class="form-group">
               <input type="password" class="form-control" name="password"
                  placeholder="Password" required="required">
            </div>
            <div class="form-group">
               <input type="password" class="form-control" name="confirm_password"
                  placeholder="Confirm Password" required="required">
            </div>
            <div class="form-group">
               <label class="checkbox-inline"><input type="checkbox"
                  required="required"> I accept the <a href="#">Terms of
                     Use</a> &amp; <a href="#">Privacy Policy</a></label>
            </div>
            <div class="form-group">
               <button type="submit" class="btn button btn-lg btn-block">Register
                  Now</button>
            </div>
         </form>
         <div class="text-center">
            Already have an account? <a href="/">Sign in</a>
         </div>
      </div>
   </div>
   <!-- footer -->
   <footer class="container">
   <hr>
   <p class="float-right">
      <a href="#">Back to top</a>
   </p>
   <p>©2019 Company, Inc. SpringInSummer  · <a href="#">Privacy</a> · <a href="#">Terms</a></p>
   </footer>
</body>
</html>