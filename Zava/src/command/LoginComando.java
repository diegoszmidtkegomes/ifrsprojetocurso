package command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
import models.*;

public class LoginComando extends Comando {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, IOException, ServletException {
		String matricula_s = request.getParameter("matricula");
        String senha = request.getParameter("senha");

        HttpSession session = request.getSession();
        
        List<Estudante> estudantes = Dao.getEstudantes();
        int matricula = Integer.parseInt( matricula_s );
        
        for( Estudante e: estudantes ) {
            if( e.getMatricula() == matricula && e.getSenha().equals(senha) ) {
                session.setAttribute("usuario.logado", e);
                session.setAttribute("usuario.tipo", "estudante");
                System.out.printf("Usuario %s logado", e.getNome() );
                
                Comando formularioMatricula = new FormularioMatriculaComando();
                formularioMatricula.executar(request, response);
                return;
            }
        }
        
        //fazer login para professores tbm
        
        System.out.println("login e/ou senhas incorreto");
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?msg=loginerror");
        rd.forward(request, response);
        return;

	}

}
