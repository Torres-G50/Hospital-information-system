package Hospital;

public class General extends Medico implements Bono{
    
    private int Horas;
    int sueldo;

    public General(int Horas, String nombre, String antiguedad, int id) {
        super(nombre, antiguedad, id);
        this.Horas = Horas;
    }

    @Override
    public void Sueldo_Salario() {
        sueldo = Horas * 100;
        System.out.println("El sueldo del médico general " +getNombre() + " es: $" + sueldo);
    }

   

    @Override
    public void Pago_Bono() {
        double bono = (Horas / 5) * 0.10 * sueldo;
        System.out.println("El pago del bono del médico general " + getNombre() + " es: $" + bono);
    }
    
    public static void main(String[] args) {
        ////////////////////////////////
        General medico1=new General(10, "Mario ochoa", "5 años", 4752977);
        General medico2=new General(7, "Hernesto santos", "12 años", 1537579);
        /////////////////////////////// Tengo el sueldo aparte y el bono aparte.(separados no juntos)
        System.out.println("///////////////////////////////");
        System.out.println("El nombre del medico general es: "+medico1.getNombre());
        System.out.println("Horas trabajadas del medico: "+medico1.getNombre()+" Son: "+medico1.Horas);
        System.out.println("Antiguedad del medico: "+medico1.getAntiguedad());
        System.out.println("Id del medico: "+medico1.getId());
        medico1.Sueldo_Salario();
        medico1.Pago_Bono();
        ///////////////////////////////// Tengo el sueldo aparte y el bono aparte.(separados no juntos)
        System.out.println("////////////////////////////////");
        System.out.println("El nombre del medico general es: "+medico2.getNombre());
        System.out.println("Horas trabajadas del medico: "+medico2.getNombre()+" Son: "+medico2.Horas);
        System.out.println("Antiguedad del medico: "+medico2.getAntiguedad());
        System.out.println("Id del medico: "+medico2.getId());
        medico2.Sueldo_Salario();
        medico2.Pago_Bono();
        /////////////////////////////////
    }
    
    
}
