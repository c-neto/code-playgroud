<?php
$x		= $_GET ["x"];
$v		= "vitamina";

switch ($x) {

 case "ma�a":
 echo "$v A ";
 break;

 case "laranja":
 echo "$v B";
 break;

 case "bolo":
 echo "$v C";

 break;

default:
echo "n�o possui nutrientes";
}
?> 




