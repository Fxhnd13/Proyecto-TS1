<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://kit.fontawesome.com/e51fb510f5.js" crossorigin="anonymous"></script>
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/Calendarios.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <title>Inicio de Sesion</title>
</head>
<body>
    <style>
        .main-container{
            width: 35%;
            margin: 100px  auto;
            padding: 20px 20px 60px;
            box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            background: rgba(0, 0, 0, 0.5);
            color: black;
        }
        body{
        background: url("./img/fondo.jpg") ;
        background-size: cover;
        }
        .nav-menu > li > a:before {
        background-color: black;
        }
    </style>
    <?php include 'BarradeNavegacion.php'; ?>
    <br><br><br>
    <div class="main-container text-light">
          <form method="POST" action="./backend/inicioSesion.php">
            <div class="form-group">
                <h1 class="text-light" style="text-align: center;">Iniciar Sesión</h1>
            </div>
            <div class="form-group">
              <label for="InputUser">Usuario</label>
              <input placeholder="Username" type="text" name="user" class="form-control" id="InputUser" required aria-describedby="emailHelp">
            </div>
            <div class="form-group">
              <label for="InputPass">Contraseña</label>
              <input placeholder="Contraseña" type="password" name="password" minlength="8" class="form-control" required id="InputPass">
            </div>
            <br>
            <div class="justify-content-center">
              <button type="submit" class="btn btn-primary position-absolute top-0 start-0 translate-middle">Iniciar Sesión</button>
            </div>
          </form>
    </div>

      <!-- Alerta  -->
    <?php if(isset($_SESSION['error'])){ ?>
      <div class="alert alert-danger alert-dismissible fade show" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
        <strong>Error</strong> Al iniciar sesión usuario o contraseña incorrectos!
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
    <?php $_SESSION['error'] = null; } ?>
  
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