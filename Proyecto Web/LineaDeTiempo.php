<?php
    session_start();

    //Comprobar que este logueado
    include './backend/database/conexion.php';  
    if ($conexion ->connect_error) {
    die("Connection failed: " . $conexion ->connect_error);
    }
    $sql= "SELECT * FROM hechoHistorico";
    $hechos = $conexion->query($sql);

?>

<!DOCTYPE html>
<html lang="es" dir="ltr">

<head>
    <title>Linea de Tiempo</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

    <style>
        .main-container{
            width: 35%;
            margin: 100px  auto;
            padding: 20px 20px 60px;
            -webkit-box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            -moz-box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            background: rgba(0, 0, 0, 0.3);
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
    <?php include 'BarradeNavegacion.php'; 
        if(empty($hechos)){
    ?>
        <section id="inicio">
            <div class="inicio-container">
                <h1>No hay eventos historicos por listar</h1>
                <button type="button" class="btn btn-outline-light" data-bs-toggle="modal" data-bs-target="#exampleModal">Agregar evento historico</button>
            </div>
        </section>
    <?php } else { ?>
        <section id="inicio">
        <br><br><br>
            <div class="container" style="padding-top: 50px; height=100px;">
            <div style="background: rgba(0, 0, 0, 0.3); vertical-align: middle; ">
                
                <!-- Encabezado -->
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner align-center" style="height: 500px; background: rgba(0, 0, 0, 0.3);">
                    
                        <?php $contador = 0;
                        foreach ($hechos as $hecho) :  ?>
                            <div class="carousel-item <?php echo(($contador==0)?"active":""); $contador++; ?>">
                                <div class="container-fluid">
                                    <div class="row" style="padding-top: 8px;">
                                        <div class="col"></div>
                                        <div class="col-9">
                                            <div class="card bg-light   ">
                                                <div class="card-header container-fluid">
                                                    <div class="row">
                                                        <div class="col-md-10">
                                                            <h4><?php echo($hecho['titulo']) ?></h3>
                                                            <h6><?php echo("Desde ".date("d-m-Y", strtotime($hecho['fechaInicio']))." hasta ".date("d-m-Y", strtotime($hecho['fechaFinalizacion']))) ?></h6>
                                                        </div>
                                                        <div class="col-md-2">
                                                            <?php if(isset($_SESSION['rol'])&&$_SESSION['rol']==1){ ?>
                                                            <form method="POST" action="backend/eliminar_hecho.php">
                                                                <input type="text" name="idHecho" value="<?php echo($hecho['id']) ?>" hidden>
                                                                <button class="btn btn-danger" type="submit">Eliminar</button>
                                                            </form>
                                                            <?php } ?>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="card-body" style="height: 100%;">
                                                    <textarea readonly class="form-control" editable="false" id="w3review" name="w3review" rows="13" cols="50"><?php echo($hecho['descripcion']) ?></textarea>
                                                </div>    
                                            </div>
                                        </div>
                                        <div class="col"></div>
                                    </div>
                                </div>
                            </div>
                        <?php endforeach; ?>

                        <!-- Botones de atras y adelante -->
                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                        </a>

                    </div>
                </div>
            </div>
            </div>
        </section>
    <?php } ?>

    <footer id="footer">
        <div class="container">
            <div class="copyright">
            &copy; Copyright <strong>Teoria de Sistemas</strong>. Derechos Reservados
            </div>
        </div>
    </footer>
</body>