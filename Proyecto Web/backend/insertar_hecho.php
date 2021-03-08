<?php
session_start();

include './database/conexion.php';  

if ($conexion -> connect_error) {
  die("Connection failed: " . $conexion ->connect_error);
}

$fechaInicio = $_POST['inicio'];
$fechaFin = $_POST['fin'];

    //guarda hecho historico
    $sql = "INSERT INTO hechohistorico (fechaInicio, fechaFinalizacion, titulo, descripcion) VALUES ('".$fechaInicio."' , '".$fechaFin."',
    '".$_POST['titulo']."', '".$_POST['descripcion']."')";
    echo $sql;
    $resultado = $conexion->query($sql);
    
    $_SESSION['agregado'] = 1;
    header("Location: ../LineaDeTiempo.php"); 
?>