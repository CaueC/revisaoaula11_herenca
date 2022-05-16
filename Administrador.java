public class Administrador extends Empregados{

    private double ajudaCusto;
    

    public double calcularSalario(double ajudaCusto){
        double salarioLiquido;
        salarioLiquido=calcularSalario()+ajudaCusto;
        return salarioLiquido;
        
    }

}