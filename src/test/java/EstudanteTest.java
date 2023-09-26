import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    @org.junit.jupiter.api.Test
    void testNome() {
        Estudante estudante = new Estudante("Antonio", 12345);

        // O nome deve ser igual ao atribuído na instanciação
        String nome = estudante.getNome();
        assertEquals("Antonio", nome);

        // O nome pode ser redefinido
        estudante.setNome("Maria");
        assertEquals("Maria", estudante.getNome());
    }

    @org.junit.jupiter.api.Test
    void testMatricula() {
        Estudante estudante = new Estudante("Antonio", 12345);

        // A matrícula deve ser igual à atribuído na instanciação
        int matricula = estudante.getMatricula();
        assertEquals(12345, matricula);

        // A matrícula pode ser redefinida
        estudante.setMatricula(12346);
        assertEquals(12346, estudante.getMatricula());
    }
}