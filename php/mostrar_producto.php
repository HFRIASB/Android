<?php
include 'conexion.php';


$sentencia= $conexion->prepare("SELECT codigoProducto,nombreProducto,imagenProducto FROM producto;");
$sentencia->execute();
$sentencia->bind_result($codigoProducto,$nombreProducto,$imagenProducto);


$producto = array();

while($sentencia->fetch()
{
    $temp=array();
    $temp['codigoProducto']=$codigoProducto;
    $temp['nombreProducto']=$nombreProducto;
    $temp['imagenProducto']=$imagenProducto;
    array_push($producto,$temp);
}

echo json_decode($producto);

?>