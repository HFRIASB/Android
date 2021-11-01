<?php
include 'conexion.php';
$usuarioCliente=$_POST['usuarioCliente'];
$claveCliente=$_POST['claveCliente'];

/*$usuarioCliente="Ross";
$claveCliente="1234";*/

$sentencia= $conexion->prepare("SELECT * FROM cliente WHERE usuarioCliente=? AND claveCliente=?");
$sentencia->bind_param('ss',$usuarioCliente,$claveCliente);
$sentencia->execute();

$resultado = $sentencia->get_result();
if($fila = $resultado->fetch_assoc()){
            echo json_encode($fila,JSON_UNESCAPED_UNICODE);
}

$sentencia->close();
$conexion->close();
?>