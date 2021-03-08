<?php 
    
?>
public int nahual(int cont){
        System.out.println("Contador " + cont);
        int contador = cont;
        int contadorNahual = 6;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 20) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                } contador++;
            } return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 20;
            } else {
                contadorNahual--;
            } contador--;
        } return contadorNahual;
        
    }
    
    public int nivel(int cont){
        System.out.println("Contador " + cont);
        int contador = cont;
        int contadorNahual = 4;
        if (contador < 0) {
            while (contador != 0) {
                if (contadorNahual == 13) {
                    contadorNahual = 1;
                } else {
                    contadorNahual++;
                } contador++;
            } return contadorNahual;
        }
        while (contador != 0) {
            if (contadorNahual == 1) {
                contadorNahual = 13;
            } else {
                contadorNahual--;
            } contador--;
        } return contadorNahual;
        
    }
    
    public int timeCholqij(long date){
        try {
            String string = "Nov 15, 2020 00:00:00 AM";
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.ROOT);
            Date datePivote = sdf.parse(string);
//            System.out.println("DATE PIVOTE " + datePivote);
            long regresar = TimeUnit.DAYS.convert(datePivote.getTime() - date, TimeUnit.MILLISECONDS);
            return (int) regresar;
        } catch (ParseException ex) {
            Logger.getLogger(CalcularFecha.class.getName()).log(Level.SEVERE, null, ex);
        } return 1;
    }