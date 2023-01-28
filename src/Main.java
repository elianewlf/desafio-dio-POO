import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHorária(8);


        Curso curso2 = new Curso();
        curso2.setTítulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHorária(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrição("descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}