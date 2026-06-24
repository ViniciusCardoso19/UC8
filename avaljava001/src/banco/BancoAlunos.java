package banco;


/**
 *
 * @author VINICIUSDASILVACARDO
 */

import java.util.ArrayList;
import modelo.Aluno;


public class BancoAlunos {
     public static ArrayList<Aluno> alunos = new ArrayList<>();
     
     public static int idAluno = 1;
     
      static {

        alunos.add(new Aluno(
                idAluno++,
                "Pedro",
                "TDS 25-2N",
                "pedrodewes@gmail.com"
                
            )
        );
         alunos.add(new Aluno(
                 idAluno++,
                "Leomar",
                "TDS 25-2N",
                "leomarjunior@gmail.com"
                
            )
        );}
}

