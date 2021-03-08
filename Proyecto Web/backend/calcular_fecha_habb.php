<?php
    session_start();
    include './database/conexion.php';  
    if ($conexion -> connect_error) {
      die("Connection failed: " . $conexion ->connect_error);
    }
    $fecha = date('Y-m-d', strtotime($_POST['fecha']));
    $sql = "SELECT * FROM calendariohaab WHERE fecha = '".$fecha."'";
    echo $sql;
  
    $resultado = $conexion->query($sql);
    $fechaEncontrada = $resultado->fetch_array(MYSQLI_ASSOC);
    echo 'ID: '.$fechaEncontrada['id'];
    echo '\\nNahual: '.$fechaEncontrada['nahual'];
    echo '\\nWinal: '.$fechaEncontrada['winal'];

    //Cargador
    $sql = "SELECT * FROM cargador WHERE id = '".$fechaEncontrada[id]."'";
    echo '\n'.$sql;
    $resultado = $conexion->query($sql);
    $cargadorEncontrado = $resultado->fetch_array(MYSQLI_ASSOC);

    echo '\nCargador'.$cargadorEncontrado['nombre'];
?>