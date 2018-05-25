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
	        <th>Lista de Generos Musicales</th>
	      </tr>
	    </thead>
	    <tbody>
	          <g:each in="${generosMusicales}">
                  <tr>
                    <td>${it.name}</td>
                  </tr>
              </g:each>
	    </tbody>
	  </table>
	</div>

    <br>

	<div id="hoja">
	<form action="saveGeneroMusical" method="post">
	  <h4>Add New Gender Music</h4>
	  <div class="form-group">
	    <label for="GenderMusical">new Gender:</label>
	    <input name="gender" type="text" class="form-control" id="GenderMusical">
	  </div>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Registrar</button>
	  </div>
	</form>
	</div>



  </body>
</html>