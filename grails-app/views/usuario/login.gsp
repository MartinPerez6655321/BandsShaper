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
	    <input name="Email" type="email" pattern="^[a-zA-Z0-9\._-]+@[a-zA-Z0-9-]{2,}[.][a-zA-Z]{2,4}$" class="form-control" id="Email" placeholder="Ingrese su e-mail" required/>
	  </div>
	  <div class="form-group">
	    <label for="Password">Password:</label>
	    <input name="Password" type="password" pattern="^[a-zA-Z0-9]{8,25}$" class="form-control" id="Password" placeholder="Ingrese su contraseña" required/>
	  </div>
	  <br>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Loguearme</button>
	  </div>
	</form>
	</div>

  </body>
</html>
