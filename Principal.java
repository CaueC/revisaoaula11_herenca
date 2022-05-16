public class Principal {
    
    public static void main(String[] args) {

        Empregados empregado = new Empregados();
        Operario operario = new Operario();
        Administrador administrador = new Administrador();

        operario.setSalarioBase(2000);
        administrador.setSalarioBase(3500);
        
        System.out.println(operario.calcularSalario());
        System.out.println(administrador.calcularSalario(100));

        System.out.println(operario.calcularSalario(159));
    }
}
