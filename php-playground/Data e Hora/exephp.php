<?php
$data = date ('d/m/Y');
echo "A data �:".$data;

$hora = date ('h:i:s');
echo "<br> e a hora e $hora";

$completa = getdate(time('h:i:s'));
echo"<br>o getdata � ($completa[0])";
$micro=microtime();
echo"<br>e o microtime � ($micro)";
?>
