import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
    int dia, mes, año;
    dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe un dia: "));
    mes = Integer.parseInt(JOptionPane.showInputDialog("Escribe un mes: "));
    año = Integer.parseInt(JOptionPane.showInputDialog("Escribe un año: "));

    if((dia>=1) && (dia<=30)){  //Si el dia es correcto
        if((mes>=1) && (mes<=12)){ //Si el mes es correcto
            if(año != 0){  //Si el año es correcto
                JOptionPane.showMessageDialog(null, "Fecha correcta");
            }else{
                JOptionPane.showMessageDialog(null,"El año introducido no es correcto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
        }
    }else{
        JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto");
    }
    }
}
