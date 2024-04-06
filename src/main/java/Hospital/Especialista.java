package Hospital;

public class Especialista extends Medico implements Bono{
    
    private String Especialidad;
     double sueldofijo=25000;

    public Especialista(String Especialidad, String nombre, String antiguedad, int id) {
        super(nombre, antiguedad, id);
        this.Especialidad = Especialidad;
    }

    @Override
    public void Sueldo_Salario() {
        switch (Especialidad) {
            case "Oncologo":
                System.out.println("El sueldo del Medico: " + getNombre() + " es: $" + (sueldofijo * 1.20));
                break;
            case "Radiologo":
                System.out.println("El sueldo del Medico: " + getNombre() + " es: $" + (sueldofijo * 1.30));
                break;
            default:
               System.out.println("El sueldo del médico especialista " + getNombre() + " es: $" + sueldofijo);  
        }
    }

   

    @Override
    public void Pago_Bono() {
        switch (Especialidad) {
            case "Oncologo":
                double bono =(sueldofijo * 1.20)*0.10;
                System.out.println("El pago bono del médico: " + getNombre() + " es: $" + bono);
                break;
            case "Radiologo":
                bono =(sueldofijo * 1.30)*0.10;
                System.out.println("El pago bono del médico: " + getNombre() + " es: $" + bono);
                break;
        }
    }

    
    public static void main(String[] args) {
        /////////////////////////////
        Especialista Medico3=new Especialista("Oncologo", "Ernesto salazar", "7 años", 7527272);
        Especialista Medico4=new Especialista("Radiologo","Fabiola Vazquez", "20 años",2478035);
        /////////////////////////////
        System.out.println("///////////////////////////////");
        System.out.println("El nombre del medico Especialista es: "+Medico3.getNombre());
        System.out.println("La antiguedad del medico: "+Medico3.getNombre()+" Es: "+Medico3.getAntiguedad());
        System.out.println("La Especialidad del medico: "+Medico3.getNombre()+" Es: "+Medico3.Especialidad);
        System.out.println("Id del medico: "+Medico3.getId());
        Medico3.Sueldo_Salario();
        Medico3.Pago_Bono();
        /////////////////////////////
        System.out.println("///////////////////////////////");
        System.out.println("El nombre del medico Especialista es: "+Medico4.getNombre());
        System.out.println("La antiguedad del medico: "+Medico4.getNombre()+" Es: "+Medico4.getAntiguedad());
        System.out.println("La Especialidad del medico: "+Medico4.getNombre()+" Es: "+Medico4.Especialidad);
        System.out.println("Id del medico: "+Medico4.getId());
        Medico4.Sueldo_Salario();
        Medico4.Pago_Bono();
        ////////////////////////////
    }
    
}
