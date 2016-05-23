<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Campus Digital - formulário de matrícula</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" >Campus digital</a>
                </div>
                <%
                    /*Usuario usuario = (Usuario) session.getAttribute("usuario.logado");
                    String usuariologin = "";
                    if (usuario != null && usuario.getTipo() == Usuario.UsuarioTipo.USUARIO_WEB) {
                        usuariologin = usuario.getLogin();
                    }*/
                %>                      
                <ul class="nav navbar-nav">
                    <li><a href="MarcarAgenda">Marcar exame</a></li>
                        <% //if (usuario != null && (usuario.getTipo() == Usuario.UsuarioTipo.USUARIO_CLINICA || usuario.getTipo() == Usuario.UsuarioTipo.ADM)) {
                             //   usuariologin = usuario.getLogin();
                        %>
                    <li ><a href="Medicos">Médicos</a></li>
                    <li><a href="Exames">Exames</a></li>
                    <li><a href="Agenda">Agenda de exames</a></li>
                        <%//}%>
                        <% //if (usuario != null && usuario.getTipo() == Usuario.UsuarioTipo.ADM) {
                        %>
                    <li><a href="Usuarios">Administração - cadastrar usuários</a></li>
                        <%//}%>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> Usuário logado: <%//=usuariologin%></a></li>
                    <li><a href="FrontController?servlet=logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                </ul>                      

            </div>
        </nav>

        <div class="container">
            <div class="row">
                <h3 class="page-header">Formulário de matrícula</h3>
            </div>
            <div class="row">
                <div class="col-md-6" >
                    teste1
                </div>
            </div>
        </div>


        <footer class="footer">
            <div class="container">
                <p>Copyright © 2016 Rhuan Barros & Diego Szmidtke</p>
            </div>
        </footer>


    </body>
</html>

