<html>
  <head>
    <meta name="layout" content="Parametrization"/>
    <asset:stylesheet src="StyleParametrization.css"/>
  </head>
  <body>


	<div id="tabla">
	  <table class="table table-dark table-striped">
	    <thead>
	      <tr>
	        <th>Lista de Roles Musicales</th>
	      </tr>
	    </thead>
	    <tbody>
	          <g:each in="${rolesMusicales}">
                  <tr>
                    <td>${it.name}</td>
                  </tr>
              </g:each>
	    </tbody>
	  </table>
	</div>

    <br>

	<div id="hoja">
	<form action="saveRolMusical" method="post">
	  <h4>Add New Role Music</h4>
	  <div class="form-group">
	    <label for="RolMusical">new Rol:</label>
	    <input name="role" type="text" class="form-control" id="RolMusical">
	  </div>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Registrar</button>
	  </div>
	</form>
	</div>



  </body>
</html>