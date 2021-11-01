<?php
 $hostname_localhost="localhost";
 $database_localhost="db_distribuidoraaol";
 $username_localhost="hfriasb";
$password_localhost="7415963";

 $json=array();

	if(isset($_GET["codigoProducto"]) && isset($_GET["nombreProducto"]) && isset($_GET["imagenProducto"]))
	{
		 $codigoProducto=$_GET['codigoProducto'];
		 $nombreProducto=$_GET['nombreProducto'];
		 $precioProducto=$_POST['precioProducto'];
		 $descuentoProducto=$_POST['descuentoProducto'];
		 $imagenProducto=$_GET['imagenProducto'];
		
		 $conexion=mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);
		
		 $insert="INSERT INTO `producto` (`codigoProducto`, `nombreProducto`, `precioProducto`, `descuentoProducto`, `imagenProducto`) 
		 VALUES ('".$codigoProducto."', '".$nombreProducto."', '110', '10' ,'".$imagenProducto."')";
		 

	 
		 $resultado_insert=mysqli_query($conexion,$insert);
		
		if($resultado_insert)
		{
			 $consulta="SELECT * FROM producto WHERE codigoProducto = '".$codigoProducto."'";
			 $resultado=mysqli_query($conexion,$consulta);
			
			if($registro=mysqli_fetch_array($resultado)){
				 $json['producto'][]=$registro;
			}
			mysqli_close($conexion);
			echo json_encode($json);
		}
		else
		{
			 $resulta["codigoProducto"]='No Registra';
			 $resulta["nombreProducto"]='No Registra';
			 $resulta["imagenProducto"]='No Registra';
			 $json['producto'][]=$resulta;
			echo json_encode($json);
		}
		
	}
	else{
			 $resulta["codigoProducto"]='WS No retorna';
			 $resulta["nombreProducto"]='WS No retorna';
			 $resulta["imagenProducto"]='WS No retorna';
			 $json['producto'][]=$resulta;
			echo json_encode($json);
		}

?>