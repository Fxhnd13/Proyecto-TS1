<?php 
    $conexion = new mysqli("localhost", "root", "josecarlos", "calendariomaya");
    $sql = "SELECT * FROM usuario WHERE username='".$_GET['username']."' LIMIT 1;";
    $resultado = $conexion->query($sql);
    $usuario;
    foreach($resultado as $fila) $usuario=$fila;
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Tiempo Maya</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <link href="css/Perfil.css" rel="stylesheet">


</head>

<body>
<?php include "BarradeNavegacion.php" ?>
<section id="inicio">
    <div class="inicio-container">
        <div class="col"></div>
        <div class="col-8">
            <div class="container card">
                <div class="row">
                    <div class="container-fluid">
                        <br>
                        <h3>Nombre:  <?php echo $usuario['nombre']." ".$usuario['apellido']?></h3>
                        <h4>Contacto:  <?php echo $usuario['email'] ?> </h4>
                    </div>
                </div>
                <div class="row">
                    <div class="container-fluid">
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Informacion</a>
                            </li>
                        </ul>
                        <div class="tab-content profile-tab" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <br>
                                <div class="row">
                                <div class="col-md-7">
                                    <div class="row">
                                        <div class="col-md-1"></div>
                                        <div class="col-md-4">
                                            <label>Nombre(s): </label>
                                        </div>
                                        <div class="col-md-7">
                                            <p><?php echo $usuario['nombre'] ?></p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-1"></div>
                                        <div class="col-md-4">
                                            <label>Apellido(s): </label>
                                        </div>
                                        <div class="col-md-7">
                                        <p><?php echo $usuario['apellido'] ?></p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-1"></div>
                                        <div class="col-md-4">
                                            <label>Correo: </label>
                                        </div>
                                        <div class="col-md-7">
                                        <p><?php echo $usuario['email'] ?></p>
                                        </div>
                                    </div>
                                    <?php if(isset($usuario['telefono'])){ ?>
                                        <div class="row">
                                            <div class="col-md-1"></div>
                                            <div class="col-md-4">
                                                <label>Telefono: </label>
                                            </div>
                                            <div class="col-md-7">
                                            <p><?php echo $usuario['telefono'] ?></p>
                                            </div>
                                        </div>
                                    <?php } ?>
                                    <?php if(isset($usuario['nacimiento'])){ ?>
                                        <div class="row">
                                            <div class="col-md-1"></div>
                                            <div class="col-md-4">
                                                <label>Nacimiento: </label>
                                            </div>
                                            <div class="col-md-7">
                                            <p><?php echo $usuario['nacimiento'] ?></p>
                                            </div>
                                        </div>
                                    <?php } ?>
                                </div>
                                <?php if($usuario['username']===$_SESSION['username']){ ?>
                                    <div class="col-md-4">
                                    <br>
                                    <h6>Opciones:</h6>
                                    <ul>
                                        <form action="editar_perfil.php" method="post">
                                            <input type="text" name="username" value="<?php echo $usuario['username'] ?>" hidden>
                                        <li>
                                            <button class="btn btn-link" type="submit" name="accion" value="editar">Editar Informacion</button>
                                        </li>
                                        </form>
                                        <li>
                                        <button class="btn btn-link" data-toggle="modal" data-target="#EliminarCuenta">Eliminar Perfil</button>
                                        </li>
                                    </ul>
                                    </div>
                                <?php } ?>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col"></div>
    </div>
</section>

  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="lib/superfish/hoverIntent.js"></script>
  <script src="lib/superfish/superfish.min.js"></script>
  <script src="js/main.js"></script>

</body>
</html>