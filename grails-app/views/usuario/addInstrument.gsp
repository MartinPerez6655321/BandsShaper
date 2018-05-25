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
	        <th>Lista de Instrumentos</th>
	      </tr>
	    </thead>
	    <tbody>
	          <g:each in="${instrumentos}">
                  <tr>
                    <td>${it.name}</td>
                  </tr>
              </g:each>
	    </tbody>
	  </table>
	</div>

    <br>

	<div id="hoja">
	<form action="saveInstrumento" method="post">
	  <h4>Add New Instrument</h4>
	  <div class="form-group">
	    <label for="Instrumento">new Instrument:</label>
	    <input name="instrument" type="text" class="form-control" id="Instrumento">
	  </div>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary btn-block">Registrar</button>
	  </div>
	</form>
	</div>



  </body>
</html>