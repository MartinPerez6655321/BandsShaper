<html>
  <head>
    <meta name="layout" content="UserHome"/>
    <asset:stylesheet src="StyleLogin.css"/>
  </head>
  <body>

	<div id="hoja">
	<form action="logueo" method="post">
	  <h1>Login</h1>
	  <div class="form-group">
	    <label for="Email">Email address:</label>
	    <input name="Email" type="email" class="form-control" id="Email">
	  </div>
	  <div class="form-group">
	    <label for="Password">Password:</label>
	    <input name="Password" type="password" class="form-control" id="Password">
	  </div>
	  <br>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Loguearme</button>
	  </div>
	</form>
	</div>

  </body>
</html>
