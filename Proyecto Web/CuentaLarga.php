<?php 
  $datos = preg_split("[-]", $_GET['date']);
  $y = intval($datos[0]); $m = intval($datos[1]); $d = intval($datos[2]);
  $m += 1;
    if (($m == 1.0 ) || ($m == 2.0 )) {
      $y -= 1.0 ;
      $m += 12.0 ;
    }
    $B = 0.0;
    if (($y > 1582.0 ) || (($y == 1582.0 ) && ($m > 10.0 )) || (($y == 1582.0 ) && ($m == 10.0 ) && ($d > 15.0 ))) {
      $A = intval($y / 100.0 );
      $B = 2.0  - $A + intval($A / 4.0 );
    }
    $jd = intval(365.25  * ($y + 4716.0 )) + intval(30.600100000000001  * ($m + 1.0 )) + $d + $B - 1524.5 ;
    $longCount = round($jd - 584282.5);
    $baktun = floor($longCount / 144000); $longCount %= 144000;
    $katun = floor($longCount / 7200); $longCount %=7200;
    $tun = floor($longCount / 360); $longCount %= 360;
    $uinal = floor($longCount / 20); $longCount %=20;
    $kin = floor($longCount % 20);
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Tiempo Maya</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://kit.fontawesome.com/e51fb510f5.js" crossorigin="anonymous"></script>
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/Calendarios.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
</head>

<body>
<?php include "BarradeNavegacion.php" ?>
<section id="inicio">
<div class="inicio-container">
  <br><br>
  <h1>Cuenta Larga</h1>
  <div class="row">
    <form method="GET" action="backend/convertir.php">
      <div class="col"></div>
      <div class="col d-flex">
          <input type="date" name="date" id="inputDate" value="<?php echo $_GET['date'] ?>" class="form-control" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
		  <div class="btn-group">
          	<button class="btn btn-outline-light" type="submit" value="buscar" id="">Buscar por fecha</button>
		  </div>
      </div>
      <div class="col"></div>
    </form>
  </div>
  <div id='calendar-converter-main'>
		<div id='converter-wrap'>
			<br>
			<div id='converter-aside'>
        <div>
						<h3>Fecha de Cuenta Larga: <span><?php echo ($baktun.".".$katun.".".$tun.".".$uinal.".".$kin) ?></span></h3>
				</div>
				<div id='details'>
					<div class="text-light"><span class='bold lcd-baktuns'><?php echo $baktun ?></span> <strong>baktún</strong><br/><span class='lcd-baktuns'><?php echo $baktun ?></span> X 144.000 días = <span id='lcd-baktuns-days'><?php echo ($baktun*144000) ?></span> días</div>
					<div class="text-light"><span class='bold lcd-katuns'><?php echo $katun ?></span> <strong>katún </strong><br/><span class='lcd-katuns'><?php echo $katun ?></span> X 7.200 días = <span id='lcd-katuns-days'><?php echo ($katun*7200) ?></span> días</div>
					<div class="text-light"><span class='bold lcd-tuns'><?php echo $tun ?></span> <strong>tun</strong><br/><span class='lcd-tuns'><?php echo $tun ?></span> X 360 días = <span id='lcd-tuns-days'><?php echo ($tun*360) ?></span> días</div>
					<div class="text-light"><span class='bold lcd-uinals'><?php echo $uinal ?></span> <strong>uinal</strong><br/><span class='lcd-uinals'><?php echo $uinal ?></span> X 20 días = <span id='lcd-uinals-days'><?php echo ($uinal*20) ?></span> días</div>
					<div class="text-light"><span class='bold lcd-kins'><?php echo $kin ?></span> <strong>k'in</strong><br/><span class='lcd-kins'><?php echo $kin ?></span> X 1 día = <span id='lcd-kins-days'><?php echo ($kin) ?></span> días</div>
          <br>
          <div class="text-light">Con un <strong>total</strong> de: <?php echo (($baktun*144000)+($katun*7200)+($tun*360)+($uinal*20)+$kin) ?> días</div>
				</div><!--details-->
			</div><!--converter-aside-->
			<div class='clear'></div>
		</div><!--converter wrap-->
	</div><!--calendar-converter-main-->
</div>

</section>

<footer id="footer">

  <div class="container">
    <div class="copyright">
      &copy; Copyright <strong>Teoria de Sistemas</strong>. Derechos Reservados
    </div>
  </div>
</footer>
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