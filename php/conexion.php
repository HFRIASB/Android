<?php
$hostname='localhost';
$database='db_distribuidoraaol';
$username='hfriasb';
$password='7415963';

$conexion=new mysqli($hostname,$username,$password,$database);
if($conexion->connect_errno){
    echo "lo sentimos, el sitio web está experimentando problemas";
}
?>