package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.*;

public abstract class Comando {
	
	public abstract void executar(HttpServletRequest request, HttpServletResponse response) 
			throws ClassNotFoundException, IOException, ServletException;
	
	public void verificaLoginEstudante(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuario.logado");
        String usuarioTipo = (String) session.getAttribute("usuario.tipo");
        
        if( usuarioLogado != null && usuarioTipo.equals("estudante") ) { 
        	//usuario logado
            System.out.println("Usuario já logado matricula: "+usuarioLogado.getMatricula() );
        } else {    //usuario nao logado
            System.out.println("ACESSO RESTRITO - Faça login.");
            
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
            return;
        }     
	}
}
