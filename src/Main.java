import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descricao curso python");
        curso2.setCargaHoraria(3);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("----------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Camila" + devCamila.getConteudosInscrito());
        devCamila.progredir();
        System.out.println("conteudos inscritos Camila" + devCamila.getConteudosInscrito());
        System.out.println("conteudos concluids Camila" + devCamila.getConteudosFinalizados());
        System.out.println(devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println(devCamila.calcularTotalXp());

        System.out.println("----------------------------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos pedro" + devPedro.getConteudosInscrito());
        devPedro.progredir();
        System.out.println("conteudos inscritos pedro" + devPedro.getConteudosInscrito());
        System.out.println("conteudos concluids pedro" + devPedro.getConteudosFinalizados());
        System.out.println(devPedro.calcularTotalXp());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println(devPedro.calcularTotalXp());
        System.out.println("conteudos inscritos pedro" + devPedro.getConteudosInscrito());
        System.out.println("conteudos concluids pedro" + devPedro.getConteudosFinalizados());

    }
}
