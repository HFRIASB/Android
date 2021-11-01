<?php
include 'conexion.php';

$nombre=$_POST['nombre'];
$appaterno=$_POST['appaterno'];
$apmaterno=$_POST['apmaterno'];
$ci=$_POST['ci'];
$celular=$_POST['celular'];
$usuarioCliente=$_POST['usuarioCliente'];
$claveCliente=$_POST['claveCliente'];


$consulta="INSERT INTO `usuario` (`id`, `nombre`, `appaterno`, `apmaterno`, `ci`, `celular`, `usuarioCliente`) 
VALUES (NULL, '".$nombre."', '".$appaterno."', '".$apmaterno."', '".$ci."', '".$celular."', '".$usuarioCliente."')";

mysqli_query($conexion,$consulta) or die (mysqli_error());

$consultac="INSERT INTO `cliente` (`usuarioCliente`, `claveCliente`, `estadoCliente`, `idcliente`) 
VALUES ('".$usuarioCliente."', '".$clave."', '1', NULL)";

mysqli_query($conexion,$consultac) or die (mysqli_error());

mysqli_close($conexion);


?>