<?php if(!isset($_SESSION)) session_start(); ?>
<header id="header">
  <div class="d-flex justify-content-center">
    <nav id="nav-menu-container">
      <ul class="nav-menu">
        <li class="menu-active"> <a href="index.php" style="color: white;font-size: 15px;"><strong>TIEMPO</strong> MAYA</a></li>
        <li><a href="LineaDeTiempo.php">Linea de Tiempo</a></li>
        <li><a href="backend/convertir.php?tipo=haab&date=<?php echo date("Y-m-d") ?>">Calendario Haab'</a></li>
        <li><a href="backend/convertir.php?tipo=cholqij&date=<?php echo date("Y-m-d") ?>">Calendario Cholq'ij</a></li>
        <li><a href="backend/convertir.php?tipo=rueda&date=<?php echo date("Y-m-d") ?>">Rueda Calendarica</a></li>
        <li><a href="backend/convertir.php?date=<?php echo date("Y-m-d") ?>">Cuenta Larga</a></li>
        <li><a href="nahuales.php">Nahuales</a></li>
        <?php 
        if (isset($_SESSION['username'])) { ?>
          <li class="nav-item dropdown">
            <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Opciones
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="perfil.php?username=<?php echo($_SESSION['username']); ?>">Ver perfil</a></li>
              <?php if($_SESSION['rol']==1) { ?><li><a class="dropdown-item" href="#" data-toggle="modal" data-target="#formHecho">Agregar hecho historico</a></li> <?php } ?>
              <li><a class="dropdown-item" href="cerrarSesion.php">Cerrar sesion</a></li>
            </ul>
          </li>
          <?php
        } else{
          ?>
          <li class="nav-item dropdown">
            <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Sesion
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#" data-toggle="modal" data-target="#login">Iniciar Sesion</a></li>
              <li><a class="dropdown-item" href="#" data-toggle="modal" data-target="#register">Registrarse</a></li>
            </ul>
          </li>
        <?php }
        ?>
        <li><a href="#" data-toggle="modal" data-target="#myModal">Acerca de...</a></li>
      </ul>
    </nav>
  </div>
</header>

<!-- Modal -->
<div class="modal" name="myModal" id="myModal" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header justify-content-center">
        <h3 class="modal-title" id="exampleModalLongTitle">Acerca de...</h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div style="margin: 0 auto;">
        <br>
        <h5>Este software fue desarrollado por:</h5>
        <ul>
          <li>1° entregable: Estudiantes de teoría de sistemas</li>
          <li>2° entregable: José Carlos Soberanis Ramírez</li>
        </ul>
        <h5>Con la ayuda de: </h5>
        <ul>
          <li><a href="https://maya.nmai.si.edu/es/calendario/convertidor-de-calendario-maya">Convertidor Tiempo Maya</a></li>
        </ul>
        <h5>Contacto:</h5>
        <ul>
          <li>josecarlos-soberanisramirez@cunoc.edu.gt</li>
        </ul>
        <br>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal" name="login" id="login" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header justify-content-center">
        <h3 class="modal-title" id="exampleModalLongTitle">Iniciar Sesion</h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="form-control">
        <form method="POST" action="./backend/inicioSesion.php">
          <div class="form-group">
            <label for="InputUser">Usuario</label>
            <input placeholder="Username" type="text" name="user" class="form-control" id="InputUser" required aria-describedby="emailHelp" autofocus>
          </div>
          <div class="form-group">
            <label for="InputPass">Contraseña</label>
            <input placeholder="Contraseña" type="password" name="password" minlength="8" class="form-control" required id="InputPass">
          </div>
          <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
        </form>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal" name="register" id="register" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header justify-content-center">
        <h3 class="modal-title" id="exampleModalLongTitle"><?php echo(isset($usuario)?"Editar informacion":"Registrarse")?></h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div>
      <form class="form-control" method="POST" action="./backend/crear_perfil.php">
          <div class="form-group">
            <label for="InputUser"><strong>Usuario</label>
            <br>
            <input type="text" name="user" class="form-control" id="InputUser" placeholder="Usuario" required aria-describedby="userlHelp">
            <br>
            <label for="InputEmail">E-mail</label>
            <br>
            <input type="email" name="email" class="form-control" id="InputEmail" placeholder="E-mail" required aria-describedby="emailHelp">
            <br>
            <label for="InputName">Nombre</label>
            <br>
            <input type="text" name="nombre" class="form-control" id="InputNombre" placeholder="Nombre" required aria-describedby="nombreHelp">
            <br>
            <label for="InputApellido">Apellido</label>
            <br>
            <input type="text" name="apellido" class="form-control" id="InputApellido" placeholder="Apellido" required aria-describedby="apellidoHelp">
            <br>
            <label for="InputContrasenia">Contraseña</label>
            <br>
            <input type="password" name="password" minlength="8" class="form-control" id="InputContrasenia" placeholder="Contraseña" required aria-describedby="passwordHelp">
            <br>
            <label for="InputContrasenia2">Confirmar Contraseña</label>
            <br>
            <input type="password" name="password2" minlength="8" class="form-control" id="InputContrasenia2" placeholder="Contraseña" required aria-describedby="passwordHelp">
            <br>
            <label for="InputNacimiento">Fecha Nacimiento</label>
            <br>
            <input type="date" name="nacimiento" class="form-control" id="InputNacimiento" aria-describedby="nacimientoHelp">
            <br>
            <label for="InputTel">Telefono</label>
            <br>
            <input type="tel" name="tel" class="form-control" id="InputTel" placeholder="Telefono" aria-describedby="telHelp">
          </div>
          <br>
          <button type="submit" class="btn" style="text-align: center; color: black;  margin-left: auto; margin-right: auto;">Registrar</button>
        </form>
      </div>
      <br>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal" name="formHecho" id="formHecho" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header justify-content-center">
        <h3 class="modal-title" id="exampleModalLongTitle">Agregar hecho historico</h3>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="form-control">
        <form method="POST" action="./backend/insertar_hecho.php">
          <div class="form-group">
            <label for="InputUser">Titulo</label>
            <input placeholder="Titulo" type="text" name="titulo" class="form-control" id="InputTitulo" required aria-describedby="emailHelp" autofocus>
          </div>
          <div class="form-group">
            <label for="InputInicio">Fecha Inicio</label>
            <input type="date" name="inicio" class="form-control" id="InputInicio" required>
          </div>
          <div class="form-group">
            <label for="InputFin">Fecha Fin</label>
            <input type="date" name="fin" class="form-control" id="InputFin" required>
          </div>
          <div class="form-group">
            <label for="InputDescripcion">Descripcion</label>
            <textarea name="descripcion" class="form-control" placeholder="Descripcion" rows="10"></textarea>
          </div>
          <button type="submit" class="btn btn-primary">Agregar hecho</button>
        </form>
      </div>
    </div>
  </div>
</div>