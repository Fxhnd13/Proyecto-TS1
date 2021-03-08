<?php
  if (isset($_POST['date'])) {
    $nivel;
    $query;
    include_once 'buscar/conseguir_nahual.php';
    include_once 'buscar/conseguir_energia.php';
    header("location: nahuales.php"."?nahual=".$query."&nivel=".$nivel."#".$query);
  }
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

<?php include "BarradeNavegacion.php" ?>

<body>

<section id="inicio">
  <div class="inicio-container">
    <h1>Nahuales</h1>
    <div class="row">
      <form method="POST" action="nahuales.php">
        <div class="col"></div>
        <div class="col d-flex">
            <input type="date" name="date" id="inputDate" class="form-control" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
            <button class="btn btn-outline-light" type="submit" id="button-addon1">Buscar por fecha</button>
        </div>
        <div class="col"></div>
      </form>
    </div>
    <br>
    <div class="row">
      <a href="#batz" class="btn-get-started">Batz</a>
      <a href="#e" class="btn-get-started">E</a>
      <a href="#aj" class="btn-get-started">Aj</a>
      <a href="#ix" class="btn-get-started">Ix</a>
      <a href="#tzikin" class="btn-get-started">Tzikin</a>
      <a href="#ajmaq" class="btn-get-started">Ajmaq</a>
      <a href="#noj" class="btn-get-started">Noj</a>
      <a href="#tijax" class="btn-get-started">Tijax</a>
      <a href="#kawoq" class="btn-get-started">Kawoq</a>
    </div>
    <div class="row">
      <a href="#ajpu" class="btn-get-started">Ajpu</a>
      <a href="#imox" class="btn-get-started">Imox</a>
      <a href="#iq" class="btn-get-started">Iq</a>
      <a href="#aqabal" class="btn-get-started">Aqabal</a>
      <a href="#kat" class="btn-get-started">Kat</a>
      <a href="#kan" class="btn-get-started">Kan</a>
      <a href="#kame" class="btn-get-started">Kame</a>
      <a href="#kej" class="btn-get-started">Kej</a>
      <a href="#qanil" class="btn-get-started">Qanil</a>
      <a href="#toj" class="btn-get-started">Toj</a>
      <a href="#tzi" class="btn-get-started">Tzi</a>
    </div>
  </div>
</section>

<section id="information">
  <div class="container">
    <br>
    <section id="batz">
      <?php include_once "nahuales/batz.php" ?>
    </section>
    <section id="e">
      <?php include_once 'nahuales/e.php'; ?>
    </section>
    <section id="aj">
      <?php include_once 'nahuales/aj.php' ?>
    </section>
    <section id="ix">
      <?php include_once 'nahuales/ix.php'?>
    </section>
    <section id="tzikin">
      <?php include_once 'nahuales/tzikin.php'?>
    </section>
    <section id="ajmaq">
      <?php include_once 'nahuales/ajmaq.php'?>
    </section>
    <section id="noj">
      <?php include_once 'nahuales/noj.php'; ?>
    </section>
    <section id="tijax">
      <?php include_once 'nahuales/tijax.php'; ?>
    </section>
    <section id="kawoq">
      <?php include_once 'nahuales/kawoq.php'; ?>
    </section>
    <section id="ajpu">
      <?php include_once 'nahuales/ajpu.php'; ?>
    </section>
    <section id="imox">
      <?php include_once 'nahuales/imox.php'; ?>
    </section>
    <section id="iq">
      <?php include_once 'nahuales/iq.php'; ?>
    </section>
    <section id="aqabal">
      <?php include_once 'nahuales/aqabal.php'; ?>
    </section>
    <section id="kat">
      <?php include_once 'nahuales/kat.php'; ?>
    </section>
    <section id="kan">
      <?php include_once 'nahuales/kan.php'; ?>
    </section>
    <section id="kame">
      <?php include_once 'nahuales/kame.php'; ?>
    </section>
    <section id="kej">
      <?php include_once 'nahuales/kej.php'; ?>
    </section>
    <section id="qanil">
      <?php include_once 'nahuales/qanil.php'; ?>
    </section>
    <section id="toj">
      <?php include_once 'nahuales/toj.php'; ?>
    </section>
    <section id="tzi">
      <?php include_once 'nahuales/tzi.php'; ?>
    </section>

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