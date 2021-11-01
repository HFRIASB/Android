<?php
include 'conexion.php';

$codigoProducto=$_POST['codigoProducto'];
$nombreProducto=$_POST['nombreProducto'];
$precioProducto=$_POST['precioProducto'];
$descuentoProducto=$_POST['descuentoProducto'];
$imagenProducto=$_POST['imagenProducto'];



$consulta="INSERT INTO `producto` (`codigoProducto`, `nombreProducto`, `precioProducto`, `descuentoProducto`, `imagenProducto`) 
VALUES ('Tx100c/c', 'Aceite comestible de 100Lts.', '100', '0', 'imagenProducto')";

mysqli_query($conexion,$consulta) or die (mysqli_error());
mysqli_close($conexion);


?>