<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>

<!doctype html> 
<html lang='nl'>

<head>
<title>Frituur Frida</title>
<link rel='icon' href='images/frida.ico'>
<meta name='viewport' content='width=device-width,initial-scale=1'>
<link rel='stylesheet' href='css/frituurFrida.css'>
</head>
<body>
<h1>Frituur Frida</h1>
<h2>${boodschap}</h2>
<h3>${ongeluksgetal}</h3>
<h3>Adres</h3>
<dl>
<dt>Straat<dt><dd>${adres.straat}</dd>
<dt>Huisnr<dt><dd>${adres.huisnr}</dd>
<dt>Gemeente<dt><dd>${adres.gemeente.naam}</dd>
</dl>
<h3>${geluksgetal}</h3>
<img src="images/${boodschap}.png" alt="${boodschap}">

</body>
</html>