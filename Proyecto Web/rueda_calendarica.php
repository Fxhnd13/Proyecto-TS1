<?php
  $noCholqijPivote = $_GET['cholqijPivote'];
  $noHaabPivote = $_GET['haabPivote'];
  $fecha= new DateTime($_GET['date']);
  $fechaPivote= new DateTime("2021-02-25");
  $dias = ($fecha->diff($fechaPivote))->days;
  if($fecha > $fechaPivote){
    for ($i = 0; $i < $dias; $i++) {
      if(($noCholqijPivote+21) > 260){
          $noCholqijPivote = 21-(260-$noCholqijPivote);
      }else{
          $noCholqijPivote+=21;
      }
      if(($noHaabPivote+1) > 365){
          $noHaabPivote = 1;
      }else{
          $noHaabPivote++;
      }
    }
  }else{
    for ($i = 0; $i < $dias; $i++) {
      if(($noCholqijPivote < 22)){
          $noCholqijPivote = 260-(21-$noCholqijPivote);
      }else{
          $noCholqijPivote-=21;
      }
      if(($noHaabPivote < 2)){
          $noHaabPivote = 365;
      }else{
          $noHaabPivote--;
      }
    }
  }
  include_once("backend/database/conexion.php");
  $result = mysqli_query($conexion, "SELECT nahual,winal FROM calendariohaab WHERE id='$noHaabPivote'");
  $fechaHaab = $result->fetch_array(MYSQLI_ASSOC);
  $result = mysqli_query($conexion, "SELECT id,nombre FROM nahual WHERE id=".$fechaHaab['nahual']);
  $nahualHaab = $result->fetch_array(MYSQLI_ASSOC);
  $result = mysqli_query($conexion, "SELECT id,nombre FROM winal WHERE id=".$fechaHaab['winal']);
  $winal = $result->fetch_array(MYSQLI_ASSOC);

  $result = mysqli_query($conexion, "SELECT nahual,energia FROM calendariocholqij WHERE id='$noCholqijPivote'");
  $fechaCholqij = $result->fetch_array(MYSQLI_ASSOC);
  $result = mysqli_query($conexion, "SELECT id,nombre FROM nahual WHERE id=".$fechaCholqij['nahual']);
  $nahualCholqij = $result->fetch_array(MYSQLI_ASSOC);
  $result = mysqli_query($conexion, "SELECT id,nombre FROM energia WHERE id=".$fechaCholqij['energia']);
  $energia = $result->fetch_array(MYSQLI_ASSOC);
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
    <h1>Rueda Calendarica</h1>
    <div class="row">
      <form method="GET" action="backend/convertir.php">
        <div class="col"></div>
        <div class="col d-flex">
            <input type="text" name="tipo" value="cuentaLarga" hidden>
            <input type="date" name="date" value="<?php echo $_GET['date'] ?>" id="inputDate" class="form-control" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
            <button class="btn btn-outline-light" type="submit" id="button-addon1">Buscar por fecha</button>
        </div>
        <div class="col"></div>
      </form>
    </div>
    <br>
    <div class="container">
      <div class="row">
        <div class="col"></div>
        <div class="col-8">
          <table class="table text-light">
            <thead>
              <tr>
                <th scope="col" colspan="2">Fecha Cholqij</th>
                <th scope="col" colspan="2">Fecha Haab</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>Energia <?php echo $energia['nombre'] ?></td>
                <td>Nahual <?php echo $nahualCholqij['nombre'] ?></td>
                <td>Kin <?php echo $nahualHaab['nombre'] ?></td>
                <td>Uinal <?php echo $winal['nombre'] ?></td>
              </tr>
              <tr>
                <td><img src="img/numeros/numero<?php echo($energia['id']) ?>.jpg" width="100" height="100"></td>
                <td><img src="img/nahuales/<?php echo($nahualCholqij['id']) ?>.jpg" width="100" height="100"></td>
                <td><img src="img/nahuales/<?php echo($nahualHaab['id']) ?>.jpg" width="100" height="100"></td>
                <td><img src="img/winales/<?php echo($winal['id']) ?>.png" width="100" height="100"></td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class="col"></div>
      </div>
    </div>
    <br>
    <div class="row">
      <a href="#descripcion" class="btn-get-started">Descripción</a>
      <a href="#mecanismo" class="btn-get-started">Mecanismo</a>
      <a href="#correlacion" class="btn-get-started">Correlación Mexica de los Años</a>
    </div>
  </div>
</section>

<section id="descripcion">
  <div class="container">
    
    <div class="row about-container">
      <div class="content order-lg-1 order-2">
        <br>
        <div class="section-header">
          <h3 class="section-title">Rueda Calendarica</h3>
        </div>
        <br>
        <h3 class="section-title" style="  color: #2dc997;">Descripcion</h3>
        <hr>
        <p>
          En los calendarios mesoamericanos, la rueda calendárica, es la combinación del
          ciclo de 260 días (Tzolkin en el Calendario maya, tonalpohualli en el calendario
          mexica) y el de 365 días (Haab en maya, xiuhpohualli en náhuatl, pije en zapoteco)
          que para encajarse tardan un período de más o menos 52 años, 18.980 días (el
          mínimo común múltiplo de 260 y 365).
        </p>
      </div>
    </div>

  </div>
</section>

<section id="mecanismo">
  <div class="container">
    
    <div class="row about-container">
      <div class="content order-lg-1 order-2">
        <br>
        <h3 class="section-title" style="  color: #2dc997;">Mecanismo</h3>
        <hr>
        <p>
        De la Rueda del Calendario, se dice que el ciclo de 52 años es más importante que el
        año.

        Un ejemplo de fecha en la rueda calendárica, 8 Cauac 13 Zip, se referiría al octavo día
        de la trecena Cauac en el Tzolkin, que coincide con el día 13 de Zip en el Haab.

        La diferencia entre los 52 años de 365 días cada uno y los 52 años de 360 días, es de
        260 días exactamente; así se puede llevar el cálculo de sus coincidencias a través de
        ciclos de 260 días, ya que

            ? 18 980 = 73 x 260
            ? 18 720 = 72 x 260
            ? 5 256 = 72 x 73 = 9 x 584.2?

        También debe ser tomado en cuenta que 13 x 360 = 18 x 260 = 4 680.

            ? Es decir, si los 5 días de Uayeb' son omitidos (como debe haber sido el caso en
            los orígenes del calendario), los períodos de 360 y de 260 días coincidirían después
            de, respectivamente, 13 y 18 ciclos (13 "años" de 360 días).

            ? Cuatro de esos ciclos de 13 "años" abarcan 52 "años" de 360 días.

            ? Ahora, 52 veces esos 5 adicionales días de Wayeb' resultan en exactamente uno más
            de los ciclos de 260 días.

        El sistema de la rueda calendárica, sirve para interpretar una sucesión infinita de
        períodos de 52 años. Se desconoce su nombre en lenguas mayenses, pero el nombre en
        idioma náhuatl utilizado por los mexicas era "Xiuhnelpilli", aunque es más usual
        encontrarlo escrito como Xiuhmolpilli, forma gramaticalmente incorrecta;3? cuyo
        significado es anudación de los años.

        Cada 52 años las culturas mesomericanas realizaban importantes ceremonias. Para el
        caso de los mexicas era la llamada "ceremonia del fuego nuevo". | De la Rueda del Calendario, se dice que el ciclo de 52 años es más importante que el
        año.

        Un ejemplo de fecha en la rueda calendárica, 8 Cauac 13 Zip, se referiría al octavo día
        de la trecena Cauac en el Tzolkin, que coincide con el día 13 de Zip en el Haab.

        La diferencia entre los 52 años de 365 días cada uno y los 52 años de 360 días, es de
        260 días exactamente; así se puede llevar el cálculo de sus coincidencias a través de
        ciclos de 260 días, ya que </p>
        <p> • 18 980 = 73 x 260 </p>
        <p> • 18 720 = 72 x 260 </p>
        <p> • 5 256 = 72 x 73 = 9 x 584.2​ </p>
        <p> También debe ser tomado en cuenta que 13 x 360 = 18 x 260 = 4 680. </p>
        <p> • Es decir, si los 5 días de Uayeb' son omitidos (como debe haber sido el caso en
              los orígenes del calendario), los períodos de 360 y de 260 días coincidirían después
              de, respectivamente, 13 y 18 ciclos (13 "años" de 360 días).</p>
      
        <p> • Cuatro de esos ciclos de 13 "años" abarcan 52 "años" de 360 días. </p>
      
        <p> • Ahora, 52 veces esos 5 adicionales días de Wayeb' resultan en exactamente uno más
              de los ciclos de 260 días. </p>

        <p> El sistema de la rueda calendárica, sirve para interpretar una sucesión infinita de
            períodos de 52 años. Se desconoce su nombre en lenguas mayenses, pero el nombre en
            idioma náhuatl utilizado por los mexicas era "Xiuhnelpilli", aunque es más usual
            encontrarlo escrito como Xiuhmolpilli, forma gramaticalmente incorrecta;3​ cuyo
            significado es anudación de los años.

        <p> Cada 52 años las culturas mesomericanas realizaban importantes ceremonias. Para el
            caso de los mexicas era la llamada "ceremonia del fuego nuevo".
        </p>
      </div>
    </div>

  </div>
</section>

<section id="correlacion">
  <div class="container">
    
    <div class="row about-container">
      <div class="content order-lg-1 order-2">
        <br>
        <h3 class="section-title" style="  color: #2dc997;">Correlación mexica de los años</h3>
        <hr>
        <p>La siguiente tabla muestra la correspondencia del ultimo periodo de 52 años, entre los años mexicas y nuestros años.</p>
        <table class="table table-hover">
          <thead class="thead-dark">
            <tr>
              <th scope="col">Tlalpilli Tochtli</th>
              <th scope="col">Tlalpilli Acatl</th>
              <th scope="col">Tlalpilli Tecpatl</th>
              <th scope="col">Tlalpilli Calli</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1 tochtli / 1974</td>
              <td>1 acatl / 1987</td>
              <td>1 tecpatl / 2000</td>
              <td>1 calli / 2013</td>
            </tr>
            <tr>
              <td>2 actal / 1974</td>
              <td>2 tecpatl / 1988</td>
              <td>2 calli / 2001</td>
              <td>2 tochtli / 2014</td>
            </tr>
            <tr>
              <td>3 tecpatl / 1976</td>
              <td>3 calli / 1989</td>
              <td>3 tochtli / 2002</td>
              <td>3 acatl / 2015</td>
            </tr>
            <tr>
              <td>4 calli / 1977</td>
              <td>4 tochtli / 1990</td>
              <td>4 acatl / 2003</td>
              <td>4 tecpatl / 2016</td>
            </tr>
            <tr>
              <td>5 tochtli / 1978</td>
              <td>5 acatl / 1991</td>
              <td>5 tecpatl / 2004</td>
              <td>5 calli / 2017</td>
            </tr>
            <tr>
              <td>6 acatl / 1979</td>
              <td>6 tecpatl / 1992</td>
              <td>6 calli / 2005</td>
              <td>6 tochtli / 2018</td>
            </tr>
            <tr>
              <td>7 tecpatl / 1980</td>
              <td>7 calli / 1993</td>
              <td>7 tochtli / 2006</td>
              <td>7 acatl / 2019</td>
            </tr>
            <tr>
              <td>8 calli / 1981</td>
              <td>8 tochtli / 1994</td>
              <td>8 acatl / 2007</td>
              <td>8 tecpatl / 2020</td>
            </tr>
            <tr>
              <td>9 tochtli / 1982</td>
              <td>9 acatl / 1995</td>
              <td>9 tecpatl / 2008</td>
              <td>9 calli / 2021</td>
            </tr>
            <tr>
              <td>10 acatl / 1983</td>
              <td>10 tecpatl / 1996</td>
              <td>10 calli / 2009</td>
              <td>10 tochtli / 2022</td>
            </tr>
            <tr>
              <td>11 tecpatl / 1984</td>
              <td>11 calli / 1997</td>
              <td>11 tochtli / 2010</td>
              <td>11 acatl / 2023</td>
            </tr>
            <tr>
              <td>12 calli / 1985</td>
              <td>12 tochtli / 1998</td>
              <td>12 acatl / 2011</td>
              <td>12 tecpatl / 2024</td>
            </tr>
            <tr>
              <td>13 tochtli / 1986</td>
              <td>13 acatl / 1999</td>
              <td>13 tecpatl / 2012</td>
              <td>13 calli / 2025</td>
            </tr>
          </tbody>
        </table>
  </div>
</section>

<hr>

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
