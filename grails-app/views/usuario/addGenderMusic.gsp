<html>
  <head>
    <meta name="layout" content="Parametrization" />
  </head>
  <body>

    <ul>
      <g:each in="${generosMusicales}">
        <li> ${it.name} </li>
      </g:each>
    </ul>

    <g:form action="saveGeneroMusical" method="post">
      new Genero Musical: <g:field type="text" name="gender"/><br>
      <g:submitButton name="submit" value="agregar"/>
    </g:form>

  </body>
</html>
