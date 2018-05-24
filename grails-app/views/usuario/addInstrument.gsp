<html>
  <head>
    <meta name="layout" content="Parametrization"/>
  </head>
  <body>

    <ul>
      <g:each in="${instrumentos}">
        <li> ${it.name} </li>
      </g:each>
    </ul>

    <g:form action="saveInstrumento" method="post">
      new Instrumento: <g:field type="text" name="instrument"/><br>
      <g:submitButton name="submit" value="agregar"/>
    </g:form>

  </body>
</html>