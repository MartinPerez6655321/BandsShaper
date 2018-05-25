<html>
  <head>
    <meta name="layout" content="UserHome"/>
    <asset:stylesheet src="StyleRegister.css"/>
  </head>


  <body>

	<div id="hoja">
	<form action="alta" method="post">
	  <h1>Sign up</h1>
	  <div class="form-group">
	    <label for="Name">Name:</label>
	    <input name="Name" type="text" class="form-control" id="Name">
	  </div>
	  <div class="form-group">
	    <label for="LastName">Last Name:</label>
	    <input name="LastName" type="text" class="form-control" id="LastName">
	  </div><div class="form-group">
	    <label for="Email">Email address:</label>
	    <input name="Email" type="email" class="form-control" id="Email">
	  </div>
	  <div class="form-group">
	    <label for="Password">Password:</label>
	    <input name="Password" type="password" class="form-control" id="Password">
	  </div>
	  <br>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Registrarse</button>
	  </div>
	</form>
	</div>

  </body>

</html>
