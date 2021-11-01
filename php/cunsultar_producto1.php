<?php
 $hostname_localhost ="localhost";
 $database_localhost ="db_distribuidoraaol";
 $username_localhost ="hfriasb";
$password_localhost ="7415963";

 $json=array();


	if(isset($_GET["codigoProducto"])){
		 $codigoProducto=$_GET["codigoProducto"];
				
		 $conexión = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		 $consulta="SELECT codigoProducto,nombreProducto,imagenProducto FROM producto WHERE codigoProducto= '".$codigoProducto."'";
		 $resultado=mysqli_query($conexión,$consulta);
			
		if($registro=mysqli_fetch_array($resultado)){
			 $json['producto'][]=$registro;
		//echo $registro['id'].' - '.$registro['nombre'].' - '.$registro['profesion'].' <br/>»;
		}else{
			 $resultar["codigoProducto"]='no registra';
			 $resultar["nombreProducto"]='no registra';
			 $resultar["imagenProducto"]='no registra';
			 $json['producto'][]=$resultar;
		}
		
		mysqli_close($conexión);
		echo json_encode($json);
	}
	else{
		 $resultar["éxito"]=0;
		 $resultar["message"]='Ws no Retorna';

		 $json['producto'][]=$resultar;

		echo json_encode($json);
	}
?>