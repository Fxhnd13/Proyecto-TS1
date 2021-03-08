<?php
  session_start();
  // Obtengo los datos cargados en el formulario de login.
  $email = $_POST['user'];
  $password = $_POST['password'];

  //iniciamos sesion en la base de datos
  include_once('./database/conexion.php');

  if ($conexion ->connect_error) {
    die("Connection failed: " . $conexion ->connect_error);
  }

  // Consulta segura para evitar inyecciones SQL.
     $result = mysqli_query($conexion, "SELECT * FROM usuario WHERE username = '$email' AND password = '$password'");
     $usuario = $result->fetch_array(MYSQLI_ASSOC);    
     
     if(mysqli_num_rows($result) == 1){

        $verRango = "SELECT * FROM rol WHERE id = ".$usuario['rol'];
        $rangoRS = mysqli_query($conexion, $verRango);
        $rango = $rangoRS->fetch_array(MYSQLI_ASSOC); 
        $usuario =  $result->fetch_array(MYSQLI_ASSOC);
        $_SESSION['username'] = $email;
        $_SESSION['rango'] = $rango['tipo'];
        $_SESSION['rol'] = $rango['id'];
        // Guardo en la sesión el rango del usuario.
      
        header("Location: ../index.php"); 
      } else {
        $_SESSION['error'] = 1;
        header("Location: ../iniciarSesion.php"); 
      }
?>