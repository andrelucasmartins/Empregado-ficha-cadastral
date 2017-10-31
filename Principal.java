public class Principal {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("João José", "111.222.333-4", "Supervisor");
        Empregado e2 = new Empregado("Maria Aparecida", "444.333.222-11", "Gerente", 8500.00);
        
        e1.fichaCadastral();
        e2.fichaCadastral();
        
        e1.setSalario(6500.00);
        
        e1.setValeRefeicao(true);
        e1.setPlanoSaude(false);
        
        e2.setValeRefeicao(true);
        e2.setPlanoSaude(true);
        
        e1.fichaCadastral();
        e2.fichaCadastral();
        
        Empregado e3 = new Empregado("Antônio Carlos", "777.666.222-09", "Diretor", 15000.00);
        e3.setValeRefeicao(true);
        e3.setPlanoSaude(true);
        
        e1.fichaCadastral();
        e2.fichaCadastral();
        e3.fichaCadastral();
        
        Empregado e4 = new Empregado("Pedro Malazarte", "090.565.701-01", "Engenheiro", 125000.00);
        e4.setValeRefeicao(true);
        e4.setPlanoSaude(false);
        e4.setDependente(2);
        
        e4.fichaCadastral();
    }
}
