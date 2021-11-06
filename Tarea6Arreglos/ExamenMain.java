/**
 * Programa ejecutable de examen. 
 *
 * @author Andrea Alvarado Camacho
 * @version 1.0
 */
public class ExamenMain{
    public static void main(String []pps){
        String[] nombres = {"Doc","Timido","Estornudo","Tontin","Gruñon","Feliz","Dormilon"};
        Examen examencito = new Examen(nombres);

        examencito.dividirGrupo();
        examencito.imprimeExaA();
        examencito.imprimeExaB();
        examencito.enReversa();
        examencito.imprimeParejas();
    }
}