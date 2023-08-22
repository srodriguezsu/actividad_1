import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        NumberFormat pesos = NumberFormat.getCurrencyInstance();
        
        float salario_hora = 5000f;
        float retencion = 0.125f;
        float horas_semana = 48;
        float salario_bruto = horas_semana * salario_hora;
        float retencion_fuente = salario_bruto * retencion;
        float salario_neto = salario_bruto -retencion_fuente;

        System.out.println("El salario bruto es: " + pesos.format(salario_bruto) +
                "\nLa retencion del " + (retencion * 100) +"% es: " + pesos.format(retencion_fuente) +
                "\nEl salario neto es: " + pesos.format(salario_neto));
    }
}