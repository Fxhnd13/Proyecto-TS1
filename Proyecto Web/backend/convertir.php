<?php 
    //$fecha = date("Y-m-d");
    if(isset($_GET['tipo'])){ //si tiene un tipo, evaluar cual
        if($_GET["tipo"]=="cholqij"){
            header("location: ../CalendarioCholqij.php?date=".$_GET['date']);
        }else if($_GET['tipo']=="haab"){
            header("location: ../CalendarioHaab.php?date=".$_GET['date']);
        }else{ //es la rueda calendarica
            header("location: ../rueda_calendarica.php?date=".$_GET['date']."&cholqijPivote=38&haabPivote=321");
        }
    }else{ //sino lo tiene es cuenta larga
        header("location: ../CuentaLarga.php?date=".$_GET['date']."&baktun=5&katun=5&tun=5&uinal=5&kin=5");
    }
?>