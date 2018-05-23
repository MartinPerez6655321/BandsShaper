<html>
  <head>
    <meta name="layout" content="Parametrization" />
  </head>
  <body>

    <ul>
      <g:each in="${rolesMusicales}">
        <li> ${it.name} </li>
      </g:each>
    </ul>

    <g:form action="saveRolMusical" method="post">
      new Rol Musical: <g:field type="text" name="role"/><br>
      <g:submitButton name="submit" value="agregar"/>
    </g:form>

  </body>
</html>