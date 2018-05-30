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
	        <th>Lista de Ondas Musicales</th>
	      </tr>
	    </thead>
	    <tbody>
	          <g:each in="${OndasMusicales}">
                  <tr>
                    <td>${it.name}</td>
                  </tr>
              </g:each>
	    </tbody>
	  </table>
	</div>

    <br>

	<div id="hoja">
	<form action="saveOndaMusical" method="post">
	  <h4>Add New Onda Music</h4>
	  <div class="form-group">
	    <label for="OndaMusical">new Onda:</label>
	    <input name="onda" type="text" class="form-control" id="OndaMusical">
	  </div>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Registrar</button>
	  </div>
	</form>
	</div>



  </body>
</html>